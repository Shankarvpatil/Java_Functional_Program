import java.util.Scanner;

/**
 * We are finding a distance from origin(0,0) to a certain point (x,y).
 */
public class Distance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter x coordinate value: ");
        int x = s.nextInt();
        System.out.print("Enter y coordinate value: ");
        int y = s.nextInt();

        double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.printf("Euclidean Distance is %.2f", distance);
    }
}
