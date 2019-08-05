package ex2_abstractfactory.website;

import ex2_abstractfactory.interfaces.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Tester tests website code ...");
    }
}
