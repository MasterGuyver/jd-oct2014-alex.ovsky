package hw5;

public class Printarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] a = { {}, {} };
		String[][] b = { { "Oleg" }, { "Inna", "Smith", "25" },
				{ "Irina", "Koval" } };
		String[][] c = { {}, { "Oleg", "kotov", "16" }, {} };
		String[][] d = { { "Oleg" }, { "Anton" }, null, { "Anna", "25" } };
		printArray(a);
		printArray(b);
		printArray(c);
		printArray(d);
	}

	static void printArray(String[][] data) {
		String[] mass = null;
		for (int i = 0; i < data.length; i++) {
			if (data[i] != null) {
				mass = data[i];
				for (String s : mass) {
					if (s != null)
						System.out.print(s + " ");
				}
				System.out.println();
				mass = null;
			}
		}
	}
}
