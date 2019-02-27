package abstractfactory;


import abstractfactory.website.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {

        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        projectTeamFactory.getDeveloper().writeCode();
        projectTeamFactory.getTester().testCode();
        projectTeamFactory.getProjectManager().manageProject();

        System.out.println("Get started for Web Site");

    }
}
