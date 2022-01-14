//day 3 pattern printing
import java.util.Scanner;
public class pattern_3 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the no of rows: ");
        int n=input.nextInt();
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num);
                System.out.print(" ");
                num++;
            }
            System.out.println();
        }
    }
}
