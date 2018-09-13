package threesolid;

public class main {

    public static Manager tsManager = new Manager();

    // The entry main() method
    public static void main(String[] args) {
        try {
            System.out.format("Starting ... \n");
        } catch (Exception main_except) {
            main_except.printStackTrace();
        }
        System.out.println("Welcome to the Lunasea workforce. Meet the crew: \n");


        BaseWorker chuck = new BaseWorker();
        System.out.println("\nBaseWorker: ");
        chuck.work();

        Worker larry = new Worker();
        System.out.println("\nWorker: ");
        larry.work();
        larry.eat();
        larry.sick();

        SuperWorker kiki = new SuperWorker();
        System.out.println("\nSuperWorker: ");
        kiki.work();
        kiki.eat();
        kiki.sick();

        TempWorker drake = new TempWorker();
        System.out.println("\nTempWorker: ");
        drake.work();
        drake.eat();
        drake.sick();

        Robot andre3000 = new Robot();
        System.out.println("\nRobot: ");
        andre3000.work();
        andre3000.reboot();


        try {
            System.out.format("Stopping ... \n");
        } catch (Exception main_except) {
            main_except.printStackTrace();
        }

        System.exit(0);
    }
}

