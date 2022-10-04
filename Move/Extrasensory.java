package Move;
import ru.ifmo.se.pokemon.*;

public class Extrasensory extends SpecialMove{
	public Extrasensory(){
		super(Type.PSYCHIC, 80, 100, 0, 1);
	}
	@Override
	protected void applyOppEffects(Pokemon var1){
		if(Math.random() <= 0.1){
			Effect.flinch(var1);
		}
	}
	@Override
	protected String describe(){
		return "использует Extrasensory";
	}
}