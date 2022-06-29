package StringConcept;

public class StringManipulation {

	public static void main(String[] args)
	{
		String s = "This is my java code and I am so happy";
		System.out.println(s.length());
		System.out.println(s.charAt(11));
		System.out.println(s.charAt(0));
//		System.out.println(s.charAt(-1));
		
		System.out.println(s.indexOf('j'));
		System.out.println(s.indexOf('i'));
		System.out.println(s.indexOf('i', s.indexOf('i')+1));
		
		System.out.println(s.indexOf("java"));//11
		System.out.println(s.indexOf("python"));//-1
		
		String msg = "Welcome Admin";
		if(msg.indexOf("Admin")>0)
		{
			System.out.println("Pass");
		}
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		String str = "   Hello World   ";
		System.out.println(str.trim());
		System.out.println(str.replaceAll(" ", ""));
		
		String dob = "31-12-1998";//31/12/1998
		System.out.println(dob.replace('-', '/'));
		
		
		//contains:
		String s1 = "your user id is naveenAutomation";
		System.out.println(s1.contains("naveenAutomation"));
		if(s1.contains("naveenAutomation"))
		{
			System.out.println("Pass");
		}
		
		//comparison:
		String t1 = "hello java";//String literals
		String t2 = "hello java";
		//t2 = "hello python";
		System.out.println(t1.equals(t2));
		System.out.println(t1.equalsIgnoreCase(t2));
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1==t2);//true
		
		String t5 = new String("hello ruby");//new keyword--object ib heap - 2 objects(SCP + Heap)  
		String t6 = "hello ruby";//0
		String t7 = new String("hello ruby");//1(Heap)
		
		System.out.println(t5==t7);//false
		System.out.println(t5==t6);//false
		
		//Split
		String lang = "JAVA_PYTHON_RUBY_PHP";
		String langArr[] = lang.split("_");
		System.out.println(langArr[0]);
		//System.out.println(langArr[4]);
		for(String e : langArr)
		{
			System.out.println(e);
		}
		
		String name = "xXtestingxXjavaxXXSeleniumXxXPython";
		String nameArr[] = name.split("xX");
		System.out.println(nameArr[0]);
		System.out.println(nameArr[1]);
		System.out.println(nameArr[2]);
		System.out.println(nameArr[3]);
		System.out.println(nameArr[4]);
		System.out.println(nameArr.length);
		
		String empData = "Vishu;Patel;40;NY;USA;31-12-1998;selenium;QA";
		String emp[] = empData.split(";");
		for(String e : emp)
		{
			System.out.println(e);
		}
		
		String credentials = "admin:admin123";
		System.out.println(credentials.split(":")[0]);
		System.out.println(credentials.split(":")[1]);
		
		//subString:
		String message = "testing your order id is 12345";
		System.out.println(message.substring(8));
		System.out.println(message.substring(17));
		System.out.println(message.substring(0, 10));
		System.out.println(message.substring(message.indexOf("is")+3, message.length()));
		String orderId = message.substring(message.indexOf("is")+3, message.length());
		//System.out.println(message.substring(message.indexOf("is", message.indexOf("is")+1), 0));
		
		System.out.println(orderId);
		
		
	}
}
