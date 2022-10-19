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

    }
}