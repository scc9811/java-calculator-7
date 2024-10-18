package calculator.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {
    private final static String ADDITION_INPUT_PROMPT_MESSAGE = "덧셈할 문자열을 입력해 주세요.";
    private final static String DEFAULT_DELIMITERS = ",:";

    public String getAdditionInput() {
        System.out.println(ADDITION_INPUT_PROMPT_MESSAGE);
        String additionInput = Console.readLine();
        return additionInput;
    }

    private void validate() {

    }

    private boolean containsCustomDelimiter(String additionInput) {
        if(additionInput.length() >= 5 && additionInput.startsWith("//") && additionInput.substring(3, 5).equals("\\n")) return true;
        return false;
    }

    private Character getCustomDelimiter(String additionInput) {
        return additionInput.charAt(2);
    }

    private String deleteCustomDelimiter(String additionInput) {
        return additionInput.substring(5);
    }

    private List<String> separateStringToList(String s, String delimiters) {
        List<String> tokens = List.of(s.split(delimiters));
        return tokens;
    }

    private List<Integer> getOperands(String additionInput, String delimiters) {
        List<String> separatedInput = separateStringToList(additionInput, delimiters);
        List<Integer> operands = new ArrayList<>();
        for(String token : separatedInput) {
            try {
                operands.add(Integer.parseInt(token));
            }
            catch (IllegalArgumentException e) {
                throw new IllegalArgumentException();
            }
        }
        return operands;
    }

}
