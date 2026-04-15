import java.util.Scanner;
public class Userinput{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("pehla word dalo:"); 		String start = sc.nextLine();
		System.out.println("Beech ka sentence dalo:");
         String middle =sc.nextLine();
         System.out.println("aakhri word dalo:");
         String end=sc.nextLine();
	String result=start+""+middle+""+end;
	System.out.println("aapka pura sentence kya hai:");
			System.out.println(result);
			sc.close();
	}
}
