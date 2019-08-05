package ex2_abstractfactory.website;

import ex2_abstractfactory.interfaces.Developer;
import ex2_abstractfactory.interfaces.ProjectManager;
import ex2_abstractfactory.interfaces.ProjectTeamFactory;
import ex2_abstractfactory.interfaces.Tester;

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
