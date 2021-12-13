package java2.lesson1;

import java2.lesson1.RunJump;

public class Road implements Obstracle {
    private int dist;

    public Road(int dist) {
        this.dist = dist;
    };

    @Override
    public boolean startExs(RunJump runJump) {
        return runJump.run(dist);
    }
}
