public class CheckSortedRecursively{

    public static boolean checkSorted(int [] arr){
        //base case
        if(arr.length<= 1){
            return true;
        }
        // calculation or process it can be done either after small problem or before smallProblem
        if(arr[0]> arr[1]){
            return false;
        }

        // small problem if it solved we can answer the actual question
        int smallInput[] = new int [arr.length-1];
        for(int i =1; i< arr.length; i++){
            smallInput[i - 1] = arr[i];
        }
        boolean ans = checkSorted(smallInput);

        return ans;

// we didn't used this because boolean ans is the final answer we needed
      /*   if(!ans){
            return false;
        }else{
            return true;
        } */

    }
    public static void main(String[] args){

        int [] arr = {1,2,3,9,4,5,8,9};
        System.out.println(checkSorted(arr));
}
}