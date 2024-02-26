
public class Main {
    public static void main(String[] args) {

        int payed = 4506; //заплаченная сумма
        int check = 20; //количество рублей для одной бонусной мили

        //Расчет бонусных миль и вывод результата на экран
        int bonus = payed / check;
        System.out.println("Добавлено бонусных миль: " + bonus);
    }
}
