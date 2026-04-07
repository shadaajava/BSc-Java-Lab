public class Largestelement{
	public static void main(String[] args) {
		double [] arrayList={2.3,121.9,23.4,43.5,5.7};
		for(int i=0;i<5;i++)
		{
		    System.out.println(arrayList[i]+"");
	}
	double max = arrayList[0];
	for(int i=0;i<5;i++)
	{
	    if(arrayList[i]>max)
	    max=arrayList[i];
	}
	System.out.println("Largest element="+max);
}
}
