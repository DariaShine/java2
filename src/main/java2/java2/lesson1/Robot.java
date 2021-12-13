package java2.lesson1;

public class Robot implements RunJump {
    private int maxRun;
    private int maxJump;

    public Robot(int maxRun, int maxJump) {
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    public Robot() {
        this(25000, 2);
    }

    @Override
    public boolean run(int dist) {
        if (dist <= maxRun) {
            System.out.println("Robot run " + dist);
            return true;
        } else {
            System.out.println("Robot didn't  run " + dist);
            return false;
        }
    }

    @Override
    public boolean jump(int dist) {
        if (dist <= maxJump) {
            System.out.println("Robot jump " + dist);
            return true;
        } else {
            System.out.println("Robot didn't jump " + dist);
            return false;
        }
    }
}
