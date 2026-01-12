
import java.util.ArrayList;

public class Hello {
    public static void main(String[] args) {
    
        // Making various instances of instruments
        Percussion maracas = new Percussion("maracas", "Toca", "wood", "shake", false);
        Woodwind flute = new Woodwind("flute", "Powell", "silver", false);
        Brass trombone = new Brass("trombone", "Yamaha", "brass");
        Percussion xylophone;
        xylophone = new Percussion("xylophone", "Marimba One", "wood", "strike", true);


        // Making an ArrayList of all the instances of percussion instruments
        ArrayList<Percussion> percussions = new ArrayList<Percussion>();
        percussions.add(maracas);
        percussions.add(xylophone);

        // Utilizing instanceof as well as the ArrayList
        if((maracas instanceof Percussion) && (xylophone instanceof Percussion)){
            System.out.println("This is the percussion section: " + percussions);
        }
        
        // Shows that trombone is an instance of the parent class Wind 
        // Also shows an instance of the Woodwind child class using a function from the Wind parent class
        if(flute instanceof Wind){
        flute.blow();
        }

        // Tests a function from the Brass class
        trombone.emptySpit();
    }
}