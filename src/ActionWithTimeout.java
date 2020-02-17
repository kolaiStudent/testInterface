import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ActionWithTimeout extends Thread{
    //метод, который нужно было реализовать. Он вызивает doAction в новом потоку и выбрасывает ошибку, если прошло timeout мс.
    public void actionWithTimeout(Action a, int timeout) throws TimeoutException,ArithmeticException, InterruptedException {
        b = a;
        this.start();
        this.join(timeout);
        if (this.isAlive()) {
           throw new TimeoutException("Время вышло");
         }
    }

        private Action b;
          @Override
         public void run(){
                  b.doAction(5000000);
         }

}
