import java.util.Scanner;
public class pattern_9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no.of lines: ");
        int n=in.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }


    }

}

