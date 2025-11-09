/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Question1;

/**
 *
 * @author dhiva
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] city = {"JHB", "DBN", "CTN", "PE"};
        String [] month = {"JAN", "FEB", "MAR"};
        
        int[][] speedingFines = {
            {128, 135, 139},
            {155, 129, 175},
            {129, 130, 185},
            {195, 155, 221}
        };
        
        // Print header
        System.out.println("SPEEDING FINES REPORT");
        System.out.println("--------------------------------------------------");
        
          // Print month headings
        System.out.printf("%-10s", "");  // leave space for vehicle column
        for (int m = 0; m < month.length; m++) {
            System.out.printf("%8s", month[m]);
        }
        System.out.println();
        
        // print data
         for (int i = 0; i < city.length; i++) {
            System.out.printf("%-10s %8d %8d %8d%n", 
                              city[i],
                              speedingFines[i][0], 
                              speedingFines[i][1], 
                              speedingFines[i][2]);   // formatted rows
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("SPEEDING FINES STATISTIC");
        System.out.println("--------------------------------------------------");
        
        int minFine = speedingFines[0][0];
        int maxFine = speedingFines[0][0];

        // Loop through 2D array
        for (int i = 0; i < speedingFines.length; i++) {
           for (int j = 0; j < speedingFines[i].length; j++) {
              if (speedingFines[i][j] < minFine) {
              minFine = speedingFines[i][j];
        }
        if (speedingFines[i][j] > maxFine) {
            maxFine = speedingFines[i][j];
        }
      }
    }
         System.out.println("Maximum speeding fine: " + maxFine + "km");
         System.out.println("Minimum speeding fine: " + minFine + "km");
         
    }
    
}
