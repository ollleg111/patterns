package ex2_abstractfactory.banking;

import ex2_abstractfactory.interfaces.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QATester tests QA banking code ...");
    }
}
