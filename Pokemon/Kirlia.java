package Pokemon;
import ru.ifmo.se.pokemon.*;
import Move.*;

public class Kirlia extends Ralts{
	public Kirlia(String name, int level){
		super(name, level);
		setStats(38, 35, 35, 65, 55, 50);
		setType(Type.PSYCHIC, Type.FAIRY);
		setMove(new CalmMind(), new ThunderWave(), new DrainingKiss());
	}
}