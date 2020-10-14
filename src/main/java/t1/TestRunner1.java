package t1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static java.lang.System.exit;

public class TestRunner1 {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestJUnitSuite.class);

        if (result.wasSuccessful()) {
            System.out.println("Successful.");
            exit(0);
        } else {
            System.out.println("Not successful.");
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
            exit(1);
        }
    }
}
