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
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(sumOfArray(arr));
        System.out.println(sumOfArray_2(arr, 0));
    }
}
