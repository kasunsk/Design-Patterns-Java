package templateMethod.workerExample;

/**
 * Created by kasun on 3/13/17.
 */
public class Demo {

    public static void main(String [] args) {
        Worker manager = new Manager();
        manager.initializeDay();
        manager.work();
        manager.finalizeDay();
    }
}
