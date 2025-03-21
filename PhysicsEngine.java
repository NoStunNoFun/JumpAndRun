import java.util.ArrayList;

public class PhysicsEngine {
    private Player player;
    private Map map;

    public PhysicsEngine() {
        player = new Player();
        map = new testMap();
    }

    public void calculate (ArrayList<Character> inputs) {
        if (player.isJumping) {
            player.Yspeed -= 1;
            return;
        }
        while (!inputs.isEmpty()) {
            char input = inputs.getFirst();
            inputs.removeFirst();
            
            switch (input) {
                case 'a':
                    player.Xspeed -= 1;
                    break;

                case 'd':
                    player.Xspeed += 1;
                    break;

                case 32:
                    player.Yspeed += 10;
            
                default:
                    System.out.println("unknown input");
                    break;
            }
        }
        capSpeed();
        return;
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }

    private int min(int a, int b) {
        return a < b ? a : b;
    }

    private void capSpeed() {
        player.Xspeed = max(player.Xspeed, -10); // player cant go faster than -10 to the left
        player.Xspeed = min(player.Xspeed, 10); // player cant go faster than 10 to the right
    }
}
