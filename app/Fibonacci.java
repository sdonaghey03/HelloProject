package app;

/**
 * Created by stephendo on 20/06/2016.
 */
public class Fibonacci {

    public String fibonacci(int limit) {
        int fib_0 = 0, fib_1 = 1;
        int temp = 0;

        String result = "0, 1";

        while(fib_0 + fib_1 < limit) {
            temp = fib_0 + fib_1;
            fib_0 = fib_1;
            fib_1 = temp;

            if((temp % 3) == 0) {
                result += ", " + temp + " (Multiple)";
            }
            else {
                result += ", " + temp;
            }
        }
        return result;
    }
}
