package ex2_abstract_factory;

import ex2_abstract_factory.banking.BankingTeamFactory;
import ex2_abstract_factory.interfaces.Developer;
import ex2_abstract_factory.interfaces.ProjectManager;
import ex2_abstract_factory.interfaces.ProjectTeamFactory;
import ex2_abstract_factory.interfaces.Tester;

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
