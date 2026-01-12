//Parent class
public class Wind extends Instrument {

    //Constructor method that uses super to inherit name, manufacturer, and material from Instrument
    public Wind(String name, String manufacturer, String material) {
        super(name, manufacturer, material);
    }

// Wind instruments use air so this is a function that allows the instrument to be blowed into
public String blow(){
    System.out.println("You blow into your " + this.name + " and play a note.");
    return "";
}

// Wind instruments can play notees so this method allows Wind instruments to play melodies
public String playMelody(){
    System.out.println("You play a melodious tune on your " + this.name + ".");
    return "";
}
}