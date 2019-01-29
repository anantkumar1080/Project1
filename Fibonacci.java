public class Fibonacci {
    public static void main(String[] args) {
        int n=100;
        int a=0;
        int b=1;
        System.out.print(a + " " + b);
        int sum=a+b;
        while(sum<=n){
            System.out.print(" " + sum);
            sum=a+b;
            a=b;
            b=sum;
        }
    }
}
