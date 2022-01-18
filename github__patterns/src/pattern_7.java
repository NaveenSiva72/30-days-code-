import java.util.*;
public class pattern_7
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the no.of rows: ");
        int n = s.nextInt();
        int i, j;
        int count = 1;
        for (i = n; i > 0; i--) {
            for (j = 1; j <= i; j++) {
                if (count % 2 == 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }
            count += 1;
            System.out.println();
        }
    }
}
