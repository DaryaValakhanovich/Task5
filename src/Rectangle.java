public class Rectangle {
    private Point pointOfUpperLeftCorner;
    private Point pointOfLowerRightCorner;

    public Rectangle(Point pointOfUpperLeftCorner, Point pointOfLowerRightCorner){
        this.pointOfUpperLeftCorner = pointOfUpperLeftCorner;
        this.pointOfLowerRightCorner = pointOfLowerRightCorner;
    }

    public int findSquare(){
        return Math.abs((pointOfUpperLeftCorner.getX() - pointOfLowerRightCorner.getX()) * (pointOfUpperLeftCorner.getY() - pointOfLowerRightCorner.getY()));
    }

    public double findDiagonal(){
        return pointOfUpperLeftCorner.distance(pointOfLowerRightCorner);
    }
}
