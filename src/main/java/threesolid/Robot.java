package threesolid;

public class Robot extends BaseWorker implements IReboot  {
    public void work() {
        System.out.println("I work it out like Usher.");
    }
    public void reboot() {
        System.out.println("One of these days I'm going to reboot a person.");
    }
}
