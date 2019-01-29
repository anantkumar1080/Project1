import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Decimal Number");
        int decimal=sc.nextInt();
        int p=1;
        int binary=0;
        while(decimal!=0){
            int rem=decimal%2;
            if(rem==1){
                binary=(p*rem)+binary;
                p*=10;
            }
            else
                p*=10;
            decimal/=2;
        }
        System.out.println(binary);
    }
}
