import java.util.Scanner;

public class pattern_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no.of rows: ");
        int rows = scanner.nextInt();
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            for (int j= i*2 ; j < rows*2-1; j++)
            {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--)
            {
                if(l!=rows)
                    System.out.print(l);
            }
            System.out.println();
        }
    }
}
