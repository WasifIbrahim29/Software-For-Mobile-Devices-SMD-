
public abstract class BasicCarFunctions {
	
public final int wheels=4;
	
	public String wheel() {
		return wheels + " wheeler";
	}
	public String CheckAC() {
		return "AC available";
	}
	public String RadioFacility() {
		return "Radio Facility Supported";
	}
	public String Insurance() {
		return "Insurance is available";
	}
	abstract String SpareWheel();
	abstract String CarMode();

}
