package hw6;

public class Sconcat {

	public static void main(String[] args) {
	String str1 = "Education is the most powerfull weapon wich yo can use to change the word.";
	String str2 = "An investment in knowledge pays the best interest.";
	int fuse = str1.indexOf("use");
	int luse = "use".length();
	int fknowledge = str2.indexOf("knowledge");
	int lknowledge = "knowledge".length();
	System.out.println(str1.substring(fuse,fuse+luse)+" "
			+str2.substring(fknowledge,fknowledge+lknowledge)+" "
			+str1.substring(str1.indexOf("to"),str1.length()-1));

	}

}
