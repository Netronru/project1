package main;

public class Main {
        private static int balance = 451;
        public static void main(String[] args) {
            putMoney(45);
        }
        public static void takeMoney(int sum){
            if (sum > balance){
                System.out.println("Ошибка: На вашем балансе недостаточно средств.");
            } else if (sum <= balance){
                balance = balance - sum;
                System.out.println("Деньги были сняты.\nНа вашем счету осталось: " + balance + "$");
            } else{
                System.out.println("Ошибка: Неверное кол-во");
            }
        }
        public static void putMoney(int sum){
            System.out.println("Деньги были пополнены на счёт.");
            balance = balance + sum;
            System.out.println("Теперь ваш баланс составляет " + balance + "$");
        }
}
