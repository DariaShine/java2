package java2.lesson1;

public class Cat implements RunJump{
    private int maxRun;
    private int maxJump;

    public Cat(int maxRun, int maxJump) {
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    public Cat() {
        this(2500, 3);
    }

    @Override
    public boolean run(int dist) {
        if (dist <= maxRun) {
            System.out.println("Cat run " + dist);
            return true;
        } else {
            System.out.println("Cat didn't  run " + dist);
            return false;
        }
    }

    @Override
    public boolean jump(int dist) {
        if (dist <= maxJump) {
            System.out.println("Cat jump " + dist);
            return true;
        } else {
            System.out.println("Cat didn't jump " + dist);
            return false;
        }
    }
}
