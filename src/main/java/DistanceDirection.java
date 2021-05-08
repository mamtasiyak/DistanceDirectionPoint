public class DistanceDirection {
    public static void main(String[] args) {
        Point p=new Point(10,20,30,40);
        System.out.println(distance(p));
        System.out.println(direction(p));
    }
    public static double distance(Point point){
        double xDistance= point.getX2()- point.getX1();
        double yDistance= point.getY2()- point.getY1();
        return Math.sqrt(Math.pow(xDistance,2)+Math.pow(yDistance,2));
    }
    public static double direction(Point point){
        double xDistance= point.getX2()- point.getX1();
        double yDistance= point.getY2()- point.getY1();
        return Math.atan2(yDistance, xDistance);
    }
}
