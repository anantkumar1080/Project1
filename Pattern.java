//import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int[][] arr=new int[7][5];
        int mid1=3;
        int mid2=2;
        int k=mid1+1;
        for(int i=0;i<5;i++){
            for(int j=0;j<7;j++){

                if(i>mid2){
                    if(j==mid1 || (j>=i-1 && j<=mid1-i+k))
                        System.out.print("- ");
                    else
                        System.out.print("* ");

                }
                else{
                    if(j==mid1 || (j>=mid1-i && j<=mid1+i))
                        System.out.print("- ");
                    else
                        System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
}
