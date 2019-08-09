package ex2_abstract_factory.website;

import ex2_abstract_factory.interfaces.Developer;
import ex2_abstract_factory.interfaces.ProjectManager;
import ex2_abstract_factory.interfaces.ProjectTeamFactory;
import ex2_abstract_factory.interfaces.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PHPDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }
}
