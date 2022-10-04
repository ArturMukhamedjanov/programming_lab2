package Pokemon;
import ru.ifmo.se.pokemon.*;
import Move.*;

public class Wingull extends Pokemon{
	public Wingull(String name, int level){
		super(name, level);
		setStats(40, 30, 30, 55, 30, 85);
		setType(Type.WATER, Type.FLYING);
		setMove(new Scald(), new Roost(), new Supersonic());
	}
}