//3
public class Main {
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int n=arr.length;
        long m = Kadanes(arr,n);
        System.out.println("max-subarray is: "+ m );
    }
    static long Kadanes(int arr[],int n){
        long sum=0;
        long max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if(sum<0){
                sum=0;

            }
            if(sum>max){
                max=sum;

            }

        }
        return max;

    }
}