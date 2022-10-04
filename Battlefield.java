import ru.ifmo.se.pokemon.*;
import Pokemon.*;

public class Battlefield {
	public static void main(String args[]) {
		Battle field = new Battle();
		field.addAlly(new Ho_oh("First_poke", 4));
		field.addAlly(new Wingull("Second_poke", 3));
		field.addAlly(new Pelipper("Third_poke", 4));
		field.addFoe(new Ralts("Fourth_poke", 2));
		field.addFoe(new Kirlia("Fifth_poke", 3));
		field.addFoe(new Gallade("Sixth_poke", 4));
		field.go();
	}
}