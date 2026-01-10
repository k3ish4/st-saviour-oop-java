public class Wind extends Instrument {

    public Wind(String name, String manufacturer, String material) {
        super(name, manufacturer, material);
        
    }

public String blow(){
    return "You blow into your " + this.name + " and play a note.";
}

public String playMelody(){
    return "You play a melodious tune on your " + this.name + ".";
}
}