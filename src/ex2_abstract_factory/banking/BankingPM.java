package ex2_abstract_factory.banking;

import ex2_abstract_factory.interfaces.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project ...");
    }
}
