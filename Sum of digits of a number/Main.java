import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		int Number, Reminder, Sum = 0;
		Scanner in = new Scanner(System.in);		
		Number = in.nextInt();
		while(Number > 0) {
			Reminder = Number % 10;
			Sum = Sum+ Reminder;
			Number = Number / 10;
		}
		System.out.println(Sum);
	}
}