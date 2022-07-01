import java.util.Scanner;

public class lcm_no {
    public static  void main(String args[]){
        // lcm of two number
//        Scanner sc =new Scanner(System.in);
//        int num1=sc.nextInt();
//        int num2=sc.nextInt();
//        int lcm=1;
//        int hcf=1;
//        for(int i=1;i<=num1 &&i<=num2;i++){
//            if(num1%i==0 && num2%i==0){
//                hcf=i;
//            }
//        }
//        lcm=(num1*num2)/hcf;
//        System.out.println(lcm);

        //another way
        int n1 = 72, n2 = 120, lcm;

        // maximum number between n1 and n2 is stored in lcm
        lcm = (n1 > n2) ? n1 : n2;

        // Always true
        while(true) {
            if( lcm % n1 == 0 && lcm % n2 == 0 ) {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                break;
            }
            ++lcm;
        }

    }
}
