import java.util.Scanner;

public interface Action {

    default void doAction () throws ArithmeticException{
        // Этот интерфейс задаёт стандартную реализацию метода doAction который считывает 2 метода с консоли и делит 1 на другое. Выбрасывает ошибку при делении на 0
        Scanner scan = new Scanner(System.in);
        System.out.println("введите делимое число");
        int p1 = scan.nextInt();
        System.out.println("введите делитель");
        int p2 = scan.nextInt();
        try{
            int r1=p1/p2;
            int r2=p1%p2;
            System.out.println("При делении " + p1 + " на " + p2 + " мы получаем частное " + r1 + " и остаток " + r2);
        }catch (ArithmeticException e){
            System.out.println("Деление на 0 запрещенно законом, если вы ещё не достигли второго курса.");
        }

    }
}

