package ex2_abstractfactory;

import ex2_abstractfactory.banking.BankingTeamFactory;
import ex2_abstractfactory.interfaces.Developer;
import ex2_abstractfactory.interfaces.ProjectManager;
import ex2_abstractfactory.interfaces.ProjectTeamFactory;
import ex2_abstractfactory.interfaces.Tester;

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
    }
}
