import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = iScanner.nextInt();
        iScanner.close();
        System.out.println( "sum = " + triangularNum(number));
        System.out.println( "factorial = " + factorialNum(number));
    }

    public static int triangularNum(int num){
        int triSum = 0;
        for (int i = 0; i <= num; i++ ){
            triSum += num - i;
        }
        return triSum;
    }

    public static int factorialNum(int num){
        int faSum = 1;
        for (int i = 0; i < num; i++ ){
            faSum *= (num - i);
        }
        return faSum;
    }
}