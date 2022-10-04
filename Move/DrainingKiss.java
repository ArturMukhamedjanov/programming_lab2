package Move;
import ru.ifmo.se.pokemon.*;

public class DrainingKiss extends SpecialMove{
	private double damage = 0;
	public DrainingKiss(){
		super(Type.FAIRY, 50, 100, 0, 1);
	}
	@Override
	protected void applyOppDamage(Pokemon var1, double var2){
		damage = var2;
		var1.setMod(Stat.HP, (int)Math.round(var2));
	}
	@Override
	protected void applySelfEffects(Pokemon var1) {
		var1.setMod(Stat.HP, -(int)(damage * (0.75)));
	}
	@Override
	protected String describe(){
		return "использует DrainingKiss";
	}
}