package hw7;

import java.util.Arrays;

public class Birds {

	public static void main(String[] args) {
		String[] typeBirds = new String[] { "Eagle", "Duck", "Quail" }, priceBirds = new String[] {
				"$5", "$3", "$4" };
		int[] numberType = new int[] { 5, 3, 7 }, numberBirds = new int[] { 1,
				15, 5 };
		typeBirds = addStr(typeBirds, "Geese");
		numberType = addNumber(numberType, 2);
		priceBirds = addStr(priceBirds, "$2");
		numberBirds = addNumber(numberBirds, 3);
		printBirds(typeBirds, numberType, priceBirds, numberBirds);
		System.out.println("How many Birds sold: " + howManyBirds(numberBirds));
		System.out.println("How many " + "Duck: "
				+ howManyType(typeBirds, numberType, "Duck"));
		System.out.print("Birds less three: ");
		System.out.println(Arrays.toString(lessThree(typeBirds, numberType)));
		System.out.println("Type Bird max sold: "
				+ maxSold(typeBirds, numberBirds));
		System.out.println("Profit sales: " + profitSales(priceBirds));
		System.out.println("Bird with minimal profit sale: "
				+ minProfit(typeBirds, priceBirds));
		printBird(typeBirds, numberType, priceBirds, numberBirds, "Duck");
		typeBirds = deleteStr(typeBirds, "Geese");
		priceBirds = deleteStr(priceBirds, 3);
		numberType = deleteNumber(numberType, 3);
		numberBirds = deleteNumber(numberBirds, 3);
		printBirds(typeBirds, numberType, priceBirds, numberBirds);

	}

	// Добавление строки к заданному массиву, массив может быть и null
	static String[] addStr(String[] type, String name) {
		String[] mass = null;
		if (type != null && type.length != 0) {
			mass = new String[type.length + 1];
			int i = 0;
			for (String temp : type)
				if (name.equals(temp)) {
					mass = type;
					break;
				} else
					mass[i++] = temp;
			mass[i++] = name;
		} else {
			mass = new String[1];
			mass[0] = name;
		}
		return mass;
	}

	// Добавление числа к заданному массиву,
	// использую для формирования количества птиц и количества проданных птиц
	static int[] addNumber(int[] numbers, int nmb) {
		int[] mass = null;
		if (numbers != null && numbers.length != 0) {
			mass = new int[numbers.length + 1];
			int i = 0;
			for (int temp : numbers)
				if (nmb == temp) {
					mass = numbers;
					break;
				} else
					mass[i++] = temp;
			mass[i++] = nmb;
		} else {
			mass = new int[1];
			mass[0] = nmb;
		}
		return mass;
	}

	// Удаление строки по имени
	static String[] deleteStr(String[] type, String name) {
		String[] mass = null;
		if (type != null && type.length > 0) {
			mass = new String[type.length - 1];
			int i = 0;
			for (String temp : type)
				if (name.equals(temp))
					continue;
				else
					mass[i++] = temp;
		}
		return mass;
	}

	// Удаление строки по индексу
	static String[] deleteStr(String[] type, int index) {
		String[] mass = null;
		if (type != null && type.length > 0 && index > -1
				&& index < type.length) {
			mass = new String[type.length - 1];
			int i = 0;
			for (String temp : type)
				if (i != index)
					mass[i++] = temp;
		}
		return mass;
	}

	// Удаление числа по имени
	static int[] deleteNumber(int[] numbers, int index) {
		int[] mass = null;
		if (numbers != null && numbers.length > 0 && index > -1
				&& index < numbers.length) {
			mass = new int[numbers.length - 1];
			int i = 0;
			for (int temp : numbers)
				if (i != index)
					mass[i++] = temp;
		}
		return mass;
	}

	// Печать всей информации о птицах в магазине
	static void printBirds(String[] typeB, int[] nmt, String[] priceB, int[] nmb) {
		if (typeB.length != 0 && typeB != null) {
			System.out
					.println("Name         Price          Particular type of birds       The number of birds sold ");
			for (int i = 0; i < typeB.length; i++)
				System.out.println(typeB[i] + "          " + priceB[i]
						+ "                   " + nmt[i]
						+ "                              " + nmb[i]);
		}
	}

	// Печать информации о птице по имени
	static void printBird(String[] typeB, int[] nmt, String[] priceB,
			int[] nmb, String name) {
		if (typeB.length != 0 && typeB != null) {
			System.out
					.println("Name         Price          Particular type of birds       The number of birds sold ");
			for (int i = 0; i < typeB.length; i++)
				if (name == typeB[i]) {
					System.out.println(typeB[i] + "          " + priceB[i]
							+ "                   " + nmt[i]
							+ "                              " + nmb[i]);
					break;
				}
		}
	}

	// Печать информации о птице по индексу
	static void printBird(String[] typeB, int[] nmt, String[] priceB,
			int[] nmb, int index) {
		if (typeB.length != 0 && typeB != null) {
			System.out
					.println("Name         Price          Particular type of birds       The number of birds sold ");
			if (index > -1 && index < typeB.length)
				System.out.println(typeB[index] + "          " + priceB[index]
						+ "                   " + nmt[index]
						+ "                              " + nmb[index]);
		}
	}

	// Сколько продано птиц
	static int howManyBirds(int[] numBird) {
		if (numBird != null && numBird.length != 0) {
			int sum = 0;
			for (int many : numBird)
				sum += many;
			return sum;
		}
		return -1;
	}

	// Сколько птиц определенного типа в наличии
	static int howManyType(String[] typeB, int[] numType, String name) {
		if (typeB != null && typeB.length != 0 && numType.length != 0
				&& numType != null)
			for (int i = 0; i < typeB.length; i++)
				if (name.equals(typeB[i]))
					return numType[i];
		return -1;
	}

	// Каких птиц меньше трех
	static String[] lessThree(String[] typeB, int[] numType) {
		String[] mass = null;
		if (numType != null && numType.length != 0)
			for (int i = 0; i < numType.length; i++)
				if (numType[i] < 3)
					mass = addStr(mass, typeB[i]);
		return mass;
	}

	// Какой тип птицы продается больше всего
	// (в случае одинакового числа максимальных продаж выводится первый из
	// типов)
	static String maxSold(String[] typeB, int[] numB) {
		if (numB != null && numB.length != 0) {
			int max = numB[0], flag = 0;
			for (int i = 1; i < numB.length; i++) {
				if (max < numB[i]) {
					max = numB[i];
					flag = i;
				}
			}
			return typeB[flag];
		}
		return "";
	}

	// Перевод денег в число
	static int convertMoney(String money) {
		return Integer.parseInt(money.substring(1, money.length()));
	}

	// Прибыль со всех продаж
	static String profitSales(String[] priceB) {
		if (priceB != null && priceB.length != 0) {
			int sum = 0;
			for (String prc : priceB)
				sum += convertMoney(prc);
			return "$" + sum;
		}
		return "";
	}

	// Какая из птиц дешевле всех по цене
	static String minProfit(String[] typeB, String[] priceB) {
		if (priceB != null && priceB.length != 0) {
			int min = convertMoney(priceB[0]);
			int temp, flag = 0;
			for (int i = 2; i < priceB.length; i++) {
				temp = convertMoney(priceB[i]);
				if (temp < min) {
					min = temp;
					flag = i;
				}
			}
			return typeB[flag];
		}
		return "";
	}

}
