public class Main {
    public static void main(String[] args) {
        int startingScore = 300; // Начальный счет
        int replenishmentAmount = 11500; // Сумма пополнений
        int bonusRubles = 0; // Бонусные рубли
        int finalScore = 0; // Итоговый счет

        if (replenishmentAmount < 1000) {
            finalScore = replenishmentAmount + startingScore;
            System.out.println("Клиент пополнил счёт на " + replenishmentAmount + " рублей - бонусов нет, итоговая сумма на счету клиента - " + finalScore);

        } else {
            bonusRubles = replenishmentRmount / 100;
            finalScore = replenishmentAmount + startingScore + bonusRubles;
            System.out.println("Клиент пополнил счёт на " + replenishmentAmount + " рублей - бонус равен " + bonusRubles + " рублям ,итоговая сумма на счету клиента - " + finalScore);

        }


}
    }

