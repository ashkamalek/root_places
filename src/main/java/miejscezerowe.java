//Description
//Please, proceed to the QuadraticEquation class and implement a program to solve quadratic equations.
//
//For the given quadratic equation coefficients (ax² + bx + c = 0), return one or two roots of the equation if there is any in the set of real numbers.
//
//Input value is given via System.in. Output value must be printed to System.out.
//
//Output format is:
//
//"x₁ x₂" (two roots in any order separated by space) if there are two roots,
//"x" (just the value of the root) if there is the only root,
//"no roots" (just a string value "no roots") if there is no root.
//The a parameter is guaranteed to be not zero.
//
//Hint: Quadratic formula reference
//
//
//Examples
//Input:
//
//1 -2 1
//Output:
//
//1
//
//
//Input:
//
//2 5 -3
//Output:
//
//-3 0.5
//
//
//Input:
//
//2 2 2
//Output:
//
//no roots


import java.util.Scanner;

import static java.lang.Math.sqrt;


public class miejscezerowe {
    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        //System.out.println("Enter username");

        String input_string = myObj.nextLine();  // Read user input
        String[] abc;
        abc = input_string.split(" ");




        String a_str = abc[0];  // Read user input
        String b_str = abc[1];  // Read user input
        String c_str = abc[2];  // Read user input
        // System.out.println("Hello, " + input);  // Output user input

        int a = Integer.parseInt(a_str);
        int b = Integer.parseInt(b_str);
        int c = Integer.parseInt(c_str);


        String out;
        double delta;

        delta = b * b - 4 * a * c;

        if (delta == 0) {
            double x_0;
            x_0 = (-1 * b) / (2 * a);
            System.out.println(x_0);
        }

        if (delta > 0) {
            double x_1, x_2;


            x_1 = (((-1 * b) - sqrt(delta)) / (2 * a));
            x_2 = ((-1 * b) + sqrt(delta)) / (2 * a);

            out = x_1 + " " + x_2;

            System.out.println(out);

        }


        if (delta < 0) {
            System.out.println("no roots");


        }


    }


}