import java.util.ArrayList;

public class Car {
    private String name;
    private Engine engine;
    private ArrayList<Wheel> wheels;
    private boolean fuel;

    public Car(String name, int enginePower, int wheelsCount, int wheelsSize) {
        fuel = true;
        this.name = name;
        this.engine = new Engine(enginePower);
        this.wheels = new ArrayList();
        for (int i = 0; i < wheelsCount; i++) {
            wheels.add(new Wheel(wheelsSize));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public ArrayList getWheels() {
        return wheels;
    }

    public void setWheels(ArrayList wheels) {
        this.wheels = wheels;
    }

    public boolean HasFuel() {
        return fuel;
    }

    public void noFuel() {
        System.out.println("We need fuel...");
        fuel = false;
    }

    public void refuel() throws InterruptedException {
        System.out.println("refueling...");
        Thread.sleep(2000);
        this.fuel = true;
    }

    public void changeWheel() throws InterruptedException {
        System.out.println("Changing...");
        Thread.sleep(2000);
        for (int i = 0; i < wheels.size(); i++) {
            if (!wheels.get(i).isGood()) {
                System.out.printf("Wheel number %d is changed.\n", i + 1);
                wheels.get(i).setGood(true);
            }
        }
    }

    public void run() {
        boolean isOk = true;
        if (engine == null) {
            isOk = false;
            System.out.println("We need engine...");
        } else if (!fuel) {
            isOk = false;
            System.out.println("We need fuel...");
        } else
            for (Wheel wheel : wheels) {
                if (wheel == null) {
                    isOk = false;
                    System.out.println("We need wheels...");
                }
            }
        if (isOk) {
            System.out.println("eron-don-don...");
        }
    }

    public void breakWheel() {
        wheels.get((int) Math.random() * wheels.size()).setGood(false);
        System.out.println("We need a new wheel");
    }
}
