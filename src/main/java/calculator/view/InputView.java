package calculator.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class InputView {
    private final static String ADDITION_INPUT_PROMPT_MESSAGE = "덧셈할 문자열을 입력해 주세요.";
    private final static String DEFAULT_DELIMITERS = ",:";

    public String getAdditionInput() {
        System.out.println(ADDITION_INPUT_PROMPT_MESSAGE);
        String AdditionInput = Console.readLine();

    }

    private void validate() {

    }

    private boolean containsCustomDelimiter(String additionInput) {
        if(additionInput.length() >= 5 && additionInput.startsWith("//") && additionInput.substring(3, 5).equals("\\n")) return true;
        return false;
    }

    private Character getCustomDelimiters(String additionInput) {
        return additionInput.charAt(2);
    }

    private List<Integer> getOperands(String additionInput, String delimiters) throws IllegalArgumentException {
        List<String> separatedInput = separateStringToList(additionInput, delimiters);

    }

    private List<String> separateStringToList(String s, String delimiters) {
        List<String> tokens = List.of(s.split(delimiters));
        return tokens;
    }
}
