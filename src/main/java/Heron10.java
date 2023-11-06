import java.util.Scanner;

public class Heron10 {
    public static void main(String[]  args){
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double x = a;
        for(int i=0;i<10;i++){

            x = (0.5*(x+a/x));
            System.out.println(x);

        }

    }
}
