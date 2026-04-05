public class Main {
	public static void main(String[] args) {
		double [] arrayList = {2.3,121.9,23.4,43.5};
		for (int i=0;i<4;i++)
		{
		    System.out.println(arrayList[i]+"");
		}
		//adding all the elements
		double total = 0;
		for (int i = 0; i<4;i++)
		{
		    total += arrayList[i];
		    //same as total =total+arrayList[i];
		}
		System.out.println("Total is"+total);
	}
	}
