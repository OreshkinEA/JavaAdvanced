import calculator.Operation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class tests {

    @Test
    public void scoreSum() throws Exception {
        Operation operation = new Operation();
        Double x = 1.1;
        Double y = 2.2;
        String z = "+";
        operation.setResult(x, y, z);
       // Assert.assertEquals("Сумма неверна", 3.3000000000000003 , 0);
        Assert.assertEquals(3.3000000000000003, operation.getResult(), 0);
    }

    @Test
    public void scoreSub() throws Exception {
        Operation operation = new Operation();
        Double x = 2.2;
        Double y = 1.1;
        String z = "-";
        operation.setResult(x, y, z);
        Assert.assertEquals(1.1, operation.getResult(), 0);
    }

    @Test
    public void scoreMul() throws Exception {
        Operation operation = new Operation();
        Double x = 2.2;
        Double y = 3.3;
        String z = "*";
        operation.setResult(x, y, z);
        Assert.assertEquals(7.26, operation.getResult(), 0);
    }

    @Test
    public void scoreDiv() throws Exception {
        Operation operation = new Operation();
        Double x = 6.6;
        Double y = 2.2;
        String z = "/";
        operation.setResult(x, y, z);
        Assert.assertEquals(2.9999999999999996, operation.getResult(), 0);
    }

    @Test
    public void tryDivisionByZero() throws Exception {
        Throwable exception = assertThrows(
                Exception.class,
                () -> {
                    Operation operation = new Operation();
                    Double x = 6.6;
                    Double y = 0.0;
                    String z = "/";
                    operation.setResult(x, y, z);
                }
        );
        Assert.assertEquals("Division by zero", exception.getMessage());
    }

    @Test
    public void tryDivisionZeroByZero() throws Exception {
        Throwable exception = assertThrows(
                Exception.class,
                () -> {
                    Operation operation = new Operation();
                    Double x = 0.0;
                    Double y = 0.0;
                    String z = "/";
                    operation.setResult(x, y, z);
                }
        );
        Assert.assertEquals("Division zero by zero", exception.getMessage());
    }

    @Test
    public void operationNotSelected() {
        Throwable exception = assertThrows(
                Exception.class,
                () -> {
                    Operation operation = new Operation();
                    Double x = 0.0;
                    Double y = 0.0;
                    String z = "";
                    operation.setResult(x, y, z);
                }
        );
        Assert.assertEquals("Operation not selected", exception.getMessage());
    }
}