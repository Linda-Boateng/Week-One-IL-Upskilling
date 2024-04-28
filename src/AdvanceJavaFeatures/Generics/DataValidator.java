package AdvanceJavaFeatures.Generics;

public class DataValidator {
    //Generic Method to validate data
    public static <T> boolean validateData(T data, Validator<T> validator) {
        return validator.validate(data);
    }

    public interface Validator<T> {
        boolean validate(T data);
    }

    public static class NumberValidator implements Validator<Number> {
        @Override
        public boolean validate(Number data) {
            // Specific validation criteria for numbers
            return data.intValue() > 0;
        }
    }

    public static class StringValidator implements Validator<String> {
        @Override
        public boolean validate(String data) {
            // Specific validation criteria for strings
            return data != null && !data.isEmpty();
        }
    }

    public static void main(String[] args) {
        // Validate a number
        int number = 10;
        boolean isNumberValid = validateData(number, new NumberValidator());
        System.out.println("Number is valid: " + isNumberValid);

        // Validate a string
        String text = "Hello";
        boolean isStringValid = validateData(text, new StringValidator());
        System.out.println("String is valid: " + isStringValid);
    }
}
