package Pokemon;
import ru.ifmo.se.pokemon.*;
import Move.*;

public class Pelipper extends Wingull{
	public Pelipper(String name, int level){
		super(name, level);
		setStats(60, 50, 100, 95, 70, 65);
		setType(Type.WATER, Type.FLYING);
		setMove(new Scald(), new Roost(), new Supersonic(), new HydroPump());
	}
}