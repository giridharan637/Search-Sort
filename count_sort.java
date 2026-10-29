import java.util.Arrays;
import java.util.Scanner;
public class count_sort
{
        public static void main(String[] args)
        {
            Scanner obj = new Scanner(System.in);
            int n = obj.nextInt();
            int a[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                a[i] = obj.nextInt();
            }
            System.out.println("Before Sort:"+Arrays.toString(a));
            int max = a[0];
            for(int i = 0;i<n;i++)
            {
                if(max<a[i])
                {
                    max = a[i];
                }
            }
            int b[] = new int[max+1];
            for(int i = 0;i<n;i++)
            {
                b[a[i]]++;
            }
            for(int i = 1;i<b.length;i++)
            {
                b[i] = b[i]+b[i-1];
            };
            int c[] = new int[n];
            for(int i = n - 1;i>=0;i--)
            {
                int temp = a[i];
                c[b[temp]-1] = temp;
                b[temp]--;
            }
            System.out.println("After Sort:"+Arrays.toString(c));

        }
}