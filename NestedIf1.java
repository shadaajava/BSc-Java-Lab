public class NestedIf1 {
	public static void main(String[] args) {
		{
		    int d=123,d1,d2,d3,r1,r2,sum;
		    d1=d/100;
		    r1=d%100;
		    if(r1!=0)
		{
		    d2=r1/10;
		    r2=r1%10;
		    if(r2!=0)
		    d3=r2;
		    else
		    d3=0;
	}
	else
	{
	    d2=0;
	    d3=0;
}
sum=d1+d2+d3;
System.out.println("sum of 3 digits no"+d+" ="+sum);
		}
	}
}
 
