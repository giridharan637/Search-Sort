import java.util.Arrays;
import java.util.Scanner;

public class radixsort
{
    public static  void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i]  = obj.nextInt();
        }
        System.out.println("Before Sort:"+Arrays.toString(a));
        Radixsort(a,n);
        System.out.println("After Sort:"+Arrays.toString(a));
    }
    public static void Radixsort(int a[],int n)
    {
        int max = a[0];
        for(int i = 0;i<n;i++)
        {
            if(max<a[i])
            {
                max = a[i];
            }
        }
        for(int exp = 1;max/exp>0;exp *= 10)
        {
            countsort(a,n,exp);
        }
    }
    public static void countsort(int a[],int n,int exp)
    {
        int count[] = new int[10];
        int output[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            int temp = (a[i]/exp) % 10;
            count[temp]++;
        }
        for(int i = 1;i<10;i++)
        {
            count[i] = count[i]+count[i-1];
        }
        for(int i = n - 1;i>=0;i--)
        {
            int temp = (a[i]/exp)%10;
            output[count[temp]-1]= a[i];
            count[temp]--;
        }
        for(int i = 0;i<n;i++)
        {
            a[i] = output[i];
        }
    }
}
