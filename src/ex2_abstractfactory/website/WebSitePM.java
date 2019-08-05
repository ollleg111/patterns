package ex2_abstractfactory.website;

import ex2_abstractfactory.interfaces.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages website ...");
    }
}
