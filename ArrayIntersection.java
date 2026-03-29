import java.util.Scanner;

public class ArrayIntersection {
   public static int equillibrium(int [] arr){
    int totalSum = 0;
    for(int i = 0; i < arr.length; i++){
        totalSum = totalSum + arr[i];
   }
   int leftSum = 0;
   for(int j=0; j < arr.length; j++){
     System.out.println("totalSum: " + totalSum + " leftSum: " + leftSum+ " arr[j]: " + arr[j]);
    int rightSum = totalSum - leftSum -arr[j];

   
    if(leftSum == rightSum){
        return arr[j];
    }else{
        leftSum += arr[j];
    }
    
   }
   return -1;
   }

   public static int[] inputArray(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");    
    int n = sc.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter the elements of the array: ");
    for(int i = 0; i < arr.length; i++){
        arr[i] = sc.nextInt();
    }
    return arr;
   }

   public static void printArray(int [] arr){
    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
   }


    public static void main(String [] args){
        int [] arr = inputArray();
        printArray(arr);
    System.out.println("Equilibrium index: " + equillibrium(arr));


   
    }

}

