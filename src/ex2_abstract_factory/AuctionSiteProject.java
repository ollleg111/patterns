package ex2_abstract_factory;

import ex2_abstract_factory.interfaces.ProjectTeamFactory;
import ex2_abstract_factory.website.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {

        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        projectTeamFactory.getDeveloper().writeCode();
        projectTeamFactory.getTester().testCode();
        projectTeamFactory.getProjectManager().manageProject();

        System.out.println("Get started for Web Site");
    }
}
