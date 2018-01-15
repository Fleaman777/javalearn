package app;

public class Cat implements Animal {

    @Override
    public String voice() {
        return "Meow";
    }

    @Override
    public String name() {
        return "Cat";
    }
}
