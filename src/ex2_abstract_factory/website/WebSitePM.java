package ex2_abstract_factory.website;

import ex2_abstract_factory.interfaces.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages website ...");
    }
}
