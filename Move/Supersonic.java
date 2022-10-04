package Move;
import ru.ifmo.se.pokemon.*;

public class Supersonic extends StatusMove{
	public Supersonic(){
		super(Type.NORMAL, 0, 0, 0, 1);
	}
	@Override
	protected void applyOppEffects(Pokemon var1) {
		if(Math.random() <= 0.55){
			Effect.confuse(var1);
		}
    	}
	@Override
	protected String describe(){
		return "использует Supersonic";
	}
}