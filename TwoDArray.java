import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr=takeInput();
        //display(arr);
        waveDisplay(arr);
    }
    public static int[][] takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int row=sc.nextInt();
        int[][] arr=new int[row][];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the no of col for "+i+"th row");
            int col=sc.nextInt();
            arr[i]=new int[col];
            for(int j=0;j<col;j++){
                System.out.println("Enter the value for "+i+"th row and "+j+"th col");
                int value=sc.nextInt();
                arr[i][j]=value;
            }
        }
        return arr;
    }
    public static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;i++){
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }
    public static void waveDisplay(int[][] arr){
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[i].length;i++){
                    System.out.print(arr[i][j]+",");
                }
            }
            else
            {
                for(int j=arr[i].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+",");
                }
            }

        }
    }
}
