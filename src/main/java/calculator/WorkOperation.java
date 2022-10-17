package calculator;

public class WorkOperation extends Operations {
    int sum;
    int sub;
    int mul;
    int div;

    public int getSum() {
        return sum;
    }

    public int getSub() {
        return sub;
    }

    public int getMul() {
        return mul;
    }

    public int getDiv() {
        return div;
    }

    @Override
    public void setSum(int x, int y) {
        this.sum = x + y;
    }

    @Override
    public void setSub(int x, int y) {
        this.sub = x - y;
    }

    @Override
    public void setMul(int x, int y) {
        this.mul = x * y;
    }

    @Override
    public void setDiv(int x, int y) throws Exception {
        if (y != 0) {
            this.div = x / y;
        } else if ((x == 0) && (y == 0)) {
            throw new Exception("Division zero by zero");
        }
        else {
            throw new Exception("Division by zero");
        }
    }
}