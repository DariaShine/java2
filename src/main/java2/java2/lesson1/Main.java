package java2.lesson1;

import java2.lesson1.RunJump;
import java2.lesson1.Obstracle;

public class Main {
    public static void main(String[] args) {

        RunJump[] runJumps = {
                new Human(),
                new Robot(),
                new Cat()
        };

        Obstracle[] obstracles = {
                new Road(10500),
                new Wall(2)
        };

        for(RunJump runJump : runJumps){
            for(Obstracle obstracle : obstracles){
                if(!obstracle.startExs(runJump)){
                    break;
                }
            }
        }
    }
}
