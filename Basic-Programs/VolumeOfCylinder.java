import java.util.*;
public class VolumeOfCylinder {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double r = sc.nextDouble();
double h = sc.nextDouble();
// r is radius, h is height and v is volume
double v = 3.14*r*r*h;
System.out.println("Volume of cylinder: " + v);
}
}
