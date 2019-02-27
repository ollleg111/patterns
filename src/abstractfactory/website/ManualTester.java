package abstractfactory.website;

import abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Tester tests website code ...");
    }
}
