package ex8_decorator;

public class Task {
    public static void main(String[] args) {

        Developer developer1 = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));


        System.out.println(developer1.makeJob());
    }
}
