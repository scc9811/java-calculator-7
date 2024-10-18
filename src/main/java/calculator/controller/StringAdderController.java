package calculator.controller;

import calculator.service.AdderService;
import calculator.view.InputView;
import calculator.view.OutputView;

public class StringAdderController {
    private final InputView inputView;
    private final OutputView outputView;

    private final AdderService adderService;

    public StringAdderController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.adderService = new AdderService();
    }

    public void run() {
        // 입력

        // 입력 파싱처리

        // 로직(덧셈)

        //출력


    }

}
