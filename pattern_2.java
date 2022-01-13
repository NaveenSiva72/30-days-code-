import java.util.Scanner;

public class pattern_2 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the no.of rows :");
        int num= input.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }

    }
}
