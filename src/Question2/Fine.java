/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author dhiva
 */
public abstract class Fine implements iFine {
    public String citizenName;
    public int speed;
    public int finePayable;

    //constructor
    public Fine(String citizenName, int speed) {
        this.citizenName = citizenName;
        this.speed = speed;
    }

    //getters
    public String getCitizenName() {
        return citizenName;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFinePayable() {
        return finePayable;
    }
    
    //method
    public double calculateFine(){
        if (getSpeed() >= 120) {
            return speed * 10.20; //multiply speed by R10.20
        } else {
            return 0.0; //no fine if speed is < 120 (less than)
        }
        
    }
}
