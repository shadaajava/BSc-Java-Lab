public class NestedIf {
	public static void main(String[] args) {
		int n1=50;
		int n2=60;
		int n3=40;
		if(n1>n2)
		{
		if(n1>n3)
		{
		    System.out.println("n1 is largest");
		}
		else 
		{
		    System.out.println("n3 is largest");
		}
		}
		else
		{
		    if(n2>n3)
		    {
		        System.out.println("n2 is largest");
		    }
		    else
		    {
		        System.out.println("n3 is largest");
		    }
		}
		
		
	}
}
