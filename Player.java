public class Player {
    private boolean facingRight;
    private Coordinates position;
    private int Xspeed;
    private int Yspeed;
    private boolean isJumping;
    private int height;
    private int width;

    public Player () {
        boolean facingRight = true;
        Coordinates position = new Coordinates();
        int Xspeed = 0;
        int Yspeed = 0;
        boolean isJumping = false;
        int height = 0;
        int width = 0;
    }
}
