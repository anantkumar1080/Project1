public class Prime {
    public static void main(String[] args) {
        int num = 49;
        int flag = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("PRIME");
        } else
            System.out.println("NOT PRIME");
    }
}
