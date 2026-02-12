// public class OddEven{
// import java.util.Scanner;
// public class OddEven{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your age");
//         int x=sc.nextInt();
//         if(x>=18){
//             System.out.println("eligible");
//         }
//         else{
//             System.out.println("your are just a kid");
//         }
//     }
// }
// }

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int x = sc.nextInt();

        if (x >= 18) {
            System.out.println("eligible");
        } else {
            System.out.println("you are just a kid");
        }

        sc.close();
    }
}
