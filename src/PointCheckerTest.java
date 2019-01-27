public class PointCheckerTest {

    public static void main(String[] args) {

        Point[] points = new Point[5];
        points[0] = new Point(3, 9);
        points[1] = new Point(-2, 5);
        points[2] = new Point(-1, -2);
        points[3] = new Point(4, -7);
        points[4] = new Point(0,0);

        PointChecker pointChecker = new PointChecker();

        for(int i=0; i<points.length ; i++ ){
            pointChecker.checkWhereIsPoint(points[i]);
        }
    }
}
