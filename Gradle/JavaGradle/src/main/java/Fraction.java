import java.io.*;
/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 *
 * Ser321 Foundations of Distributed Applications
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist Tim.Lindquist@asu.edu, Ryan Meneses
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version 2.0
 * @since January 2021
 *
 * Version 2.0 updates the Fraction according to SER321 Assignment 1. 
 * Allows users to pass arguments via the command line.
 */
public class Fraction {

   private int numerator, denominator;

   public Fraction(){
      numerator = denominator = 0;
   }

   public void print() {
    System.out.print(numerator + "/" + denominator );
   }

   public void setNumerator (int n ){
      numerator = n;
   }

   public void setDenominator (int d) {
      denominator = d;
   }

   public int getDenominator() {
      return denominator;
   }

   public int getNumerator() {
      return numerator;
   }

   public static void main (String args[]) {
	   // create a new instance
	   // Fraction *frac = [[Fraction alloc] init];
	   Fraction frac = new Fraction();
	   
	   if (args.length == 2) {
		   try {
			   // set the values
			   frac.setNumerator(Integer.parseInt(args[0]));
			   frac.setDenominator(Integer.parseInt(args[1]));

			   // print it
			   System.out.print("The fraction is: ");
			   frac.print();
			   System.out.println("");

		   } catch(Exception e) {
			   e.printStackTrace();
			   System.exit(1);
		   }
	   } else if (frac.getDenominator() == 0) {
		   System.out.println("Denominator is undefined.");
	   } else {
		   System.out.println("Usage: gradle runFraction -Pnumerator=<int> -Pdenominator=<int>");
	   }
   } 
}
