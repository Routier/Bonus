import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        //Объявление переменных payed - ввод заплаченный суммы; check - количество рублей для одной бонусной мили

        System.out.println("Введите заплаченную сумму:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tmp = reader.readLine();

        int payed = Integer.parseInt(tmp);
        int check = 20;

        //Расчет бонусных миль и вывод результата на экран

        int bonus = payed / check;
        System.out.println("Добавлено бонусных миль: " + bonus);
    }
}
