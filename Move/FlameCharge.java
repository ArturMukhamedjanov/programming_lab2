package Move;
import ru.ifmo.se.pokemon.*;

public class FlameCharge extends PhysicalMove{
	public FlameCharge(){
		super(Type.FIRE, 50, 100, 0, 1);
	}
	@Override
	protected void applySelfEffects(Pokemon var1){
		var1.setMod(Stat.SPEED, 1);
	}
	@Override
	protected String describe(){
		return "использует FlameCharge";
	}
}