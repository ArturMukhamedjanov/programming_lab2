package Move;
import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove{
	public ThunderWave(){
		super(Type.ELECTRIC, 0, 0, 0, 1);
	}
	@Override
	protected void applyOppEffects(Pokemon var1) {
		if(Math.random() <= 0.9){
			Effect.paralyze(var1);
		}	
	} 
	@Override
	protected String describe(){
		return "использует ThunderWave";
	}
}