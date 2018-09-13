package threesolid;

public class SuperWorker extends BaseWorker implements ISick, IEat {

  public void work() {
    System.out.println("I get rewarded for doing a good job with more work.");
  }

  public void eat() {
    System.out.println("I may need to extend my lunch break into not working here.");
  }

  public void sick(){
      System.out.println("I refused the flu shot in order to justify the many sick days I plan to use this winter.");
  }
}
