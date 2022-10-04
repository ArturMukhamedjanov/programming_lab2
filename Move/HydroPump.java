package Move;
import ru.ifmo.se.pokemon.*;

public class HydroPump extends SpecialMove{
	public HydroPump(){
		super(Type.WATER, 110, 80, 0, 1);
	}
	@Override
	protected String describe(){
		return "использует HydroPump";
	}
}