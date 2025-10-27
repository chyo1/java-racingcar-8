package racingcar;

public class Car {
    private String name;
    private int movingCount;

    // 생성자
    public Car(String name) {
        this.name = name;
        movingCount = 1;
    }

    // 전진 횟수 출력
    public String printMoving() {
        StringBuilder sb = new StringBuilder();

        sb.append(name).append(" : ");
        for (int i = 0; i < movingCount; i++) {
            sb.append("-");
        }
        return sb.toString();
    }

    public void move() {
        movingCount++;
    }
}
