import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        final int ANSWER = 57; // プログラマが設定する2桁の正の整数（例: 57）
        final int MAX_TRIES = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("数あてゲームを始めます！（2桁の正の整数を当ててください）");

        for (int i = 1; i <= MAX_TRIES; i++) {
            System.out.print(i + "回目の入力: ");
            int guess = scanner.nextInt();

            // 入力が2桁の正の整数でない場合は無効とする
            if (guess < 10 || guess > 99) {
                System.out.println("無効な入力です。2桁の正の整数を入力してください。");
                i--; // 試行回数はカウントしない
                continue;
            }

            if (guess == ANSWER) {
                System.out.println("当たり！");
                break;
            } else {
                int diff = Math.abs(guess - ANSWER);
                if (guess < ANSWER) {
                    System.out.print("設定された数はもっと大きいです。");
                } else {
                    System.out.print("設定された数はもっと小さいです。");
                }

                if (diff >= 20) {
                    System.out.print("（差が20以上あります）");
                }
                System.out.println();
            }

            if (i == MAX_TRIES) {
                System.out.println("残念！正解は " + ANSWER + " でした。");
            }
        }

        scanner.close();
    }
}
