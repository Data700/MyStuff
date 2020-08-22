/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steve
 */
public class Arithmatic 
    {
	public static void main(String[] args)
			{
				int a = 5;
				int b = 8;
				displayNumberPlus10(a, b);
				displayNumberPlus100(a, b);
				displayNumberPlus1000(a, b);
			}
		public static void displayNumberPlus10(int a, int b)
			{
				System.out.println("Integer a is " + a + " and integer b is " + b);
				System.out.println(a + " + 10 = " + (a + 10));
				System.out.println(b + " + 10 = " + (b + 10));
			}
		public static void displayNumberPlus100(int a, int b)
			{
				System.out.println("Integer a is " + a + " and integer b is " + b);
				System.out.println(a + " + 100 = " + (a + 100));
				System.out.println(b + " + 100 = " + (b + 100));
			}
		public static void displayNumberPlus1000(int a, int b)
			{
				System.out.println("Integer a is " + a + " and integer b is " + b);
				System.out.println(a + " + 1000 = " + (a + 1000));
				System.out.println(b + " + 1000 = " + (b + 1000));
			}
	}

