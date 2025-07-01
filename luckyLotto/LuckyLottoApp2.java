package luckyLotto;

import java.util.Arrays;
import java.util.Random;

public class LuckyLottoApp2 {

    public static void main(String[] args) {

        // 로또 5개 세트 만들기
        for (int i = 1; i <= 5; i++) {
            int[] lotto = generateLottoNumburs();
            System.out.println(i + "번 줄 행운 번호 : " + Arrays.toString(lotto));
        }
    }

    public static int[] generateLottoNumburs() {
        int[] lotto = new int[6];
        Random random = new Random();

        // 랜덤 번호 생성
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = random.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--; // < 중복이면 다시 뽑기 설정
                    break;
                }
            }
        }
        // 오름차순 설정
        Arrays.sort(lotto);
        return lotto;
    }
}
