public class ActionWithTimeout extends Thread{
    //метод, который нужно было реализовать. Он вызивает doAction в новом потоку и выбрасывает ошибку, если прошло timeout мс.
    public void actionWithTimeout(Action a, int timeout) throws TimeoutException,ArithmeticException, InterruptedException{
        b = a;
        this.start();
        try {
            this.join(timeout);
            if (this.isAlive()) {
                this.interrupt();
                throw new TimeoutException("Время вышло ");
            }
        } catch (InterruptedException | TimeoutException e) {
            System.out.println(e.getMessage());
        }
    }

    private Action b;

    @Override
    public void run(){
            b.doAction();
    }
}
