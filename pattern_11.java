import java.util.Scanner;
public class pattern_11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the no.of rows: ");
        int num=input.nextInt();
        for(int i=num;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
