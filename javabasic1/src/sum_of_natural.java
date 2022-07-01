import java.util.Scanner;

public class sum_of_natural {
    public static  void  main(String args[]){
        //sum of natural number
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int num=sc.nextInt();
        int  sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println(sum);




    }
}
