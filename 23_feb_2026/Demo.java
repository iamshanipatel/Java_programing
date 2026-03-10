import java.util.Scanner;
class Demon 
{

    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number");
      int num = sc.nextInt();// 121
      int rev = 0;
      int ori = num;// 121
      while(num>0)// 0>0
      {
          int rem = num%10;// 121%10= 1
          rev = rev*10+rem;// 0*10+1=>1
          num =num/10; // 121/10 = 12
      }
      
    }
}