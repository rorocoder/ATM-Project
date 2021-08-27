import java.util.*;

public class ATM {
	HashMap<String, Integer> map;
	
	public ATM() {
		map = new HashMap<String, Integer>();
	}
	
	public void deposit(String id, int amt) {
		map.put(id, amt);
//		Iterator mapIterator = map.entrySet().iterator();
//		while (mapIterator.hasNext()) {
//				
//		}
		
	}
	
	
	@Override
	public String toString() {
		return "ATM [map=" + map + "]";
	}

	public static void main (String [] args) {
		ATM chase = new ATM();
		chase.deposit("COLINYUAN01", 1000000);
		System.out.println(chase.toString());
	}
}
