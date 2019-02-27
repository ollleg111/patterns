package delegat;

public class Main {

    public static void main(String[] args) {

        Painters  painters = new Painters();

        painters.setDrawing(new Square());
        painters.drawSomething();

        painters.setDrawing(new Triangle());
        painters.drawSomething();

        painters.setDrawing(new Circle());
        painters.drawSomething();

    }
}
