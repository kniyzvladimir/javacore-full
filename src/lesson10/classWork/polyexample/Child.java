package lesson10.classWork.polyexample;

public class Child extends Human {
    public Child(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("Child class is called...");
        super.run();
    }
}
