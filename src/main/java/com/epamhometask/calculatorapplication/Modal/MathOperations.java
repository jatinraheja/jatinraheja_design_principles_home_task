package com.epamhometask.calculatorapplication.Modal;

public class MathOperations extends MathOperationsMethods {
    private double operand1;
    private double operand2;
    private String operator;

    public MathOperations(double operand1,double operand2,String operator)
    {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }
    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
    public double calculateResult()
    {
        double result = 0;
        switch (this.operator)
        {
            case "+" :
                result = add(this.operand1 , this.operand2);
                break;
            case "-" :
                result = subtract(this.operand1 , this.operand2);
                break;
            case "/" :
                result = divide(this.operand1 , this.operand2);
                break;
            case "*" :
                result = multiply(this.operand1 , this.operand2);
                break;
                default:
                result = 0;
        }
        return result;
    }
}
