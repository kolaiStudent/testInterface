import java.util.Scanner;
import java.io.*;
public class Program {

    public static void main (String [] args) throws TimeoutException, InterruptedException {
        Action test = new ActionClass(); // создаём пустой класс, который будет реализовывать наш интерфейс.
        boolean working = true;
        //вечный цикл, программы, который делает действия в зависимости от числа, которое вы ввели.
        while (working){
            Scanner scan = new Scanner(System.in);
            System.out.println("введите 2, чтоб начать деление с учётом времени\nвведите 1 если просто хотите начать деление\nвведите 0, чтобы выйти из программы");
            String k = scan.next();
            // вызываем метод, который выбрасывает ошибку, если мы слишком долго вводим числа
            if (k.equals("2")){
                ActionWithTimeout t = new ActionWithTimeout();
                t.actionWithTimeout(test,100);
            }
            // просто вызываем doAction нашего интерфейса
            else if (k.equals("1")){
                System.out.println(test.doAction(5000000));
            }
            // выходим из программы
            else if (k.equals("0")){
                working=false;
            }
            // если пользователь вводит что-то не то
            else {
                System.out.println("вы что-то не то ввели, попробуйте снова");
            }
            //отделение каждого цикла программы, чтоб было проще смотреть
            System.out.println(" ");
            System.out.println("****************************************************************************");
            System.out.println("****************************************************************************");
            System.out.println("****************************************************************************");
            System.out.println(" ");
        }
    }
}
