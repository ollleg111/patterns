package ex2_abstractfactory.banking;

import ex2_abstractfactory.interfaces.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project ...");
    }
}
