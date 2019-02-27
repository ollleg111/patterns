package abstractfactory.website;

import abstractfactory.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages website ...");
    }
}
