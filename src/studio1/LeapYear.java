package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		boolean leap;
		System.out.println("What year is it?");
		int year = in.nextInt();
		leap =  (((year%4 == 0) && (year%100 != 0)) || ((year%400 == 0) && (year%4 == 0)));
		System.out.println(leap);
		
		// TODO Auto-generated method stub

	}

}
