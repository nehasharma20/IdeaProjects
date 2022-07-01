public class prime_no {
    public  static void main(String agrs[]){
        //check weather the number is prime or not
        int num=2;
        int count=0;
        int i=1;
        while(i<=num){
            if(num%i==0){
                count=count+1;
            }
            i=i+1;
        }
        if(count==2){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}
