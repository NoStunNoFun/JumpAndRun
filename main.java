import java.util.ArrayList;

class Main {
    private Timer timer;
    private PhysicsEngine engine;
    private GUI gui;

    public Main() {
        timer = new Timer();
        engine = new PhysicsEngine();
        gui = new GUI();
    }

    public void run() {
        // Your main execution logic
    }

    private void draw() {
        //TODO
    }

    private void forwardInputs(ArrayList<Character> d) {
        //TODO
    }

    public static void main(String[] args) {
        Main mainInstance = new Main();
        mainInstance.run(); // Run the instance method
    }
}
