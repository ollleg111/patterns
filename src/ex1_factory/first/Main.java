package ex1_factory.first;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

//        Watch watch = new DigitalWatch();
//        watch.showTime();

//        WatchMaker maker = new DigitalWatchMaker();
//        Watch watch = maker.createWatch();
//        watch.showTime();

        WatchMaker maker = getWatchName("Digital");
        Watch watch = maker.createWatch();
        watch.showTime();

    }

    static WatchMaker getWatchName(String maker) {
        if (maker.equals("Digital"))
            return new DigitalWatchMaker();
        else if (maker.equals("Rome"))
            return new RomeWatchMaker();
        throw new RuntimeException("wrong name of watch " + maker);
    }

}

interface Watch {
    void showTime();
}

class DigitalWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}

class RomeWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println("X");
    }
}

interface WatchMaker {
    Watch createWatch();
}

class DigitalWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}

class RomeWatchMaker implements WatchMaker {


    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}