// Aisha Nicole L. Dones
// Section A122

public class DONES {

    public static void main (String[] args){

        System.out.println("\n========== First Three Letters of DONES ==========");
        System.out.println("Submitted by Aisha Nicole L. Dones\n");

        String[] letterD = {"DDDDD     ", "DD   DDD  ", "DD      DD", "DD      DD", "DD   DDD  ", "DDDDD     "};
        String[] letterO = {"    DDDD    ", "  DD    DD  ", "DD        DD", "DD        DD", "  DD    DD  ", "    DDDD    "};
        String[] letterN = {"DDDD      DD", "DD  DD    DD", "DD  DD    DD", "DD    DD  DD", "DD    DD  DD", "DD      DDDD"};

        for (int line = 0; line < letterD.length; line++) {
            System.out.println(letterD[line] + "  " + letterO[line] + "  " + letterN[line]);
        } // end of for loop

    } // end of main
} // end of class
