import java.util.Scanner;

public class factorial_no {
    public  static  void main(String args[]){
        //to find the factorial of a number
        int fact=1;
        Scanner sc =new Scanner(System.in);
        int num =sc .nextInt();
        for(int i=1;i<=num;i++){
            fact=fact*i;

        }
        System.out.println(fact);
    }
}
