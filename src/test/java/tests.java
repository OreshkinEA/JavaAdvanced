import calculator.WorkOperation;
import org.junit.Assert;
import org.junit.Test;

public class tests {

    @Test
    public void scoreSum() {
        WorkOperation operation = new WorkOperation();
        int x = 3;
        int y = 2;
        operation.setSum(x, y);
        Assert.assertEquals("Сумма неверна", 5, operation.getSum());
    }

    @Test
    public void scoreSub() {
        WorkOperation operation = new WorkOperation();
        int x = 4;
        int y = 2;
        operation.setSub(x, y);
        Assert.assertEquals("Разность неверна", 2, operation.getSub());
    }

    @Test
    public void scoreMul() throws Exception {
        WorkOperation operation = new WorkOperation();
        int x = 4;
        int y = 2;
        operation.setMul(x, y);
        Assert.assertEquals("Неверный результат", 8, operation.getMul());
    }

    @Test
    public void scoreDiv() throws Exception {
        WorkOperation operation = new WorkOperation();
        int x = 6;
        int y = 2;
        operation.setDiv(x, y);
        Assert.assertEquals("Неверный результат", 3, operation.getDiv());
    }

    @Test
    public void tryDivisionByZero() {
        WorkOperation operation = new WorkOperation();
        int x = 2;
        int y = 0;
        try {
            operation.setDiv(x, y);
            Assert.fail("Expected Division by zero");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void tryDivisionZeroByZero() {
        WorkOperation operation = new WorkOperation();
        int x = 0;
        int y = 0;
        try {
            operation.setDiv(x, y);
            Assert.fail("Expected Division zero by zero");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}