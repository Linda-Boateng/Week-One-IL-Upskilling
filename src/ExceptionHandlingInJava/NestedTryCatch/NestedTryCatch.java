package ExceptionHandlingInJava.NestedTryCatch;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] numbers = null; // Setting the array to null
            System.out.println("Array length: " + numbers.length);

            try {
                // Inner try block
                System.out.println("Accessing element at index 0: " + numbers[0]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds: " + e.getMessage());
            }
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e.getMessage());
        }
    }
}
