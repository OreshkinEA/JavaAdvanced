import calculator.Operation;
import org.junit.Assert;
import org.junit.Test;

public class tests {

    @Test
    public void scoreSum() throws Exception {
        Operation operation = new Operation();
        String x = "1.1";
        String y = "2.2";
        operation.setZ("+");
        operation.setResult(x, y);
        Assert.assertEquals(3.3000000000000003, operation.getResult(), 0);
    }

    @Test
    public void scoreSub() throws Exception {
        Operation operation = new Operation();
        String x = "2.2";
        String y = "1.1";
        operation.setZ("-");
        operation.setResult(x, y);
        Assert.assertEquals(1.1, operation.getResult(), 0);
    }

    @Test
    public void scoreMul() throws Exception {
        Operation operation = new Operation();
        String x = "2.2";
        String y = "3.3";
        operation.setZ("*");
        operation.setResult(x, y);
        Assert.assertEquals(7.26, operation.getResult(), 0);
    }

    @Test
    public void scoreDiv() throws Exception {
        Operation operation = new Operation();
        String x = "6.6";
        String y = "2.2";
        operation.setZ("/");
        operation.setResult(x, y);
        Assert.assertEquals(2.9999999999999996, operation.getResult(), 0);
    }


    @Test(expected = Exception.class)
    public void tryDivisionByZero() throws Exception {
        Operation operation = new Operation();
        String x = "6.0";
        String y = "0.0";
        operation.setZ("/");
        operation.setResult(x, y);
    }

    @Test(expected = Exception.class)
    public void tryDivisionZeroByZero() throws Exception {
        Operation operation = new Operation();
        String x = "0.0";
        String y = "0.0";
        operation.setZ("/");
        operation.setResult(x, y);
    }

    @Test(expected = Exception.class)
    public void operationNotSelected() throws Exception {
        Operation operation = new Operation();
        String x = "0.0";
        String y = "0.0";
        operation.setZ("");
        operation.setResult(x, y);
    }

    @Test(expected = Exception.class)
    public void operationInvalid() throws Exception {
        Operation operation = new Operation();
        String x = "0.0";
        String y = "0.0";
        operation.setZ("привет");
        operation.setResult(x, y);
    }

    @Test(expected = Exception.class)
    public void operandInvalid() throws Exception {
        Operation operation = new Operation();
        String x = "привет";
        String y = "0.0";
        operation.setZ("+");
        operation.setResult(x, y);
    }

    @Test(expected = Exception.class)
    public void operandInvalidWithDot() throws Exception {
        Operation operation = new Operation();
        String x = ".привет";
        String y = "0.0";
        operation.setZ("+");
        operation.setResult(x, y);
    }

    @Test(expected = Exception.class)
    public void operandInvalidWithLetterAndDigit() throws Exception {
        Operation operation = new Operation();
        String x = "123привет";
        String y = "0.0";
        operation.setZ("+");
        operation.setResult(x, y);
    }
}