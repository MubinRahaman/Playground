import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
int Number ;
		Scanner in = new Scanner(System.in);
		Number = in.nextInt();
		for( int i = 1; i <= Number; i++) {
			if(Number%i == 0) {
				System.out.println(i);
			}
		}
	}
}