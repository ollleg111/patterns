package ex2_abstractfactory.website;

import ex2_abstractfactory.interfaces.Developer;

public class PHPDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes website code... ");
    }
}
