package abstractfactory;


import abstractfactory.banking.BankingTeamFactory;

public class SuperBankSystem {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Create SUPER bank system ...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

        // комментарий для переключения на другую верку в гите
        /*
        test

         */
    }
}
