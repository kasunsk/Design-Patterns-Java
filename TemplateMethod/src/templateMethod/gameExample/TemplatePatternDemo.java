package templateMethod.gameExample;

/**
 * Created by kasun on 3/13/17.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new FootBall();
        game.play();
    }
}
