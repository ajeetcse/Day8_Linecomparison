public class Main {
    public static void main(String[] args) {
        Line l1 = new Line();

        l1.p1 = new Point();
        l1.p1.x = 10;
        l1.p1.y = 20;

        l1.p2 = new Point();
        l1.p2.x= 5;
        l1.p2.y= 7;
        Line l2 = new Line();
        l2.p1 = new Point();
        l2.p1.x = 100;
        l2.p1.y = 200;

        l2.p2 = new Point();
        l2.p2.x= 50;
        l2.p2.y= 70;
        float length = l1.getLength();
        System.out.println(length);
        float length2 = l2.getLength();
        System.out.println(length2);
    }
}
