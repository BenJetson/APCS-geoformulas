
/**
 * Computes various geometric formulas based on given values.
 * 
 * @author Ben Godfrey 
 * @version 30 AUG 2017
 */
public class Geometry 
{
    /**
     * Computes the area of a triangle given the base and height.
     * 
     * @param base The length of the base, as a double.
     * @param height The height of the triangle, as a double.
     * 
     * @return The area of the specified triangle.
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    /**
     * Computes the area of a triangle given three side lengths.
     * 
     * @param a Length of the first side, as a double.
     * @param b Length of the second side, as a double. 
     * @param c Length of the third side, as a double.
     * 
     * @return The area of the specified triangle. 
     */
    public static double triangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        
        return Math.sqrt((s * (s - a) * (s - b) * (s - c)));
    }
    
    /** 
     * Computes the area of a rectangle, given the length and width.
     * 
     * @param length The length of the rectangle, as a double.
     * @param width The width of the rectangle, as a double. 
     * 
     * @return The area of the specified rectangle. 
     */
    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
    
    /**
     * Computes the volume of a sphere, given the radius.
     * 
     * @param radius The radius of the sphere, as a double.
     * 
     * @return The volume of the specified sphere.
     */
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Computes the area of a parallelogram, given the base and side lengths. 
     * 
     * @param base The length of the base, as a double.
     * @param side The length of the sides, as a double. 
     * 
     * @return The area of the specified parallelogram.
     */
    public static double parallelogramArea(double base, double side) {
        return rectangleArea(base, side);
    }
    
    /**
     * Computes the area of a trapezoid, given the two bases and the height. 
     * 
     * @param sideA The length of the first base, as a double.
     * @param sideB The length of the second base, as a double. 
     * @param height The height of the trapezoid, as a double. 
     * 
     * @return The area of the specified trapezoid. 
     */
    public static double trapezoidArea(double sideA, double sideB, double height) {
        return (sideA + sideB) / 2.0 * height;
    }
    
    /** 
     * Computes the volume of a rectangular prism, given the length, width, height.
     * 
     * @param length The length of the prism, as a double.
     * @param width The width of the prism, as a double.
     * @param height The height of the prism, as a double.
     * 
     * @return The volume of the specified rectangular prism.
     */
    public static double rectPrismVolume(double length, double width, double height) {
        return length * width * height; 
    }
    
    /**
     * Computes the volume of a cone, given the base radius and height.
     * 
     * @param radius The radius of the base, as a double.
     * @param height The height of the cone, as a double.
     * 
     * @return The volume of the specified cone.
     */
    public static double coneVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * (height / 3.0);
    }
    
    /** 
     * Computes the surface area of a rectangular prism, given the length, width, and height.
     * 
     * @param length The length of the prism, as a double.
     * @param width The length of the prism, as a double.
     * @param height The height of the prism, as a double.
     * 
     * @return The surface area of the specified rectangular prism.
     */
    public static double rectPrismSA(double length, double width, double height) {
        return (2.0 * length * width) + (2.0 * length * height) + (2.0 * width * height);
    }
    
    /** 
     * Computes the surface area of a sphere, given the radius.
     * 
     * @param radius The radius of a sphere, as a double. 
     * 
     * @return The surface area of the specified sphere.
     */
    public static double sphereSA(double radius) {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }
    
    /** 
     * Finds the hypotenuse of a right triangle, given two legs.
     * 
     * @param a The length of the first leg, as a double.
     * @param b The length of the second leg, as a double. 
     * 
     * @return The hypotenuse of the specified right triangle. 
     */
    public static double pythagorean(double a, double b) {
        return Math.pow((Math.pow(a, 2) + Math.pow(b, 2)), (1.0 / 2.0));
    }
    
    /**
     * Computes the distance between two points, given two coordinates.
     * 
     * @param x1 The first x coordinate, as a double.
     * @param y1 The first y coordinate, as a double.
     * @param x2 The second x coordinate, as a double.
     * @param y2 The second y coordinate, as a double.
     * 
     * @return The distance between the two specified points.
     */
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.pow((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)), 
                        (1.0 / 2.0));
    }
    
    /**
     * Computes the slope of a line, given two points. 
     * 
     * @param x1 The first x coordinate, as a double.
     * @param y1 The first y coordinate, as a double.
     * @param x2 The second x coordinate, as a double.
     * @param y2 The second y coordinate, as a double.
     * 
     * @return The slope of the specified line. 
     */
    public static double slope(double x1, double y1, double x2, double y2) {
        return (y1 - y2) / (x1 - x2);
    }
    
    public static void main(String[] args) {
       // BEGIN TESTING
        
        System.out.printf("coneVolume(5,2) = %f%n", coneVolume(5, 2));
        System.out.printf("distance(5,16, 2, 11) = %f%n", distance(5,16, 2, 11));
        System.out.printf("parallelogramArea(3,5) = %f%n", parallelogramArea(3,5));
        System.out.printf("pythagorean(3,4) = %f%n", pythagorean(3,4));
        System.out.printf("rectangleArea(8,6) = %f%n",rectangleArea(8,6));
        System.out.printf("rectPrismSA(2,7,3) = %f%n", rectPrismSA(2,7,3));
        System.out.printf("rectPrismVolume(5,4,9.5) = %f%n", rectPrismVolume(5,4,9.5));
        System.out.printf("slope(-1,4,2,6) = %f%n", slope(-1,4,2,6)); 
        System.out.printf("sphereSA(4) = %f%n", sphereSA(4));
        System.out.printf("sphereVolume(8.5) = %f%n", sphereVolume(8.5));
        System.out.printf("trapezoidArea(2, 6, 7) = %f%n", trapezoidArea(2, 6, 7));
        System.out.printf("triangleArea(3.6, 9) = %f%n", triangleArea(3.6, 9));
        System.out.printf("triangleArea(3.6, 4.9, 5.1) = %f%n", triangleArea(3.6, 4.9, 5.1));
    }
}
