public class palindrome {
    public static void main(String args[]) {
        //palindrome number
        int num = 121;
        int orgnum=num;
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;

        }
        if (orgnum ==rev) {
            System.out.println("the number is palindrome");
        } else {
            System.out.println("the number is not palindrome");
        }

        //palindrome of string
        String str = "Radar", reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
