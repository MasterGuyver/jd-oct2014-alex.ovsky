package hw6;

public class Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"Kuraev, Igor","Molotov, Sergey","Ovsky, Sasha","Motorny, Sasha"};
		String[] subject = {"Math, 32","History, 16", "Biology, 16", "Materials, 32"};
		int[][] otm = {{0,0,3},{1,0,5},{1,1,3},{2,0,5}};
		printObject(name, subject, otm);
	}
	static void printObject(String[] nam, String[] sub, int[][] ocen) {
		for(int[] met: ocen) {
			for(int i=0; i<met.length-2; i++)
				System.out.println(nam[met[i]]+" "+sub[met[i+1]]+" "+met[i+2]);
		}
	}
}
