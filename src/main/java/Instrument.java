public class Instrument{
    
    public String manufacturer;
    public String name;
    public String material;

    public Instrument(String name, String manufacturer, String material){
        this.name = name;
        this.manufacturer = manufacturer;
        this.material = material;
    }    

    public String play(){
        return "You play some music with your " + this.name + ".";
    }
}