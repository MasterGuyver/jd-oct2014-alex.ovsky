package hw2;

import java.util.Arrays;

public class Copyarray {

	public static void main(String[] args) {
		int[] c = {5,67,-8,3,7,0};
		int[] b ={3,0,12,5,7};
	copyArray(c,2,b,1,3);
	System.out.println(Arrays.toString(b));
	}
	static void copyArray(int[] src,int srcPos,int[] dest,int destPos, int length) {
		if(src!=null && dest!=null && srcPos>=0 && srcPos<src.length && destPos>=0 && destPos<dest.length 
		&& length>0 && length<=src.length && length>0 && length<=dest.length) 
		for(int i=0; i<length; i++)
			dest[destPos+i]=src[srcPos+i];
}
}
