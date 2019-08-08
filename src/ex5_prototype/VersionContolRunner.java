package ex5_prototype;

public class VersionContolRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "super project", "SourceCode sourceCode = " +
                "new SourceCode();");

        System.out.println(master);

//        Project masterClone = (Project) master.copy();
//        System.out.println(masterClone);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        System.out.println(masterClone);
    }
}
