import java.util.ArrayList;

class Main {
    private Timer timer;
    private PhysicsEngine engine;
    private GUI gui;

    public Main() {
        timer = new Timer(60);
        engine = new PhysicsEngine();
        gui = new GUI();
    }

    public void run() {
        boolean isRunning = true;
        while (isRunning) {
            while (!timer.tickReady()) {
                timer.updateTime();
            }
            if (!forwardInputs()) {
                isRunning = false;
            }
            draw();
        }
    }

    private void draw() {
        gui.draw();
    }

    private boolean forwardInputs() {
        ArrayList<Character> inputs = gui.giveInputs();
        if (inputs.contains(62)) {
            return false;
        }
        engine.calculate(inputs);
        return true;
    }

    public static void main(String[] args) {
        Main mainInstance = new Main();
        mainInstance.run();
    }
}
