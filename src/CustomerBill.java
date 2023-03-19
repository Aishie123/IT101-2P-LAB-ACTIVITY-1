import java.util.Scanner;

// Aisha Nicole L. Dones
// Section A122

public class CustomerBill {

    private static final double VAT = 0.038; // constant

    public static void main(String[] args) {
        script();
    } // end of main

    private static void script(){

        int quantity;
        double price, vat, grossTotal, netTotal;
        String brand, color;

        System.out.println("\n========== Customer Bill ==========");
        System.out.println("Submitted by Aisha Nicole L. Dones\n");

        // check for errors
        try {

            Scanner input = new Scanner(System.in);
            // get user input
            System.out.println("Brand: ");
            brand = input.nextLine();
            System.out.println("Color: ");
            color = input.nextLine();
            System.out.println("Price: ");
            price = input.nextDouble();
            System.out.println("Quantity (no. of items bought): ");
            quantity = input.nextInt();

            grossTotal = getGrossTotal(price, quantity);
            vat = getVAT(grossTotal);
            netTotal = getNetTotal(grossTotal, vat);

            String[] phoneDetails = {"\nBrand\t: " + brand, "\nColor\t: " + color, "\nPrice\t: "};
            String[] billDetails = {"\nGross Total\t: ", "\nVat (3.8%)\t: ", "\nNet Total\t: "};
            Double[] billValues = {grossTotal, vat, netTotal};

            for (String pd : phoneDetails){System.out.print(pd);} // print phone details
            System.out.printf("%.2f", price);
            System.out.println();

            for (int i = 0; i < billDetails.length; i++){
                System.out.print(billDetails[i]); // print bill details
                System.out.printf("%.2f", billValues[i]);
            } // end of for loop

        } catch (Exception e){
            System.out.println("\nINVALID INPUT! Please try again.\n\n");
            script(); // run script again
        }

    } // end of script method

    private static double getGrossTotal(double price, int quantity){ return price * quantity; }
    private static double getVAT(double gross){ return gross * VAT; }
    private static double getNetTotal(double gross, double vat){ return gross + vat; }

} // end of class
