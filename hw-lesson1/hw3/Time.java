package hw3;

public class Time {

	public static void main(String[] args) {
	long sec = System.currentTimeMillis()/1000;
	System.out.println("Days "+sec/24/60/60);
	sec = sec%(24*60*60);
	System.out.println("Hours "+sec/3600);
	sec = sec % 3600;
	System.out.println("Minutes "+sec/60);
	sec = sec % 60;
	System.out.println("Seconds "+sec);
	}

}
