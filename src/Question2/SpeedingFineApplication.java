/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Question2;
import java.util.*;

/**
 *
 * @author dhiva
 */
public class SpeedingFineApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the person name: ");
        String citizenName = scanner.nextLine();
        
        System.out.println("Enter the speed: ");
        int speed = scanner.nextInt();
        
        SpeedingFines fine = new SpeedingFines(citizenName, speed);
        
        fine.PrintFine();
    }
    
}
