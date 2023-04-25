public class Main {
    public static String calc(String input) throws Exception {
        int a;
        int b;
        char operation;
        int result = 0;
        String[] numbers;
        boolean isRome = false;
        String output;

        if (input.matches("\\d{1,2}\s[\\+\\*/-]\s\\d{1,2}")) {
            numbers = input.split("\s[\\+\\*/-]\s");
            operation = (input.substring(numbers[0].length() + 1, numbers[0].length() + 2)).charAt(0);
            a = Integer.parseInt(numbers[0]);
            b = Integer.parseInt(numbers[1]);
        } else {
            if (input.matches("[IVX]{1,4}\s[\\+\\*/-]\s[IVX]{1,4}")) {
                numbers = input.split("\s[\\+\\*/-]\s");
                operation = (input.substring(numbers[0].length() + 1, numbers[0].length() + 2)).charAt(0);
                a = Rome.convertToArab(numbers[0]);
                b = Rome.convertToArab(numbers[1]);
                isRome = true;
            } else {
                throw new Exception();
            }
        }

        if (a <= 0 || a > 10 || b <= 0 || b > 10) {
            throw new Exception();
        }

        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }

        if (isRome) {
            if (result <= 0) {
                throw new Exception();
            } else {
                output = Rome.convertToRome(result);
            }
        } else {
            output = String.valueOf(result);
        }

        return output;
    }
}
