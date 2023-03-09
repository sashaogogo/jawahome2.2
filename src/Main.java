public class Main {
    public static void main(String[] args) {
        //На счете
        int check = 100;
        //Сумма пополнения
        int replenishment = 110;
        //Сумма на счете после пополнения
        int allCheck = check + replenishment;
        //Кол-во бонусов
        int bonus = replenishment / 100;
        if (replenishment > 1000) {
            System.out.println("Итоговая сумма на счете = " + (allCheck + bonus) + "   Кол-во бонусов = " + bonus);
        } else {
            System.out.println("Итоговая сумма на счете = " + (allCheck) + "  Кол-во бонусов = 0");
        }


    }
}