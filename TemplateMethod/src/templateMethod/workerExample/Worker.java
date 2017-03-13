package templateMethod.workerExample;

/**
 * Created by kasun on 3/13/17.
 */
public abstract class Worker {

    final void dailyRouting() {
        System.out.println("Daily going to work");
    }

    final void getUp() {
        System.out.println("Get up");
    }

    final void eatBreakfast() {
        System.out.println("Eat breakfast");
    }

    final void initializeDay() {
        getUp();
        dailyRouting();
        eatBreakfast();
    }

    abstract void work();

    final void finalizeDay() {
        returnToHome();
        relax();
        sleep();
    }

    final void returnToHome() {
        System.out.println("Return to home");
    }

    final void relax() {
        System.out.println("Relax");
    }

    final void sleep() {
        System.out.println("Sleep");
    }
}
