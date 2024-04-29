public class PrimeNumber {
    public static void main(String[]args){
        int i;int j;int a = 5;
        for(i=1;i<=a;i++){
            int count=0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
    }
}
