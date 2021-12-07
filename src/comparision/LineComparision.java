package comparision;

import java.util.Scanner;

public class LineComparision {
	public static void main(String[] args) {
		System.out.println("enter the values of line 1:");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the value of x1");
		int x1 = scanner.nextInt();
		System.out.println("enter the value of x2");
		int x2 = scanner.nextInt();
		System.out.println("enter the value of y1");
		int y1 = scanner.nextInt();
		System.out.println("enter the value of y2");
		int y2 = scanner.nextInt();
	
		System.out.println("enter the values of line 2:");
		System.out.println("enter the value of a1");
		int a1 = scanner.nextInt();
		System.out.println("enter the value of a2");
		int a2 = scanner.nextInt();
		System.out.println("enter the value of b1");
		int b1 = scanner.nextInt();
		System.out.println("enter the value of b2");
		int b2 = scanner.nextInt();
		
		double length1 = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		System.out.println("length = " + length1);
		
		double length2 = Math.sqrt(Math.pow((a2-a1),2) + Math.pow((b2-b1),2));
		System.out.println("length = " + length2);
		
		if (length1 == length2) {
			System.out.println("two lengths are equal");
		}
		else if (length1 > length2 ){
			System.out.println("line 1 is greater than line 2 ");
		}
		else {
			System.out.println("line 2 is greater than line 1 ");
		}
				
	}

}
