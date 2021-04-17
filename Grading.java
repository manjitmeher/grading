	import java.util.Scanner;
	
public class Main{
	
	public static void main(String[] args) {
		
		int mark ;
		System.out.println("Enter your mark.");
		
		Scanner s= new Scanner(System.in);
		mark = s.nextInt();
		
		if(mark<=100 && mark>=75)
		System.out.println("A Grade");
		else if(mark<75 && mark>=60)
		System.out.println("B Grade");
		else if(mark<60 && mark>=45)
		System.out.println("C Grade");
		else if(mark<45 && mark>30)
		System.out.println("D Grade");
		else if(mark<30 && mark>=0)
		System.out.println("Sorry ,You are fail");
		else
		System.out.println("Wrong input");
	}
}