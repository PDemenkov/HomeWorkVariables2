public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 8;
        System.out.println("Значение переменной age с типом int = " + age );
        byte speed = 127;
        System.out.println("Значение переменной speed с типом byte = " + speed );
        short maxLength = 300;
        System.out.println("Значение переменной maxLength с типом short = " + maxLength );
        long equator = 123L;
        System.out.println("Значение переменной equator с типом long = " + equator );
        float minWeight = 99F;
        System.out.println("Значение переменной minWeight с типом float = " + minWeight );
        double maxWeight = 3.14;
        System.out.println("Значение переменной pi с типом double = " + maxWeight );

        System.out.println("Задача 2");
        float f =27.12F;
        long l =987_678_965_549L;
        double d =2.786;
        boolean b=false;
        short s =569;
        int i =-159;
        short s3 =27897;
        byte by =67;

        System.out.println("Задача 3");
        int lP = 23;
        int aS = 27;
        int eA = 30;
        int totalSheets = 480;
        System.out.println("На каждого ученика рассчитано " +totalSheets/(lP+aS+eA) + " листов бумаги");

        System.out.println("Задача 4");
//      int bottle = 8;
        int bottle = 16;
        int bottleInMinute = bottle / 2;
        int twentyMinutes = 20;
        System.out.println("За " + twentyMinutes +" минут работы машины произвела бутылок " + bottleInMinute*twentyMinutes + (" штук"));
        int day=60*24;
        System.out.println("За " + day +" минут работы машины произвела бутылок " + bottleInMinute*day + (" штук"));
        int threeDays=day*3;
        System.out.println("За " + threeDays +" минут работы машины произвела бутылок " + bottleInMinute*threeDays + (" штук"));
        int month=day*31;
        System.out.println("За " + month +" минут работы машины произвела бутылок " + bottleInMinute*month + (" штук"));
//        System.out.println("За 20 минут работы машины произвела бутылок " + bottle*20 + (" штук"));
//        System.out.println("За 24 часа машины произвела бутылок " + bottle*1440 + (" штук"));
//        System.out.println("За 3 дня машины произвела бутылок " + bottle*1440*3 + (" штук"));
//        System.out.println("За 1 месяц машины произвела бутылок " +bottle*31*1440 + (" штук"));

        System.out.println("Задача 5");
        int tinTotal = 120;
        int tinWhite = 2;
        int tinBrown = 4;
        System.out.println("В школе,где " + tinTotal/(tinWhite+tinBrown) + " классов " + "нужно " + tinTotal/(tinWhite+tinBrown) * tinWhite +
                " банок белой краски и " + tinTotal/(tinWhite+tinBrown) * tinBrown + " банок коричневой краски");

        System.out.println("Задача 6");
        int banana = 5;
        int milk = 200;
        int iceCream = 100;
        int eggs = 4;
        double recipeTotal = banana*80 + milk*1.05 +iceCream*2 +eggs*70;
        System.out.println("Рецепт в граммах: " + recipeTotal);
        double recipeTotalKg = recipeTotal/1000;
        System.out.println("Рецепт в килограммах: " + recipeTotalKg);

        System.out.println("Задача 7");
        int weight = 7;
        int gram1 = 250;
        int gram2 = 500;
        System.out.println("Понадобится " + weight*1000/gram1 + (" дней, если худеть по 250 грамм в день"));
        System.out.println("Понадобится " + weight*1000/gram2 + (" дней, если худеть по 500 грамм в день"));

        System.out.println("Задача 8");
        int salaryMaria = 67760;
        int salaryDenis = 83690;
        int salaryCris = 76230;
        int newSalaryMaria = salaryMaria/10 + salaryMaria;
        int newSalaryDenis = salaryDenis/10 + salaryDenis;
        int newSalaryCris = salaryCris/10 + salaryCris;
        System.out.println("Маша получает " +newSalaryMaria+ " рублей. Годовой доход вырос на " +(newSalaryMaria*12-salaryMaria*12) + " рублей");
        System.out.println("Денис получает " +newSalaryDenis+ " рублей. Годовой доход вырос на " +(newSalaryDenis*12-salaryDenis*12) + " рублей");
        System.out.println("Маша получает " +newSalaryCris+ " рублей. Годовой доход вырос на " +(newSalaryCris*12-salaryCris*12) + " рублей");
    }
}