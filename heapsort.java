import java.util.Arrays;
import java.util.Scanner;
public class heapsort
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
        heapsort(a,n);
        System.out.println("After Sort:"+Arrays.toString(a));
    }
    public static void heapsort(int a[],int n)
    {
        for(int i = n/2 - 1; i>=0;i--)
        {
            heapify(a,n,i);
        }
        for(int i = n - 1;i>=0;i--)
        {
            int temp = a[i];
            a[i] = a[0];
            a[0] = temp;
            heapify(a, i, 0);
        }
    }
    public static void heapify(int a[],int n,int i)
    {
        int lar = i;                                                                             
        int l = 2 * i + 1;
        int r = 2 * i + 2;                        
        if(l<n && a[l]>a[lar])                               
        {                                                
            lar = l;
        }
        if(r<n && a[r]>a[lar])
        {
            lar = r;
        }
        if(lar != i)
        {
            int temp = a[i];
            a[i] = a[lar];
            a[lar] = temp;
            heapify(a, i, lar);
        }
    }
}
