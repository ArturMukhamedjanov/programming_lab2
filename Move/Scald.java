package Move;
import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove{
	public Scald(){
		super(Type.WATER, 80, 100, 0, 1);
	}
	@Override
	protected void applyOppEffects(Pokemon var1){
		if(Math.random() <= 0.3){
			Effect.burn(var1);
		}
	}
	@Override
	protected String describe(){
		return "использует Scald";
	}
}