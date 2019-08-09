package ex2_abstract_factory.banking;

import ex2_abstract_factory.interfaces.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Writes Java banking code ...");
    }
}
