package ex1_factory.factory.bestcode;

public class Program {

    public static void main(String[] args) {
//        Developer developer = new JavaDeveloper();
//        developer.writeCode();
//
//        Developer developer1 = new CppDeveloper();
//        developer1.writeCode();

//        DeveloperFactory developerFactory = new JavaDeveloperFactory();
//        Developer developer = developerFactory.createDeveloper();
//        developer.writeCode();

//        DeveloperFactory developerFactory1 = new CppDeveloperFactory();
//        Developer developer1 = developerFactory1.createDeveloper();
//        developer1.writeCode();

        DeveloperFactory developerFactory = createDeveloperBySpeciality("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();


    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality) {

        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown speciality");
        }
    }

}
