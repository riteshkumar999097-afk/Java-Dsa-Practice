public class StaticVsMain{
    public static int sum(int [] arr, int startIndex){
        if(arr.length == startIndex){
            return 0;
        }
        int sum = arr[startIndex] + sum(arr, startIndex+1);
        return sum;
    }
    static{
        int [] arr = {1, 2, 3, 4, 5};
        int result = sum(arr, 0);   
        System.out.println("This is static block "+result);
    }
     public int lcm(int a, int b){
        int min = Math.min(a, b);
        int gcd = 1;
           for(int i = 1; i <= min; i++){
               if(a % i == 0 && b % i == 0){
                    gcd = i;
               }
           
            
           
           }
            return (a * b) / gcd;
        }
    
    public static void main(String[] args) {
        System.out.println("This is main method");
    int a = 12, b = 15;
    StaticVsMain obj = new StaticVsMain();
    int lcmResult = obj.lcm(a, b);
    System.out.println("LCM of " + a + " and " + b + " is: " + lcmResult);
    }
    
}