public class Player {
    public boolean facingRight;
    public Coordinates position;
    public int Xspeed;
    public int Yspeed;
    public boolean isJumping;
    public int height;
    public int width;

    public Player () {
        boolean facingRight = true;
        Coordinates position = new Coordinates(0,0);
        int Xspeed = 0;
        int Yspeed = 0;
        boolean isJumping = false;
        int height = 0;
        int width = 0;
    }
}
