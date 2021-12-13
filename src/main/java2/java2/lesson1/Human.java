package java2.lesson1;

public class Human implements RunJump {
    private int maxRun;
    private int maxJump;

    public Human(int maxRun, int maxJump) {
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    public Human() {
        this(5000, 1);
    }

    @Override
    public boolean run(int dist) {
        if (dist <= maxRun) {
            System.out.println("Human run " + dist);
            return true;
        } else {
            System.out.println("Human didn't  run " + dist);
            return false;
        }
    }

    @Override
    public boolean jump(int dist) {
        if (dist <= maxJump) {
            System.out.println("Human jump " + dist);
            return true;
        } else {
            System.out.println("Human didn't jump " + dist);
            return false;
        }
    }
}
