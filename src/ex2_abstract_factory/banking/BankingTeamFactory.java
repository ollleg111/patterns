package ex2_abstract_factory.banking;

import ex2_abstract_factory.interfaces.Developer;
import ex2_abstract_factory.interfaces.ProjectManager;
import ex2_abstract_factory.interfaces.ProjectTeamFactory;
import ex2_abstract_factory.interfaces.Tester;

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
