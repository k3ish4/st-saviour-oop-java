// Child class
public class Brass extends Wind{
    
    // Constructor method with super
    public Brass(String name, String manufacturer, String material){
        super(name, manufacturer, material);

    }
    
    // Brass instruments have spit valves that allow players to empty any buildup in their instrument. This method allows this to be put to use.
    public String emptySpit(){
        System.out.println("You open your spit valve and empty the gunk from your " + this.name + ".\nGross...");
        return "";
    }

}