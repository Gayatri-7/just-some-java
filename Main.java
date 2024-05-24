public class Main{
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6};
        int n=a.length;
        int tot=0;
        
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
            }
        }
        System.out.print("total no arrays: "+tot);
    }
}