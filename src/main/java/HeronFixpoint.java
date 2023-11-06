import java.util.Scanner;

public class HeronFixpoint {
    public static void main(String[]  args){
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double x = a;
        double prevX;
        int iterations = 0;

        do {
            prevX = x;
            x = 0.5 * (x + a / x);
            iterations++;
        } while (x != prevX);
        System.out.println("Fixpunkt der Rekursionsgleichung: " + x);
        System.out.println("Anzahl der Iterationen: " + iterations);

    }
}
