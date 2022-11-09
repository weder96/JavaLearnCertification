/**
 * This program output System.out.print
 * @version 0.01 2021-03-15
 * @author Weder Sousa
 */
import java.util.Date;

public class FormattingOutput {
    public static void main(String... args) {
        double x = 10000.0 / 3.0;
        // System.out.print(x);
        // System.out.printf("%8.2f", x);
        String name = "Weder";
        int age = 25;        
        // System.out.printf ("Olá,%s. No próximo ano, você estará %d", name, age);
        String message = String.format("Hello, %s. Next year, you'll be %d", name, age);
        //System.out.print(message);
        //System.out.printf("%tc", new Date());

        System.out.printf("%1$s %2$tB %2$te, %2$tY", "Data de vencimento:", new Date());

        System.out.printf("%s %tB %<te, %<tY", "Data de vencimento:", new Date());
    }
}