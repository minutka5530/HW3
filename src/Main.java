public class Main {
    public static void main(String[] args) {
        // Задание 1
      int boxHose = 7;
      System.out.println("Значение переменной   boxHose  с типом int равно " + boxHose);
      byte horseCat = 2;
        System.out.println("Значение переменной   horseCat  с типом byte равно " + horseCat);
      short helloPeter = 4;
        System.out.println("Значение переменной   helloPeter  с типом short равно " + helloPeter);
      long carSprint = 523L;
        System.out.println("Значение переменной   carSprint  с типом long равно " + carSprint);
        // Задание 2
        double box = 27.12;
        long skill = 987678965549L;
        byte skill2 = 2;
        int skill3 = 786;
        boolean crezi = false;
        // задание 3
        int luda = 23;
        int anna = 27;
        int kata = 30;
        int paper = 480;
        int paperAll = paper / (luda+anna+kata);
        System.out.println("На каждого ученика рассчитано " + paperAll + " листов бумаги");
        // Задача 4
        int carBottle = 16;
        int minut1= 2;
        carBottle /= minut1;
        int minut = 20;
        System.out.println("За 20 минут машины произвела бутылок " + (carBottle * minut) + " штук " );
        int day = 24*60;

        System.out.println("За day машины произвела бутылок " + (day * carBottle) + " штук ");
        int day3 = day * 3;

        System.out.println("За 3 day  машины произвела бутылок " + (day3 * carBottle) + " штук ");
        int month = day * 30 ;
        System.out.println("За месяц машины произвела бутылок " + (month * carBottle) + " штук ");
        // Задача 5
        int shool = 120;
        int white = 2;
        int brown = 4;
        int totalShool = shool / (white +brown );
        int totalShoolWhite = shool - (totalShool * white) ;
        int totalShoolBrown = shool - (totalShool * brown);
        System.out.println ("В школе, где " + totalShool + " классов, нужно " + totalShoolWhite + " банок белой краски и " + totalShoolBrown + " банок коричневой краски");
        // Задача 6
        float wheightBanan = 5 * 80;
        float wheightmilk = 105 * 2;
        float wheightIce = 100 * 2;
        float wheightEgg = 4 * 70;
        float totalWheight = wheightBanan + wheightEgg + wheightIce + wheightmilk;
        float totalWheightKg = totalWheight / 1000;

        System.out.println("вес спорт завтрака " + totalWheightKg + "кг");
        // Задача 7
        float wheightLossAtletKg = 7;
        float wheightLossAtletGram = wheightLossAtletKg * 1000;
        float wheightday1 = 250;
        float wheightday2 = 500;
        float takeDays1 = wheightLossAtletGram / wheightday1;
      System.out.println("Если бутет терять 250грамм в день то получеться " + takeDays1 + "дней" );
        float takedays2 = wheightLossAtletGram / wheightday2;
        System.out.println("Если бутет терять 500грамм в день то получеться " + takedays2 + "дней" );
        // Задача 8
      float salaryMasha = 67760;
      float salaryMahaprocent = salaryMasha * 10;
      float increaseMasha = salaryMahaprocent / 100;
      float salaryMashaNow = increaseMasha + salaryMasha;
      float salaryMashaYear = increaseMasha * 12;
      System.out.println("Маша теперь получает  " + salaryMashaNow+ " рублей. Годовой доход вырос на " + salaryMashaYear + "  рублей");
      float salaryDinis = 83690;
      float salaryDinisСent = salaryDinis * 10;
      float increaseDinis = salaryDinisСent / 100;
      float salaryDinisNow = increaseDinis + salaryDinis;
      float salaryDinisYear = increaseDinis * 12;
      System.out.println("Денис теперь получает  " + salaryDinisNow + " рублей. Годовой доход вырос на " + salaryDinisYear + "  рублей");
      float salaryKris = 76230;
      float salaryKrisСent = salaryKris * 10;
      float increaseKris = salaryKrisСent / 100;
      float salaryKrisNow = increaseKris + salaryKris;
      float salaryKrisYear = increaseKris * 12;
      System.out.println("Кристина теперь получает  " + salaryKrisNow + " рублей. Годовой доход вырос на " + salaryKrisYear + "  рублей");




















    }
}