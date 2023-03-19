import java.util.Scanner;

// Aisha Nicole L. Dones
// Section A122

public class AreaCircumferenceCircle {

    public static void main(String[] args){
        script();
    } // end of main

    private static void script(){
        final double PI = 3.14; // CONSTANT
        double area, cmf, r;

        System.out.println("\n========== Area and Circumference of a Circle ==========");
        System.out.println("Submitted by Aisha Nicole L. Dones\n");

        // check for errors
        try{

            Scanner input = new Scanner(System.in);
            System.out.println("Enter radius: ");
            r = input.nextDouble(); // get user input

            area = Math.round(getArea(PI, r) * 10000d) / 10000d;
            cmf = Math.round(getCmf(PI, r) * 10000d) / 10000d;

            System.out.println();
            System.out.println("Area: " + area);
            System.out.println("Circumference: " + cmf);

        } catch (Exception e){
            System.out.println("\nINVALID INPUT! Please try again.\n\n");
            script(); // run script again
        }

    } // end of script method

    private static double getArea(double pi, double r){return pi * r * r;}
    private static double getCmf(double pi, double r){return 2 * pi * r;}

} // end of class
