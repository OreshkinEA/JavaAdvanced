package calculator;

public class Operation {
    private Double result;
    private String x;
    private String y;
    private String z;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }

    public Double getResult() {
        return this.result;
    }

    public void setResult(String x, String y) throws Exception {
        if (this.z.equals("+")) {
            try {
                Double.parseDouble(x);
                Double.parseDouble(y);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            this.result = Double.parseDouble(x) + Double.parseDouble(y);
        } else if (z.equals("-")) {
            try {
                Double.parseDouble(x);
                Double.parseDouble(y);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            this.result = Double.parseDouble(x) - Double.parseDouble(y);
        } else if (z.equals("*")) {
            try {
                Double.parseDouble(x);
                Double.parseDouble(y);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            this.result = Double.parseDouble(x) * Double.parseDouble(y);
        } else if (z.equals("/")) {
            try {
                Double.parseDouble(x);
                Double.parseDouble(y);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            if (Double.parseDouble(y) != 0) {
                this.result = Double.parseDouble(x) / Double.parseDouble(y);
            } else if ((Double.parseDouble(x) == 0) && (Double.parseDouble(y) == 0)) {
                throw new Exception("Division zero by zero");
            }
            else {
                throw new Exception("Divizion by zero");
            }
        }
        else {
            throw new Exception("Операция не выбрана");
        }
    }
}