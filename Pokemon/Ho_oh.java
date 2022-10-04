package Pokemon;
import ru.ifmo.se.pokemon.*;
import Move.*;

public class Ho_oh extends Pokemon{
	public Ho_oh(String name, int level){
		super(name, level);
		setStats(106, 130, 90, 110, 154, 90);
		setType(Type.FIRE, Type.FLYING);
		setMove(new FlameCharge(), new Extrasensory(), new ShadowBall(), new Overheat());
	}
}