public class count_digits {
    public static void main(String agrs[]){
        //count number of digits in number
        int num=12;
        int count =0;
        while(num!=0){
            //num=num/10
            //12/10=1
            num/=10;
            count++;
        }
        System.out.println(count);

    }
}
