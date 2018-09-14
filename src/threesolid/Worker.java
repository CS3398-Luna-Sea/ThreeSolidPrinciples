package threesolid;

public class Worker extends BaseWorker implements ISick, IEat {
    public void eat() {
        System.out.println("Yesterday I really wanted a taco. Today I am eating a taco. Follow your dreams.");
    }
    public void sick() {
        System.out.println("I've used up all my sick days. I'm going to try calling in dead.");
    }
}
