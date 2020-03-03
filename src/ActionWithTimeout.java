import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ActionWithTimeout<P> extends Thread{

    public void actionWithTimeout(Action a,P p, long timeout) throws TimeoutException, InterruptedException {
        b = a;
        t=p;
        this.start();
        this.join(timeout);
            if (this.isAlive()) {
                throw new TimeoutException("Время вышло");
            }
    }
        private P t;
        private Action b;
          @Override
         public void run(){
              try {
                  System.out.println(b.does(t));
              } catch (Exception e) {
                  e.printStackTrace();
              }
          }

}
