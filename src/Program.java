public class Program {

    public static void main (String [] args) throws TimeoutException, InterruptedException, Exception {
        // просто метод ду
        Action<Integer, String, Exception> test = new ActionClass();
        System.out.println(test.does(4));
        // метод ду с проверкой по времени когда времени достаточно
        ActionWithTimeout <Integer> niceTimeout = new ActionWithTimeout<>();
        niceTimeout.actionWithTimeout(test, 5 , 5000);
        // метод ду с проверкой по времени когда времени не достаточно (процесс не прерывается, но в конце выдаёт ошибку)
        ActionWithTimeout <Integer> badTimeout = new ActionWithTimeout<>();
        badTimeout.actionWithTimeout(test, 5 , 1);
        // метод ду который сам выбрасывает ошибку
        Action<String, String, Exception> fail = new ActionClass();
        System.out.println(fail.does(" s"));
    }
}
