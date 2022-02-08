import java.util.*;
public class pattern_28 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no.of rows: ");
        int rows = scanner.nextInt();
        int temp = 1;
        for (int i = 1; i <= rows; i++)
        {
            for (int k = 1; k <= i; k++)
            {
                System.out.print(temp + " ");
            }
            temp++;
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--)
        {
            for (int k = i; k >= 1; k--)
            {
                System.out.print(temp + " ");
            }
            temp++;
            System.out.println();
        }

    }

}
