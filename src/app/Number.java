package app;

public class Number implements Calculated {

    int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public Calculated sum(int num) {
        return new Number(num + this.number);
    }

    @Override
    public Calculated sumVer2(int num) {
        this.number += num;
        return this;
    }

    @Override
    public Calculated dif(int num) {
        return new Number(this.number - num);
    }

    @Override
    public Calculated difVer2(int num) {
        this.number -= num;
        return this;
    }

    @Override
    public Calculated mult(int num) {
        return new Number(num * this.number);
    }

    @Override
    public Calculated multVer2(int num) {
        this.number *= num;
        return this;
    }

    @Override
    public Calculated div(int num) {
        return new Number(this.number / num);
    }

    @Override
    public Calculated divVer2(int num) {
        this.number /= num;
        return this;
    }

    @Override
    public Calculated fact() {
        int res = 1;
        for (int i = 1; i <= this.number; i++) {
            res *= i;
        }
        return new Number(res);
    }

    @Override
    public Calculated factVer2() {
        int res = 1;
        for (int i = 1; i <= this.number; i++) {
            res *= i;
        }
        this.number=res;
        return this;
    }



    @Override
    public int value() {
        return this.number;
    }
}
