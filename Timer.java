public class Timer {

    private long currentTime;
    private long lastTime;
    private long timePerTick;
    
    public Timer(int ticksPerSecond) {
        this.timePerTick = 1_000_000_000L / ticksPerSecond; // nanoseconds per tick
        this.lastTime = System.nanoTime();
    }

    public boolean tickReady() {
        currentTime = System.nanoTime();
        return (currentTime - lastTime) >= timePerTick;
    }

    public void updateTime() {
        lastTime = System.nanoTime();
    }
}
