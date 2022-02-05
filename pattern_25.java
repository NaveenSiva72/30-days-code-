import java.util.Scanner;
public class pattern_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no.of rows: ");
        int rows = scanner.nextInt();
        int temp = 0;
        for (int i = rows; i >= 1; i--)
        {
            for (int j = rows ; j >= i; j--)
            {
                System.out.print(j + " ");
                temp =j;
            }
            for (int k = rows - i+1; k < rows; k++)
            {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}
