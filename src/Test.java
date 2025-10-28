import java.util.Scanner;

public class Test {

  /**
   * Determines the parity of a number.
   * @param number The number to check.
   * @return "pair" if even, "impair" if odd.
   */
    public static String parity(int number) {
        if(number % 2 == 0) return "pair";
        else return "impair";
    }
    
    /**
     * Determines the positivity of a number.
     * @param number The number to check.
     * @return "positif" if positive, "négatif" if negative, "nul" if zero.
     */
    public static String positivity(int number) {
        if(number < 0) return "négatif";
        else if (number > 0) return "positif";
        else return "nul";
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int [] array_nb;

        // Check if a command-line argument was provided
        if (args.length > 0) {
        	array_nb = new int[args.length];
        	for (int i = 0; i < args.length; i++)
        	{
        		array_nb[i] = Integer.parseInt(args[i]);
        		
        	}
        }
        
        else { 
        	array_nb = new int[1];
            // Prompt user if no argument and read number from input
            System.out.print("Chiffre à tester : ");
            // Keep asking until the user enters a valid integer
            while (!scan.hasNextInt()) {
                System.out.println("Veuillez entrer un nombre entier.");
                System.out.print("Chiffre à tester : ");
                // Discard invalid user input
                scan.next();
            }
            array_nb[0] = scan.nextInt();
            
        }
        
        for (int i = 0; i < array_nb.length ; i++) {
        	String positivityResult = positivity(array_nb [i]);
            String parityResult = parity(array_nb [i]);

            // Print the results
            System.out.println(array_nb [i] + " est " + positivityResult + " et " + parityResult);
        	}

        scan.close();
    }
}
