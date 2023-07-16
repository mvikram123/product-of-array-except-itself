import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int ans[]=new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            int product=1;
            for(int j=0; j<n; j++)
            {
                if(i!=j){
                    product*=arr[j];

                }
            }
            ans[i]=product;

        }

        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }

    }

}

//input = 5  (size of array)
     //   arr[]=1 2 3 4 5
//output=120,60,40,30,24