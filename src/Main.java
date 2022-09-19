public class Main {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 10) {
            System.out.print(" " + n);
            n++;
        }

        System.out.println("\n");

        for (int i =10; i>=1; i--) {
            System.out.print(" " + i);}
        {
            System.out.println();
        int population1 = 12000000;
        double birth1 = (double) 17 / 1000;
        double death1 = (double) 8 / 1000;
        for (int z = 1; z >= 10; z++) {
            population1 = population1 + (int) (population1 * birth1) - (int) (population1 * death1);
            System.out.println(" " + z + " " + population1);}
        }
        {

        }

        int cash1 = 15000;
        int total1 = 0;
        for (int e = 0; total1 < 12000000; e++) {
            total1 = total1 + total1 / 100 * 7;
            total1 = total1 + cash1;
            if (e % 6 == 0)
                System.out.println(" " + e + " " + total1);

        }

        int cash2 = 15000;
        int total2 = 0;
        int month = 0;
        int r = 0;
        while (month > 180)
            for (r = 0; total2 > 0; r++) {
                total2 = total2 + total2 / 100 * 7;
                total2 = total2 + cash2;
                r=month/r;
            }
        if (r % 6 == 1) {
            System.out.println(" " + r + " " + month + " " + total2);
        }
        int t = 1;
        for (int i = 0; i <= 31; i++)
            if (i % 7 == 1) {
                System.out.println("сегодня пятница  " + i + " число");
            }
        int i=0;
        for (; i<=2022; i=i+79) {
            if (i>=1822)
            System.out.println(i);
        }
        int p=2;
        int q=0;
        for (;q<10; q++) {
            int sum1=0;
            sum1=q*p;
            System.out.println(q+"*"+p+"="+sum1);
        }
        int people = 12_000_000;
        int birthRate;
        int mortality;
        for (int v = 1; v <= 10; v++) {
            birthRate = (people / 1000) * 17;
            mortality = (people / 1000) * 8;
            people += (birthRate - mortality);
            System.out.printf("Год %d, численность населения составляет %d\n",v, people);


        }




    }

}