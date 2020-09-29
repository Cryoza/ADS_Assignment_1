import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TokenFactory tf = new TokenFactory();
        Scanner sc = new Scanner(System.in);
        PostfixExpressionCalculator pec = new PostfixExpressionCalculator();

        System.out.println("Gibe expression - ");
        while(sc.hasNext()) {
            String expression = sc.next();
            tf.parseAndBuildToken(expression).accept(pec);
        }
        System.out.println(pec.getToken());
        sc.close();
    }
}
