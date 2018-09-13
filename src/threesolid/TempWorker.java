package threesolid;

public class TempWorker extends BaseWorker implements ISick, IEat {

  public void work() {
    System.out.println("I like this job only marginally more than I like being homeless.");
  }
  public void eat() {
    System.out.println("Lunch break? Lol I can't afford to eat.");
  }
  public void sick() {
    System.out.println("My life is a sick joke.");
  }
}

