package calculator;

public class Operation {
    private double result;

    public double getResult() {
        return this.result;
    }

    public void setResult(Double x, Double y, String z) throws Exception {
        if (z.equals("+")) {
            this.result = x + y;
        } else if (z.equals("-")) {
            this.result = x - y;
        } else if (z.equals("*")) {
            this.result = x * y;
        } else if (z.equals("/")) {
            if (y != 0) {
                this.result = x / y;
            } else if ((x == 0) && (y == 0)) {
                throw new Exception("Division zero by zero");
            } else {
                throw new Exception("Division by zero");
            }
        } else {
            throw new Exception("Operation not selected");
        }
    }
}

