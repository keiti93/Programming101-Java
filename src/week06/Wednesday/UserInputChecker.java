package week06.Wednesday;

import java.util.Scanner;

import javax.jws.soap.SOAPBinding.Use;

public class UserInputChecker {

    public interface Validator {
        public boolean validate(String input) throws InvalidNameInputException;
    }

    public class FirstNameValidator implements Validator {

        String regex = "^[a-zA-Z\\s]+";

        @Override
        public boolean validate(String input) throws InvalidNameInputException {

            if (!input.matches(regex)) {
                throw new InvalidNameInputException("InvalidNameInputException");
            }

            return true;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        UserInputChecker val = new UserInputChecker();
        UserInputChecker.FirstNameValidator me = val.new FirstNameValidator();

        System.out.println(me.validate(name));

        scanner.close();
    }
}
