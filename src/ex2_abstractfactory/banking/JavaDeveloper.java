package ex2_abstractfactory.banking;

import ex2_abstractfactory.interfaces.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Writes Java banking code ...");
    }
}
