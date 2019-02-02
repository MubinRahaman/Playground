import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
       int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int result = greatest_number(n1,n2);
      System.out.print(greatest_number(result,n3));
	}
  public static int greatest_number(int n1, int n2)
  {
    int greatest = 0;
    if(n1>n2)
      greatest = n1;
    else 
      greatest = n2;
    return greatest;
  }
}