//Вывести все простые числа от 1 до 1000
public class Main {
    public static void main(String[] args) {
        int num;
        for (int i = 2; i <= 1000; i++) {
            num = 0;
            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    num += 1;
                }
            }
            if (num == 0) {
                System.out.println(i);
            }
        }
    }
}