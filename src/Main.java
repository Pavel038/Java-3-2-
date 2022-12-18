public class Main {
    public static void main(String[] args) {
        int starting_score = 300; // Начальный счет
        int replenishment_amount = 11500; // Сумма пополнений
        int bonus_rubles = 0; // Бонусные рубли
        int final_score = 0; // Итоговый счет

        if (replenishment_amount < 1000) {
            final_score = replenishment_amount + starting_score;
            System.out.println("Клиент пополнил счёт на " + replenishment_amount + " рублей - бонусов нет, итоговая сумма на счету клиента - " + final_score);

        } else {
            bonus_rubles = replenishment_amount / 100;
            final_score = replenishment_amount + starting_score + bonus_rubles;
            System.out.println("Клиент пополнил счёт на " + replenishment_amount + " рублей - бонус равен " + bonus_rubles + " рублям ,итоговая сумма на счету клиента - " + final_score);

        }


}
    }

