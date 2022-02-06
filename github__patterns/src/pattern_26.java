import java.util.*;
public class pattern_26 {
    public static void main(String[] args) {
        int currentRow = 1;
        int counter = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no.of rows: ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) { for (int l = rows; l > i; l--)
        {
            System.out.print(" ");
        }
            if (i % 2 == 0)
            {
                int reverse = currentRow + counter - 1;
                for (int j = 0; j < i; j++)
                {
                    System.out.print(reverse-- + " ");
                    counter++;
                }
            } else
            {
                for (int j = 1; j <= i; j++)
                {
                    System.out.print(counter + " ");
                    counter++;
                }
            }
            System.out.println();
            currentRow++;
        }
    }
}
