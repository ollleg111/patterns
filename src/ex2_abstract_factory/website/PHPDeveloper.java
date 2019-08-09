package ex2_abstract_factory.website;

import ex2_abstract_factory.interfaces.Developer;

public class PHPDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes website code... ");
    }
}
