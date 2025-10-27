package racingcar;

public class Error {
    // 이름이 5자 초과인 경우
    // 알파벳이 아닌 문자가 차의 이름으로 입력될 경우
    // 구분자로 ,가 아닌 특수문자가 들어온 경우


    // 시도 횟수 입력 검증
    public void checkTrialCountInputError(String trialCountInput) {
        try {
            int trialCount = Integer.parseInt(trialCountInput);
            if (trialCount <= 0 || 100 < trialCount) {
                throw new IllegalArgumentException("1에서 100 사이의 자연수만 입력 가능합니다.");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력 가능합니다.");
        }
    }
}
