import java.util.Locale;

public class AreaofTriangle {
    public static void main(String[] args) {
        float side1 = 2.0f;
        float side2 = 3.0f;
        float side3 = 4.0f;

        //could add logic to find all the pairs for the sides and check if its greater than other side. To
        // check validity of the triangle.

        double side1square = Math.pow(side1, 2);
        double side2square = Math.pow(side2, 2);
        double area = Math.sqrt(4 * side1square * side2square - Math.pow(side1square + side2square - Math.pow(side3, 2), 2)) / 4;
        System.out.println("Area of triangle:: " + String.format("%1.4f", area));
    }
}
