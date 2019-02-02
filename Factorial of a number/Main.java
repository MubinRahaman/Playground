import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
	 int num, i, fact=1;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
		
        for(i=num; i>0; i--)
        {
            fact = fact*i;
        }
		
        System.out.println(fact);
    }
}