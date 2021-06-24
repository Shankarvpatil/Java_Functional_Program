
import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = s.nextDouble();
        System.out.print("Enter b: ");
        double b = s.nextDouble();
        System.out.print("Enter c: ");
        double c = s.nextDouble();

        double deltaValue = delta(a,b,c);  
        System.out.println("Delta value: " + deltaValue);

        double root11 = root1(deltaValue, a, b);    
        System.out.println("Root 1: " + root11);

        double root21 = root2(deltaValue, a, b);    
        System.out.println("Root 2: " + root21);

    }
    
    private static double delta(double a, double b, double c) {
        double delta = (b*b)-(4.0*a*c);
        return delta;
    }

    private  static double root1(double deltaVal, double a, double b) {
        double root1 = (-b+Math.sqrt(deltaVal))/(2*a);
        return root1;
    }

    private  static double root2(double deltaVal, double a, double b) {
        double root2 = (b+Math.sqrt(deltaVal))/(2*a);
        return root2;
    }

}
