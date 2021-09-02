mport java.util.HashMap;

public class ATM {
	private HashMap <String, Double> database;

	public  ATM()
	{
		database = new HashMap <String, Double> ();
	}

	public void deposit(String userID, double amount) throws Exception
	{
		if (database.containsKey (userID))
		{
			double currBalance= database.get(userID);
			database.replace(userID, currBalance + amount);
		}
		else
		{
			database.put(userID,amount);

		}
	}

	public void withdraw (String userID, double amount) throws Exception
	{
		double currBalance = database.get(userID);
		if (amount> currBalance)
		{
			throw new Exception();
		}
		else
		{
			database.replace(userID, currBalance - amount);

		}
	}

	public double checkBalance (String userID) throws Exception
	{
		if (!database.containsKey (userID))
		{
			throw new Exception();

		}
		return database.get(userID);
	}
}
