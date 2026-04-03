import java.util.Scanner;
public class HelloWorld3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("enter the number of times you want to print Hello, World!");
         int n= scanner.nextInt();
         int i=0;
    while(i<n){
        System.out.println("Hello, World!");
        int j=0;
        while(j<3){
            System.out.println("hii");
            j++;
        }
        i++;
    }
    scanner.close();
}
}
