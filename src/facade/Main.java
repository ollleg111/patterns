package facade;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();

    }
}

class Computer {
    Power power = new Power();
    HDD HDD = new HDD();
    CopyData copyData = new CopyData();

    void start(){
        power.printOne();
        HDD.printTwo();
        HDD.hasData();
        copyData.startCopy(HDD);
        copyData.printThree();
        power.printTwo();
    }
}

class Power {

    void printOne() {
        System.out.println("Power ON");
    }
    void printTwo() {
        System.out.println("Power OFF");
    }
}

class HDD {

    private boolean isHDD = true;

    public boolean hasData() {
        return isHDD;
    }

    void printTwo() {
        System.out.println("HDD start");
    }

}

class CopyData {

    void startCopy(HDD t) {
        if (t.hasData()) {
            System.out.println("copy DATA from HDD");
        } else {
            System.out.println("can not copy DATA from HDD");

        }
    }

    void printThree() {
        System.out.println("print CopyData process");
    }

}