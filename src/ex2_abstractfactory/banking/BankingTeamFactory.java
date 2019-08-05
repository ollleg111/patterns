package ex2_abstractfactory.banking;

import ex2_abstractfactory.interfaces.Developer;
import ex2_abstractfactory.interfaces.ProjectManager;
import ex2_abstractfactory.interfaces.ProjectTeamFactory;
import ex2_abstractfactory.interfaces.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
