import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
	int sum=0;
		Scanner sc = new Scanner (System.in);
		  System.out.println("Enter the number :");
		  int x = sc.nextInt();
		  for (int i=0;i<=x;i++) {
			   sum = sum +i;
			  }
		  System.out.println(sum);

	}

}
