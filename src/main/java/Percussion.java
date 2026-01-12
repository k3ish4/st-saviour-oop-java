// Parent class
public class Percussion extends Instrument{

// Defining variables
public boolean pitched;
public String percuss;

// Constructor method using super
public Percussion(String name, String manufacturer, String material, String percuss, boolean pitched){
        super(name, manufacturer, material);
    }

// Creating a method that allows percussion instruments to play a rythm via their designated method of playing (shake, strike, scrape, etc)
public String playRhythm(){
    System.out.println("You play a resounding rhythm as you " + this.percuss + " your " + this.name + ".");
    return "";
}

}