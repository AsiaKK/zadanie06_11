public class PointChecker {

    public void checkWhereIsPoint(Point inputPoint) {
        int x = inputPoint.getX();
        int y = inputPoint.getY();

        if (x==0 && y==0){
            System.out.println("To jest środek układu współrzędnych.");
        }else if (x >= 0 && y >= 0) {
            System.out.println("Punkt znajduje się w pierwszej ćwiartce.");
        } else if (x < 0 && y >= 0) {
            System.out.println("Punkt znajduje się w drugiej ćwiartce.");
        } else if (x < 0 && y < 0) {
            System.out.println("Punkt znajduje się w trzeciej ćwiartce.");
        } else {
            System.out.println("Punkt znajduje się w czwartej ćwiartce.");
        }
    }
}
