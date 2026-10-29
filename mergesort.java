import java.util.Arrays;
import java.util.Scanner;
public class mergesort
{
    // static int mergecount = 0;
    // static int comparcount = 0;
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
        mergesort(a,0,n-1);
        System.out.println("After Sort:"+Arrays.toString(a));
        // System.out.println("Total Number of merge :"+mergecount);
        // System.out.println("Total Number of compare:"+comparcount);
    }
    public static void mergesort(int a[],int l,int r)
    {
        if(l<r)
        {
            int mid = (l+r)/2;
            mergesort(a,l,mid);
            mergesort(a,mid+1,r);
            merge(a,l,r,mid);
        }
    }
    public static void merge(int a[],int l,int r,int mid)
    {
        // mergecount++;
        int l1 = mid - l + 1;
        int l2 = r - mid;
        int L[] = new int[l1];
        int R[] = new int[l2];
        for(int i = 0;i<l1;i++)
        {
            L[i] = a[l+i];
        }
        for(int i = 0;i<l2;i++)
        {
            R[i] = a[mid+i+1];
        }
        int i = 0, j = 0, k = l;
        while(i<l1 && j <l2)
        {
            // comparcount++;
            if(L[i]<=R[j])
            {
                a[k++] = L[i++];
            }
            else
            {
                a[k++] = R[j++];
            }
        }
        while(i<l1)
        {
            a[k++] = L[i++];
        }
        while(j<l2)
        {
            a[k++] = R[j++];
        }
    }

}
