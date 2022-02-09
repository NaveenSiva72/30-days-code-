import java.util.*;
public class pattern_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no.of rows: ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= rows; j++)
            {
                if(j==i)
                    System.out.print(i + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
