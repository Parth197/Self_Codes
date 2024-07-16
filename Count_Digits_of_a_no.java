import java.util.Scanner;


public class Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number =");
		int num = sc.nextInt();
		System.out.print("Which no. to check = ");
		int a = sc.nextInt();
		int count = 0;
		while(num>0) { 
			int rem = num % 10;
			if(rem == a) {
				count++;
			}
			num = num / 10;
		}
		System.out.println("count = "+count);
			
		
		
		
		
		
	}

}
