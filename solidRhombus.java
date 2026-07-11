import java.util.Scanner;
public class solidRhombus
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        int maxCol =(2*n)-1;
        for (int r = 1; r <=n; r++)
        {
            for (int c = 1; c <= maxCol; c++)
            {  if ((r+c)<=maxCol+1 && (r+c)>=n+1)
                System.out.print("* ");
            else
                System.out.print("  ");  }

            System.out.print("\n");
        }

    }
}
