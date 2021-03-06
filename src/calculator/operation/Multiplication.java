package calculator.operation;

public class Multiplication extends Operation {
    private static final String operatorRegex = "\\s*\\*\\s*";

    @Override
    public double applyTo(double leftOperand, double rightOperand) {
        return leftOperand * rightOperand;
    }

    @Override
    public String toString() {
        return "*";
    }

    @Override
    public String getSignatureRegex() {
        return numberRegex + operatorRegex + numberRegex;
    }

    @Override
    public String getOperatorRegex() {
        return operatorRegex;
    }

}
