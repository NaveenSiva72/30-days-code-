import java.util.*;
public class pattern_30 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no.of rows: ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++)
        {
            int j = (i * 2) - 1;
            for (int k = 1; k <= rows; k++)
            {
                System.out.print(j + " ");
                j += 2;
                if (j > (rows * 2) - 1)
                    j = 1;
            }
            System.out.println();
        }
        scanner.close();

    }
}
