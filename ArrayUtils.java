import java.util.Scanner;

public class ArrayUtils {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = takeInput();
        int data=sc.nextInt();
      //  int pos=linearSearch(arr,data);
        int pos=binarySearch(arr,data);
        System.out.println(pos);
       // display(arr);
//        int max=maxValue(arr);
//        System.out.println("Maximum = " + max);
//        reverse(arr);
//        System.out.println("Reversed Array");
//        display(arr);
//        int[] arr1=inverse(arr);
//        System.out.println("Inversed Array");
//        display(arr1);
//34201
        //
//        int[] arr = {3, 0, 1, 4, 2};
//        if(isMirrorInverse(arr))
//            System.out.println("Mirror Inverse");
//        else
//            System.out.println("Not Mirror Inverse");
    }

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value of " + i + "th element");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("End.");
    }

    public static int maxValue(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void reverse(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    public static int[] inverse(int arr[]) {
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            arr1[value] = i;
        }
        return arr1;
    }
    public static boolean isMirrorInverse(int[] arr){
        int arr1[] = inverse(arr);
        int flag=1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=arr1[i]){
                flag=0;
                break;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }
    public static int linearSearch(int[] arr,int data){
        for(int i=0;i<arr.length;i++){
            if(data==arr[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr,int data){
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(data==arr[mid])
                return mid;
            else if(data<arr[mid])
                  right=mid-1;
            else
                    left=mid+1;
        }
        return -1;
    }

}
