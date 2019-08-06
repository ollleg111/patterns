package ex3_singleton;

public class ProgramRunner {
    public static void main(String[] args) {
//        System.out.println(ProgramLogger.getProjectLogger().toString());
//        System.out.println(ProgramLogger.getProjectLogger().toString());
//        System.out.println(ProgramLogger.getProjectLogger().toString());
//        System.out.println(ProgramLogger.getProjectLogger().toString());
//        System.out.println(ProgramLogger.getProjectLogger().toString());
//        System.out.println(ProgramLogger.getProjectLogger().toString());

        ProgramLogger.getProjectLogger().addInfo("first log...");
        ProgramLogger.getProjectLogger().addInfo("second log...");
        ProgramLogger.getProjectLogger().addInfo("third log...");

        ProgramLogger.getProjectLogger().showLogFile();
    }
}
