public class fibonacci_no {
    public static void main(String args[]) {
        //to print fibonacci series
        int f1 = 0;
        int f2 = 1;
        int num = 3;
        System.out.println(f1);
        System.out.println(f2);
        for (int i = 1; i <= num; i++) {
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            System.out.println(f3);
        }

    }
}
