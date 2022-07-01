import java.util.Scanner;

public class gcd_oftwo_no {
    public static void main(String args[]) {
        // gcd is also called hcf of maths
        //find hcf of two number
        Scanner sc =new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int hcf=1;
        for(int i=1;i<=num1 &&i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                hcf=i;
            }
        }
        System.out.println(hcf);

    }

}