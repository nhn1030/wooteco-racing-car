package racingcar.view;

import java.util.List;
import racingcar.model.Car;

public class OutputView {

    public static void printRaceResultHeader() {
        System.out.println("실행 결과");
    }

    public static void printCarProgress(List<Car> cars) {
        for (Car car : cars) {
            System.out.print(car.getCarName() + " : ");
            printCarPosition(car.getCarCurrentPosition());
        }
        System.out.println();
    }

    public static void printCarPosition(int position) {
        for (int i = 0; i < position; i++) {
            System.out.print("-");
        }
        System.out.println();
    }


}