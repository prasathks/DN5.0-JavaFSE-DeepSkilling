// Simulating Dependency Injection
class Engine {
    public void start() {
        System.out.println("Engine is starting...");
    }
}

class Car {
    private Engine engine;
    
    // Dependency Injection via constructor
    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("Engine injected into Car.");
    }
    
    public void drive() {
        engine.start();
        System.out.println("Car is driving.");
    }
}

public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Spring would normally do this injection automatically
        Engine myEngine = new Engine();
        Car myCar = new Car(myEngine);
        myCar.drive();
    }
}
