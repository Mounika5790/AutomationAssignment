package CongaTest.AutomationAssignment;

public class test {

	public static void main(String[] args) {
		
		String str="foo";
		Object obj = (Object)str;
		if (str.equals(obj))
		{
			System.out.print("AAA");
		}
		else
		{
			System.out.print("BBB");
		
		}
		if (obj.equals(str)) {
			
				System.out.print("CCC");
			
		}
		else
		{
			System.out.print("DDD");
		}
		
	}


}
