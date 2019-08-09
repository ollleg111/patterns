package ex16_momento;

public class SaveProgectRunner {

    public static void main(String[] args) {
        Project project = new Project();
        GithubRepo githubRepo = new GithubRepo();

        System.out.println("Creating new Project. Version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("saving current version to GitHub");
        githubRepo.setSave(project.save());

        System.out.println("updating project to Version 1.1");

        System.out.println("Writing poor code ...");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        project.setVersionAndDate("Version 1.1");

        System.out.println(project);

        System.out.println("Something went wrong");

        System.out.println("Rolling back to Version 1.0");
        project.load(githubRepo.getSave());

        System.out.println("Project after rollback: ");
        System.out.println(project);
    }
}
