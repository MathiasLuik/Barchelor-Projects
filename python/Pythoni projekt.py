from tkinter import*
from tkinter.ttk import*
from tkinter.messagebox import showinfo
from tkinter.filedialog import askopenfilename
    
def ava_fail():
    """
    Loeb küsitud failist punkti koordinaate
    """
    fail = open(askopenfilename())
    #Tekitab x ja y hulgad
    xlist = []
    ylist = []
    #Veakontroll
    fail.readline()
    try:
        for rida in fail.readlines():
            x,y = rida.split(",")
            x = float(x.strip())
            y = float(y.strip())
            xlist.append(x)
            ylist.append(y)
    except:
        showinfo(title = "Veateade", message =  "Probleem failist lugemisel")
    return xlist, ylist

def kirjuta():
    global c
    # x-telg
    c.create_line(57, 550, 590, 550)
    # y-telg
    c.create_line(70, 575, 70, 60)
    # y-telje max-punkti kriips
    c.create_line(70, 110, 60, 110)
    # x-telje max-punkti kriips
    c.create_line(570, 550, 570, 557)
    # Telgede tekst
    xlist, ylist = ava_fail()
    ymax = max(ylist)
    xmax = max(xlist)
    ymin = min(ylist)
    xmin = min(xlist)
    lbl = Label(root, text = "x")
    lbl.place(x = 595, y = 537)
    lbl = Label(root, text = xmin)
    lbl.place(x = 60, y = 560)
    lbl = Label(root, text = ymax)
    lbl.place(x = 30, y = 97)
    lbl = Label(root, text = "y")
    lbl.place(x = 65, y = 30)
    lbl = Label(root, text = ymin)
    lbl.place(x = 20, y =537)
    lbl = Label(root, text = ymax)
    lbl.place(x = 30, y = 97)
    lbl = Label(root, text = xmax)
    lbl.place(x = 545, y = 560)
    #ringid
    ry = 440/(max(ylist)-min(ylist))
    rx = 500/(max(xlist)-min(xlist))
    for i in range (len(xlist)):
        c.create_oval(abs(xlist[i]*rx)+67, abs(ry*(ylist[i]))+107, abs(xlist[i]*rx)+73, abs(ry*(ylist)[i])+113)


#Kasutajaliidese juureobjekt
root = Tk()
root.title("Projekti ülesanne")
root.geometry("700x650")
root.rowconfigure(0, weight = 1)
root.columnconfigure(0, weight = 1)

#Raam
f = Frame(root)
f.grid(row = 1, column = 0)

#Lõuend
c = Canvas(root)
c.grid(row = 0, column = 0, sticky = ("N, S, W, E"))

#Nupp "Ava fail"
b_ava = Button(f, text = "Ava fail", command = kirjuta)
b_ava.grid(column = 0, row = 0)

#Juureobjekti käivitamine
root.mainloop()
