package JavaSessions;

public class DataConversion {

	public static void main(String[] args)
	{
		String x = "100";
		System.out.println(x+20);
		
		//String to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
//		String y = "100A";
//		int j = Integer.parseInt(y);//NumberFormatException: For input string: "100A"
//		System.out.println(j);
		
		String y = "100A";
		String z = y.substring(0, 3);
		int k = Integer.parseInt(z);
		System.out.println(k);
		
		//String to double
		String p = "12.33";
		double d = Double.parseDouble(p);
		System.out.println(d+20);
		
		//int to String
		int total = 100;
		String t = String.valueOf(total);
		System.out.println(t+20);
		
		String g = "true";
		if(Boolean.parseBoolean(g))
		{
			System.out.println("Pass");
		}
		
		
		
		
	}
}
