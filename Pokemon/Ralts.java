package Pokemon;
import ru.ifmo.se.pokemon.*;
import Move.*;

public class Ralts extends Pokemon{
	public Ralts(String name, int level){
		super(name, level);
		setStats(28, 25, 25, 45, 35, 40);
		setType(Type.PSYCHIC, Type.FAIRY);
		setMove(new CalmMind(), new ThunderWave());
	}
}