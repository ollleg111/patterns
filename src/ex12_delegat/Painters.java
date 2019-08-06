package ex12_delegat;

interface Drawing {
    void draw();
}


public class Painters {

    private Drawing drawing;

    public void setDrawing(Drawing drawing) {
        this.drawing = drawing;
    }

    void drawSomething(){
        drawing.draw();
    }
}

class Triangle implements Drawing {

    @Override
    public void draw() {
        System.out.println("Drawing triangle");
    }
}

class Circle implements Drawing {

    @Override
    public void draw() {
        System.out.println("Driving circle");
    }
}

class Square implements Drawing {

    @Override
    public void draw() {
        System.out.println("Driving square");
    }
}