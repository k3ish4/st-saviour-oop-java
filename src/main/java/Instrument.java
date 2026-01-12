// Creating an abstract parent class called Instrument
public abstract class Instrument{
    
    // Creating Variables
    public String manufacturer;
    public String name;
    public String material;

    // Creating a constructor method
    public Instrument(String name, String manufacturer, String material){
        this.name = name;
        this.manufacturer = manufacturer;
        this.material = material;
    }    

    // Creating a method about playing the instrument
    public String play(){
        System.out.println("You play some music with your " + this.name + ".");
        return "";
    }
}