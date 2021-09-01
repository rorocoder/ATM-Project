import java.util.*;

public class ATM_Colin {
	private HashMap<String, Integer> map;
	
	public ATM_Colin() {
		map = new HashMap<String, Integer>();
	}
	
	public void deposit(String id, int amt) {
		map.put(id, amt);
	}
	
	
	@Override
	public String toString() {
		return "ATM [map=" + map + "]";
	}

	public static void main (String [] args) {
		ATM_Colin chase = new ATM_Colin();
		chase.deposit("COLINYUAN01", 1000000);
		System.out.println(chase.toString());
	}
}
