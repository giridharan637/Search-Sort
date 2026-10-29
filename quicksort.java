import java.util.Arrays;
import java.util.Scanner;

public class quicksort
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
        quicksort(a,0,n-1);
        System.out.println("After Sort:"+Arrays.toString(a));
    }
    public static void quicksort(int a[],int l,int r)
    {
        if(l<r)
        {
            int pi = partition(a,l,r);
            quicksort(a, l, pi -1);
            quicksort(a, pi+1, r);
        }
    }
    public static int partition(int a[],int l,int r)
    {
        int pivot = a[r];
        int i = l - 1;
        for(int j = l;j<r;j++)
        {
            if(a[j]<pivot)
            {
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[r];
        a[r] = temp;

        return i+1;
    }
}
