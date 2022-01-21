import java.util.Scanner;

public class pattern_10 {
    public static void main(String[] args) {
        Scanner input=new Scanner((System.in));
        System.out.print("enter the no of lines: ");
        int n=input.nextInt();
        int sp=n-1;
        int k;
        for (int i = 1; i <= n; i++)
        {
            int num=i;
            for (int j = sp; j>0; j--)
            {
                System.out.print(" ");
            }
            for( k=i;k>=1;k--)
            {
                System.out.print(num);
                num++;
            }
            for (int l=num-2;l>=i;l--)
            {
                System.out.print(l);
            }
            sp--;

            System.out.println();
        }

    }

}






