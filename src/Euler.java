// By: Ryan Dabir
public class Euler {

    public static void main(String[] args) {

        Euler euler = new Euler();
        //euler.question1();
        //euler.question2();
        euler.question4();
    }

    //https://projecteuler.net/problem=1
    public void question1() {

        int nums[] = new int[500];
        int numsIndex = 0;
        int sum = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                numsIndex++;
                nums[numsIndex] = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);
    }

    //https://projecteuler.net/problem=2
    public void question2() {

        long fibNum1 = 0;
        long fibNum2 = 1;
        long temp = 0;

        long sum = 0;

        while (fibNum2 < 4000000L) {
            temp = fibNum1;
            fibNum1 = fibNum2;
            fibNum2 += temp;

            if(fibNum2 % 2 == 0) {
                sum += fibNum2;
            }
        }

        System.out.println(sum);
    }

    //https://projecteuler.net/problem=4
    public void question4() {

        int product;
        String stringPro;
        char[] charArray;
        int result = 0;

        for (int i=100; i < 1000; i++) {
            for (int j=100; j < 1000; j++) {
                product = i * j;
                stringPro = String.valueOf(product);
                int n = stringPro.length();
                charArray = stringPro.toCharArray();
                boolean flag = false;
                int num = (n)/2;
                for (int k = 0; k < Math.floor(num); k++) {
                    if (charArray[k] == charArray[n-k-1]) {
                        flag = true;
                    }
                    else {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    if (result < Integer.valueOf(stringPro)) {
                        result = Integer.valueOf(stringPro);
                    }
                }
            }
        }
        System.out.println(result);
    }
}
