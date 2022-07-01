public class armstrong_no {
    public static void main(String args[]){
        //armstrong number
        int num=371;
        int t1=num;
        int length=0;
        //to find no of digits in the number
        while(t1!=0){
            t1=t1/10;
            length=length+1;
        }
        //find armstrong by reverse a number
        int t2=num;
        int arm=0;
        int rem;
        while(t2!=0) {
            int mul = 1;
            rem = t2 % 10;
            for (int i = 1; i <= length; i++) {
                mul = mul * rem;

            }
            arm = arm + mul;
            t2 = t2 / 10;
        }
        if(num==arm){
            System.out.println("armstrong number");
        }
        else {
            System.out.println("not armstrong number");
        }

    }
}
