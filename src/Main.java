public class Main {
    public static void main(String[] args) {
        //Задача 1
        int a = 1234567890;
        byte b = -108;
        short c = 1256;
        long d = 123456789125L;
        float q = 3.15f;
        double p = 3.145646464;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной q с типом float равно " + q);
        System.out.println("Значение переменной p с типом double равно " + p);
        //Задача 2
        float f = 27.12F;
        long g = 987678965459L;
        double h = 2.786;
        boolean k = f > 25;
        short j = 569;
        short l = -159;
        short m = 27897;
        byte o = 67;
        //Часть 2
        byte a1 = 9;
        short b1 = 156;
        int c1 = -2145645;
        long d1 = 3547854545445454L;
        float f1 = 5.67f;
        double g1 = 3.1456556;
        char h1 = 35;
        boolean k1 = a < 10;
        System.out.println(k1);
        System.out.println(h1);
        //ex. 3
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short totalPaper = 480;
        int forOne = totalPaper / (teacher1 + teacher2 + teacher3);
        System.out.println("На каждого ученика рассчитано  " + forOne + " листов бумаги.");
        //ex4
        byte productivityOneMinute = 8;
        int productivityTwentyMinutes = productivityOneMinute * 20;
        int productivityOneDay = productivityOneMinute * 60 * 24;
        int productivityThreeDays = productivityOneDay * 3;
        int productivityOneMonth = productivityOneDay * 30;
        System.out.println("За двадцать минут машина произвела бутылок " + productivityTwentyMinutes + " штук");
        System.out.println("За один день машина произвела бутылок " + productivityOneDay + " штук");
        System.out.println("За три дня машина произвела бутылок " + productivityThreeDays + " штук");
        System.out.println("За месяц машина произвела бутылок " + productivityOneMonth + " штук");
        //ex5
        byte white = 2;
        byte brown = 4;
        byte total = 120;
        int oneClass = white + brown;
        int classes = total / oneClass;
        int white1 = white * classes;
        int brown1 = brown * classes;
        System.out.println("В школе, где " + classes + " классов, нужно " + white1 + " банок белой краски и " +
              brown1 + " банок коричневой краски.");

        //ex6
        byte banana = 80;
        int bananas = banana * 5;
        byte milk = 105;
        int milks = milk * 2;
        byte iceCream = 100;
        int iceCreams = iceCream * 2;
        byte egg = 70;
        int eggs = egg * 4;
        int shake = bananas + milks + iceCreams + eggs;
        float shakeKg = shake / 1000f;
        System.out.println("Этот божественный коктайл с сырыми яйцами имеет вес " + shakeKg + "кг");
        //ex7
        byte weight = 7;
        int weightGr = 7 * 1000;
        short lossOne = 250;
        short lossTwo = 500;
        int daysLossOne = (weightGr / lossOne);
        int daysLossTwo = (weightGr / lossTwo);
        System.out.println("При потере по 250 гр, спортсмену нужно дней: " +daysLossOne);
        System.out.println("При потере по 500 гр, спортсмену нужно дней: " +daysLossTwo);
        //ex8
        int salaryM = 67760;
        int salaryD = 83690;
        int salaryK = 76230;
        double salaryM1 = salaryM * 0.1;
        double salaryD1 = salaryD * 0.1;
        double salaryK1 = salaryK * 0.1;
        double salaryMCutMonth = salaryM + salaryM1;
        double salaryDCutMonth = salaryD + salaryD1;
        double salaryKCutMonth = salaryK + salaryK1;
        System.out.println("Зарплата Маши через месяц рублей: " + salaryMCutMonth);
        System.out.println("Зарплата Дениса через месяц рублей: " + salaryDCutMonth);
        System.out.println("Зарплата Кристины через месяц рублей: " + salaryKCutMonth);
        int salaryMForYear = salaryM * 12;
        int salaryDForYear = salaryD * 12;
        int salaryKForYear = salaryK * 12;
        double salaryMCutYear = salaryMCutMonth * 12;
        double salaryDCutYear = salaryDCutMonth * 12;
        double salaryKCutYear = salaryKCutMonth * 12;
        double salaryDifM = salaryMCutYear - salaryMForYear;
        double salaryDifD = salaryDCutYear - salaryDForYear;
        double salaryDifK = salaryKCutYear - salaryKForYear;
        System.out.println("За год Маша зарабатывала " + salaryMForYear + " , а будет зарабатывать " + salaryMCutYear + " рублей. Разница " + salaryDifM);
        System.out.println("За год Маша зарабатывала " + salaryDForYear + " , а будет зарабатывать " + salaryDCutYear + " рублей. Разница " + salaryDifD);
        System.out.println("За год Маша зарабатывала " + salaryKForYear + " , а будет зарабатывать " + salaryKCutYear + " рублей. Разница " + salaryDifK);
    }
}