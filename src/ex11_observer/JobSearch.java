package ex11_observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobsite jobsite = new JavaDeveloperJobsite();
        jobsite.addVacancy("First Java Position");
        jobsite.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Oleg");
        Observer secondSubscriber = new Subscriber("Igor");

        jobsite.addObserver(firstSubscriber);
        jobsite.addObserver(secondSubscriber);

        jobsite.addVacancy("Third position");

        jobsite.removeVacancy("First Java Position");

    }
}
