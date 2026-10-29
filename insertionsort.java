import java.util.Arrays;
import java.util.Scanner;
public class insertionsort
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = obj.nextInt();
        }
        System.out.println("Before Sort:"+Arrays.toString(a));
        for(int i = 1;i<n;i++)
        {
            int key = a[i];
            int j = i - 1;
            while(j>=0 && a[j]>key)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
        System.out.println("After Sort:"+Arrays.toString(a));
    }
}
