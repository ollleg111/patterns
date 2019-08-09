package ex2_abstract_factory.banking;

import ex2_abstract_factory.interfaces.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QATester tests QA banking code ...");
    }
}
