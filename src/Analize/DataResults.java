package Analize;

// стек резльтатов
public final class DataResults
{
	private int iter = 0;
	public DataUnit[] stackUnits =  null;
		
	private static DataResults instance =  null;
	private DataResults() {}
	
	public static DataResults getInstance()
	{
		if(instance == null)
			instance = new DataResults();
		
		return instance;
	}
	
	public void push(DataUnit unit) {
		
		if(this.stackUnits == null)
			this.stackUnits = new DataUnit[10];
		
		this.stackUnits[iter++] = new DataUnit(unit);
		
		
		
	}

}
