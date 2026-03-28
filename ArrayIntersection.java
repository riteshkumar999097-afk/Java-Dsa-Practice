public class ArrayIntersection {
   public static int unique(int [] arr){
    int ans = 0;
    for(int i = 0; i < arr.length; i++){
        ans = ans ^ arr[i];
   }

    }
    public static void main(String [] args){
        int [] arr = {1,2,3,5,8,5,3,2,1};
    System.out.println("Equilibrium index: " + equillibrium(arr));


   
    }

}

