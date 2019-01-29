import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Binary Number");
        int binary=sc.nextInt();
        int decimal=0;
        int x=0;
        while(binary!=0){
            int rem=binary%10;
            decimal+=(rem*Math.pow(2,x));
            x++;
            binary/=10;
        }
        System.out.println(decimal);
    }
}
