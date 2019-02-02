import java.util.Scanner;
class Main
{
  public static int sum_of_digits(int m)
  {
    int remainder, sum =m;
    while(m>=1)
    {
      remainder = (m-1);
      sum = sum+remainder;
      m = m-1;
    }
    return sum;
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int sod = sum_of_digits(n);
    System.out.println(sod);
  }
}
