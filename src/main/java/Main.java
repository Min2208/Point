public class Main {
    public static void main(String[] args) {
        MovablePoint point=new MovablePoint(5,10);
        point.setXY(5,5);

        System.out.println(point.move());
    }
}
