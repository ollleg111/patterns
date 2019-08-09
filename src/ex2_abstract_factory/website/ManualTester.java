package ex2_abstract_factory.website;

import ex2_abstract_factory.interfaces.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Tester tests website code ...");
    }
}
