import java.util.ArrayList;


public interface Action {
    default <T extends Number> long doAction (T n) throws ArithmeticException{
        ArrayList<Integer> mylist = new ArrayList<>();
        long time = System.currentTimeMillis();
        for (int i = 0; i<(int)n; i++){
            mylist.add((int) (Math.random()*200-100));
        }
        time-=System.currentTimeMillis();
        return time*-1;
    }
}

