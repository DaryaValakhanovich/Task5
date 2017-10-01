public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 7);
        Point p2 = new Point(6,3);
        Rectangle rectangle1 = new Rectangle(p1, p2);
        System.out.println("Square: " + rectangle1.findSquare() + ". Length of diagonal: " + rectangle1.findDiagonal());
    }
}
