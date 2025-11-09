/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author dhiva
 */
public class SpeedingFines extends Fine {

    //constructor
    public SpeedingFines(String citizenName, int speed) {
        super(citizenName, speed);
    }
    
    //method 
    public void PrintFine(){
        System.out.println("****************************");
        System.out.println("PERSON: " + citizenName);
        System.out.println("SPEED: " + speed + "km");
        System.out.println("FINE PAYABLE: R" + calculateFine());
        System.out.println("****************************");
    }
}
