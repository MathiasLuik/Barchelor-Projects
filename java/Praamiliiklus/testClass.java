package praamiliiklus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pilet piletike1 = new pilet("11:20 20.01", "heltermaa", "reisijapilet", 1);
		System.out.println(piletike1);
		pilet piletike2 = new pilet("13:20 20.01", "hiiu", "oppuripilet", 1);
		System.out.println(piletike2);
		pilet piletike3 = new pilet("11:20 20.01", "heltermaa", "oppuripilet", 1);
		System.out.println(piletike3);
		pilet piletike4 = new pilet("13:20 20.01", "hiiu", "oppuripilet", 1);
		System.out.println(piletike4);
		pilet piletike5 = new pilet("11:20 20.01", "heltermaa", "oppuripilet", 1);
		System.out.println(piletike5);
		transport transport1 = new transport("13:20 20.01", "hiiu", "reisijapilet", 3, true, "ratas", "aaa 111", 0);
		transport transport2 = new transport("11:20 21.01", "heltermaa", "oppuripilet", 3, true, "auto", "bbb 111", 1);
		transport transport3 = new transport("13:20 22.01", "hiiu", "pensionär", 4, true, "n2", "ccc 111", 2);
		transport transport4 = new transport("11:20 23.01", "heltermaa", "reisijapilet", 10, true, "buss", "ddd 111",
				4);
		transport transport5 = new transport("13:20 24.01", "hiiu", "oppuripilet", 1, true, "mootorratas", "eee 111",
				1);
		transport transport6 = new transport("11:20 25.01", "heltermaa", "oppuripilet", 30, true, "buss", "fff 111", 4);
		System.out.println(transport1);
		System.out.println(transport2);
		System.out.println(transport3);
		System.out.println(transport4);
		System.out.println(transport5);
		System.out.println(transport6);
		kohalik kohalikuke = new kohalik("13:20 20.01", "hiiu", "reisijapilet", 1, 393000000, "hiiu");
		kohalik kohalikuke2 = new kohalik("11:20 20.01", "heltermaa", "oppuripilet", 1, 393000001, "hiiu");
		kohalik kohalikuke3 = new kohalik("13:20 20.01", "hiiu", "reisijapilet", 1, 393000002, "hiiu");
		kohalik kohalikuke4 = new kohalik("11:20 20.01", "heltermaa", "pensionär", 1, 393000003, "hiiu");
		System.out.println(kohalikuke);
		System.out.println(kohalikuke2);
		System.out.println(kohalikuke3);
		System.out.println(kohalikuke4);
		// ArrayList<long> list1 = new ArrayList<long>();
		// list1.add(231456126);
		ArrayList list1 = new ArrayList();
		list1.add(piletike1);
		list1.add(piletike2);
		list1.add(piletike3);
		list1.add(piletike4);
		list1.add(piletike5);
		list1.add(transport1);
		list1.add(transport2);
		list1.add(transport3);
		list1.add(transport4);
		list1.add(transport5);
		list1.add(transport6);
		list1.add(kohalikuke);
		list1.add(kohalikuke2);
		list1.add(kohalikuke3);
		list1.add(kohalikuke4);
		System.out.println("Nimekiri kõigist: " + list1);

		ArrayList massilist = new ArrayList();
		massilist.add(transport1.getKaal());
		massilist.add(transport2.getKaal());
		massilist.add(transport3.getKaal());
		massilist.add(transport4.getKaal());
		massilist.add(transport5.getKaal());
		massilist.add(transport6.getKaal());

		double uba1 = transport1.getKaal();
		double uba2 = transport2.getKaal();
		double uba3 = transport3.getKaal();
		double uba4 = transport4.getKaal();
		double uba5 = transport5.getKaal();
		double uba6 = transport6.getKaal();
		ArrayList<Double> massilistkokku = new ArrayList();
		massilistkokku.add(uba1);
		massilistkokku.add(uba2);
		massilistkokku.add(uba3);
		massilistkokku.add(uba4);
		massilistkokku.add(uba5);
		massilistkokku.add(uba6);

		double sum = 0;
		int i;
		for (i = 1; i < massilistkokku.size(); i++) {
			sum += massilistkokku.get(i);
		}

		System.out.println("kaal: " + massilist + " ning siin on kogumass kaptenile: " + sum + " tonni");

		File fail = new File("/home/mathias/tekst.csv");

		if (fail.exists()) {
			System.out.println("Fail isikukoodide ja piletite jaoks on ilusti õiges folderis");

		} else {
			System.out.println("Fail isikukoodide ja piletite jaoks ei ole õiges folderis");

		}
		testClass obj = new testClass();
		obj.run();

	}

	public void run() {

		String csvFile = "user.home";
		// String csvFile = "/home/mathias/tekst.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		int lineNumber = 0;
		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] country = line.split(cvsSplitBy);
				if (lineNumber == 0) {
					lineNumber++;
					continue;
				}
				lineNumber++;
				System.out.println("Country [code= " + country[0] + ", Number nimekirjas: " + lineNumber
						+ " ja siia tuleb isikukood" + country[1] + "]");

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("Ülevaade laevast täielikult teine toodud");

	}

}
