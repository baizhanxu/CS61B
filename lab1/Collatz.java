/** Class that prints the Collatz sequence starting from a given number.
 *  @baizhanxu YOUR NAME HERE
 */
public class Collatz {

    /** return  */
    public static int nextNumber(int n) {
        return (n * 3 + 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");

        while (n != 1) {

            if (n % 2 == 0){
                n /= 2;
                System.out.print(n + " ");
            } else {
                n = nextNumber(n);
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}

