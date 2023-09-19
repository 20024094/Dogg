package main;

/**
 *
 * @author 20024094
 */

public class Main {
    
    public Main() {
       coat();
       breed();
       size();
       owner();
       food();
       gender();
       legs();
       age();
       weight();
       height();
       distance();
       training();
       feed();
       toothBrush();
       happy();
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
    
    protected void coat() {
       Dog dog = new Dog();
       // dog.colourOfCoat = "Black"; this it will be an error
       dog.setColourOfCoat("Black");
       System.out.println("Colour of coat is: " + dog.getColourOfCoat()); 
    }
    
    protected void breed() {
       Dog dog = new Dog();
       dog.setBreed("Terrier");
       System.out.println("This dog's breed is: " + dog.getBreed()); 
    }
    
    protected void size() {
       Dog dog = new Dog();
       dog.setSize("80 centimeters");
       System.out.println("Size of this dog is: " + dog.getSize()); 
    }
    
    protected void owner() {
       Dog dog = new Dog();
       dog.setOwnerName("John Terry.");
       System.out.println("Owner of this dog is: " + dog.getOwnerName()); 
    }
    
    protected void food() {
       Dog dog = new Dog();
       dog.setFoodType("Sausages");
       System.out.println("Food of this dog is: " + dog.getFoodType()); 
    }
    
    protected void gender() {
       Dog dog = new Dog();
       dog.setGender('M');
       System.out.println("Gender of this dog is: " + dog.getGender()); 
    }
    
    protected void legs() {
       Dog dog = new Dog();
       dog.setNoOfLegs(3);
       System.out.println("Number of legs of this dog is: " + dog.getNoOfLegs()); 
    }
    
    protected void age() {
       Dog dog = new Dog();
       dog.setAge(15);
       System.out.println("Age of this dog is: " + dog.getAge()); 
    }
    
    protected void weight() {
       Dog dog = new Dog();
       dog.setWeight(25.5);
       System.out.println("Weight of this dog is: " + dog.getWeight() + " kg"); 
    }
    
    protected void height() {
       Dog dog = new Dog();
       dog.setHeight(20.0);
       System.out.println("Height of this dog is: " + dog.getHeight() + " cm"); 
    }
    
    protected void distance() {
       Dog dog = new Dog();
       dog.setDistanceWalked(21.5);
       System.out.println("Walk Distance of this dog is: " + 
               dog.getDistanceWalked() + " km"); 
    }
    
    protected void training() {
       Dog dog = new Dog();
       dog.setTrained(true);
       System.out.println("This dog is trained: " + dog.getTrained()); 
    }
    
    protected void feed() {
       Dog dog = new Dog();
       dog.setIsHungry(true);
       System.out.println("This dog is hungry: " + dog.getIsHungry()); 
    }
    
    protected void toothBrush() {
       Dog dog = new Dog();
       dog.setTeethDirty(true);
       System.out.println("This dog his teeth are dirty: " + dog.getTeethDirty()); 
    }
    
    protected void happy() {
       Dog dog = new Dog();
       dog.setIsHappy(false);
       System.out.println("This dog is happy: " + dog.getIsHappy()); 
    }
}
