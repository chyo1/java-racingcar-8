package racingcar;

public class Error {
    public void checkCarNamesInput(String carNamesInput) {
        String[] inputs = carNamesInput.split(",");
        for (String input : inputs) {
            if (input.length() > 5 || input.chars().anyMatch(c -> !Character.isLetter(c))) {
                throw new IllegalArgumentException("차의 이름은 5자 이내의 알파벳만 입력 가능합니다.");
            }
        }
    }

    // 시도 횟수 입력 검증
    public void checkTrialCountInputError(String trialCountInput) {
        int trialCount;
        try {
            trialCount = Integer.parseInt(trialCountInput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자만 입력 가능합니다.");
        }

        if (trialCount <= 0 || 100 < trialCount) {
            throw new IllegalArgumentException("시도 횟수는 1에서 100 사이의 자연수만 입력 가능합니다.");
        }
    }
}
