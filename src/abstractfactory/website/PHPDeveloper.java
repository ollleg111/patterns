package abstractfactory.website;

import abstractfactory.Developer;

public class PHPDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes website code... ");
    }
}
