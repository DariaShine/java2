package java2.lesson1;

public class Wall implements Obstracle{
    private int height;

    public Wall(int height) {
        this.height = height;
    };

    @Override
    public boolean startExs(RunJump runJump) {
        return runJump.jump(height);
    }
}
