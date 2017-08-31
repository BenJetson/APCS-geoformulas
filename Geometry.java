
/**
 * Computes various geometric formulas based on given values.
 * 
 * @author Ben Godfrey 
 * @version 30 AUG 2017
 */
public class Geometry 
{

    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    public static double triangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        
        return Math.pow((s * (s - a) * (s - b) * (s - c)), (1 / 2));
    }
    
    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
    
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    public static double parallelogramArea(double base, double side) {
        return rectangleArea(base, side);
    }
    
    public static double trapezoidArea(double sideA, double sideB, double height) {
        return (sideA + sideB) / 2.0 * height;
    }
    
    public static double rectPrismVolume(double length, double width, double height) {
        return length * width * height; 
    }
    
    public static double coneVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * (height / 3.0);
    }
    
    public static double rectPrismSurfaceArea(double length, double width, double height) {
        return (2.0 * length * width) + (2.0 * length * height) + (2.0 * width * height);
    }
    
    public static double sphereSurfaceArea(double radius) {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }
    
    public static double pythagorean(double a, double b) {
        return Math.pow((Math.pow(a, 2) * Math.pow(b, 2)), (1.0 / 2.0));
    }
    
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.pow((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)), 
                        (1.0 / 2.0));
    }
    
    public static double slope(double x1, double y1, double x2, double y2) {
        return (y1 - y2) / (x1 - x2);
    }
    
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println(ta1);
        System.out.println(ta2);
        
        double ra1 = rectangleArea(5.2, 9.3);
        System.out.println(ra1);
    }
}
