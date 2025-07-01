package luckyLotto;

import java.util.Arrays;
import java.util.Random;

public class LuckyLottoApp {

    public static void main(String[] args) {
        int[] lotto = new int[6];
        Random random = new Random();

        // 랜덤 번호 생성
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = random.nextInt(45) + 1;

            // 중복 제거
            for (int j = 0; j < i; j++) {
                if (lotto[j] == lotto[i]) {
                    i--;
                    break;
                }
            }
        }

        // 오름차순 설정
        for (int i = 0; i < lotto.length; i++) {
            for (int j = i + 1; j < lotto.length; j++) {
                if (lotto[i] > lotto[j]) {
                    int temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
                }
            }
        }
        System.out.println("행운의 번호: " + Arrays.toString(lotto));
    }
}
