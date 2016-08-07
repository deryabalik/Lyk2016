package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class Array {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir değer giriniz ");
		String inputString = input.next();
		String[] erey5 = new String[10];
		int counter = 0;
		while(!inputString.equals("çıkış")){
			System.out.println("Bir değer giriniz :");
			if(! inputString.equals("çıkış"))
			{
				erey5[counter]=inputString;
			}
			inputString = input.next();
			
			counter++;
		}
		for(int i=0;i<erey5.length;i++){
			System.out.println("Arrayın " +i+ "inci elemanı" +erey5[i]);
		}
	}

}
