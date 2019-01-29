public class PrimeUpToRange {
    public static void main(String[] args) {
        int num = 20;
        for (int i = 2; i <= num; i++) {
            int flag = 0;
            for (int j = 2; j * j <= i ; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
