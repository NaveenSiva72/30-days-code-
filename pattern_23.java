import java.util.Scanner;
public class pattern_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no.of rows: ");    //used to get the no .of rows from the user.
        int rows = scanner.nextInt();
        for(int i=rows;i>0;i--)
        {
            for(int j=i;j<=rows;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
