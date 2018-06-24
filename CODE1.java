import java.io.*;
import java.util.*;

public class CODE1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter total nos:");
        int q = sc.nextInt();
        int i, j;
        for(i=1; i <= q; i++)
        {
            for(j=1; j<=i ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        for(i=q-1;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
