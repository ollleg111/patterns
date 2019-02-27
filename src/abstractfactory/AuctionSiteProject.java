package abstractfactory;


import abstractfactory.website.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {

        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        projectTeamFactory.getDeveloper().writeCode();
        projectTeamFactory.getTester().testCode();
        projectTeamFactory.getProjectManager().manageProject();

        System.out.println("Get started for Web Site");

        // комментарий для переключения на другую верку в гите
        /*
        test

         */
        // комментарий в гите -3-
    }
}
