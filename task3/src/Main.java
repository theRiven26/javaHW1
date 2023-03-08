import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("=>");
        String action = iScanner.nextLine();
        iScanner.close();
        action.replace(" ","");
        int indexAction = FindActionPosition(action);
        if (indexAction >= 0) {
            Double x = Double.parseDouble(action.substring(0, indexAction));
            Double y = Double.parseDouble(action.substring(indexAction + 1, action.length()));
            System.out.println(action + " = " + GetAction(action, x, y));
        }
    }
    public static int FindActionPosition(String action){

        int indexAction = - 1;
        if (action.contains("+")){
            indexAction = action.indexOf("+");
        } else if (action.contains("-")) {
            indexAction = action.indexOf("-");
        } else if (action.contains("*")) {
            indexAction = action.indexOf("*");
        } else if (action.contains("/")) {
            indexAction = action.indexOf("/");
        }
        return indexAction;
    }

    public static Double GetAction(String action, Double x, Double y){
        Double errorNum = 9999999999.0;
        if (action.contains("+")){
            return  x + y;
        } else if (action.contains("-")) {
            return  x - y;
        } else if (action.contains("*")) {
            return  x * y;
        } else if (action.contains("/")) {
            return  x / y;
        };
        return errorNum;
    }

}