package Pokemon;
import ru.ifmo.se.pokemon.*;
import Move.*;

public class Gallade extends Kirlia{
	public Gallade(String name, int level){
		super(name, level);
		setStats(68, 125, 65, 65, 115, 80);
		setType(Type.PSYCHIC, Type.FAIRY);
		setMove(new CalmMind(), new ThunderWave(), new DrainingKiss(), new Confide());
	}
}