import java.util.Scanner;
public class SumOfArrayRecursively {

    //more optimized way to solve this problem is to use the index of the array instead of creating a new array for small problem
    public static int sumOfArray_2(int [] arr, int startIndex){
        //base case
        if( startIndex == arr.length){
            return 0;
        }
        int smallAns = arr[startIndex] + sumOfArray_2(arr, startIndex + 1);
        return smallAns;
    }




    public static int sumOfArray(int [] arr){
        //base case
     if(arr.length == 0){
        return 0;

     }
     int smallAns = arr[0];
        int smallInput[] = new int [arr.length-1];
        for(int i =1; i<arr.length; i++){
            smallInput[i - 1] = arr[i];
        }
        int ans = sumOfArray(smallInput);
        return smallAns + ans;

    }

    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int [] arr = new int [size];
        System.out.println("Enter the elements of the array:");
        for(int i =0; i< size; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = inputArray();
        System.out.println(sumOfArray(arr));
        System.out.println(sumOfArray_2(arr, 0));
    }
}
