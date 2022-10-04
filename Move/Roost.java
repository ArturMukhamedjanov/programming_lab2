package Move;
import ru.ifmo.se.pokemon.*;

public class Roost extends StatusMove{
	public Roost(){
		super(Type.FLYING, 0, 100, 0, 1);
	}
	@Override
	protected void applySelfEffects(Pokemon var1) {
		var1.setMod(Stat.HP, -((int)(var1.getStat(Stat.HP) / 2)));
	}
	@Override
	protected String describe(){
		return "использует Roost";
	}
}