import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
        Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int num2= num%100;
      int num3 = num2/10;
      System.out.println(num3);
	}
}