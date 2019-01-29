public class LargestOfThree {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        int c=5;
        if(a>=b && a>=c){
            System.out.println("a = " + a + " is the largest number");
        }
        else if(b>=a && b>=c){
            System.out.println("b = " + b + " is the largest number");
       }
        else{
            System.out.println("c = " + c + " is the largest number");
        }
    }
}
