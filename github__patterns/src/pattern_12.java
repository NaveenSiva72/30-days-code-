import java.util.*;
public class pattern_12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the no.of rows: ");
        int rows=in.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
