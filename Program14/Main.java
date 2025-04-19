package Program14;

public class Main {
    public static void main(String[] args) {
        try {
            int[] nums = {1, 2, 3};
            System.out.println(nums[5]); // Causes ArrayIndexOutOfBoundsException
            int x = 10 / 0;              // Will not be reached
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Caught Exception: " + e);
        } finally {
            System.out.println("Cleanup done");
        }
    }
}

