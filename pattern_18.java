import java.util.*;
public class pattern_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no.of rows: ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            for (int j= i*2 ; j < rows*2; j++)
            {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
