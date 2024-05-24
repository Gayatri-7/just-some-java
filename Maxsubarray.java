public class Maxsubarray{
    public static void main(String[] args){
        int a[]={0,1,2,3,4,5};
        int n=a.length;
        int tot=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]);
                    sum=sum+a[k];
                 
                }
                System.out.print(" sum: "+ sum);
                System.out.println();
                tot++;
                 if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("total no arrays: "+tot);
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}