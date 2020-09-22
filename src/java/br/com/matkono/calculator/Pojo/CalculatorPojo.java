package br.com.matkono.calculator.Pojo;

public class CalculatorPojo implements java.io.Serializable {
    
    private int OperatorLeft;
    private int OperatorRight;
    private int Result;
    private String Operation;
    
    public CalculatorPojo(){}
    
    public int getOperatorLeft()
    {
        return OperatorLeft;
    }
    
    public int getOperatorRight()
    {
        return OperatorRight;
    }
    
    public int getResut()
    {
        return Result;
    }
    
    public String getOperation()
    {
        return Operation;
    }
    
    public void setOperatorLeft(int operatorLeft)
    {
        OperatorLeft = operatorLeft;
    }
    
    public void setOperatorRight(int operatorRight)
    {
        OperatorRight = operatorRight;
    }
    
    public void setResult(int result)
    {
        Result = result;
    }
    
    public void setOperation(String operation)
    {
        Operation = operation;
    }
}
