/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        // rewrite old code using while loop instead of for loop;
        // while (conditino) {do something}
        int i = 1;
        while (i < 100) {
            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        boolean divisibleby3 = i % 3 == 0;
        boolean divisibleby5 = i % 5 == 0;
        if (divisibleby3 && divisibleby5) {
            System.out.println("Fizz Buzz");
            i++;
        } else if (divisibleby3) {
            System.out.println("Fizz");
            i++;
        } else if (divisibleby5) {
            System.out.println("Buzz");
            i++;
        } else {
            System.out.println(i);
            i++;
        }
        return i;
    }
}



