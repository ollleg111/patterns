package abstractfactory.website;

import abstractfactory.Developer;
import abstractfactory.ProjectManager;
import abstractfactory.ProjectTeamFactory;
import abstractfactory.Tester;

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
