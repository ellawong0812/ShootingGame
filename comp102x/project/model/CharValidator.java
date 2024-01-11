package comp102x.project.model;

public class CharValidator {

    public boolean validateChar(char c) {

        boolean isValid = false;

        isValid = isValid || c >= 'A' && c <= 'Z';
        isValid = isValid || c >= 'a' && c <= 'z';
        isValid = isValid || c >= '0' && c <= '9';
        isValid = isValid || c == ' ';

        return isValid;
    }

}
