package app;

public class EngCalc implements Calc {
    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    @Override
    public int diff(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int mult(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int div(int num1, int num2) {
        return num1/num2;
    }

    @Override
    public int fact(int num1) {
        int result=1;
        for(int i=1; i<=num1; i++ ){
            result *= i;
        }
        return result;
    }
}


