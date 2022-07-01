public class reverse_no {
    public static void main(String args[]){
        //to reverse a number
        int num=12;
        int rev=0;
        while (num!=0){

            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println(rev);
    }
}
