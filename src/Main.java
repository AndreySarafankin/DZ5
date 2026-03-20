public class Main {
    public static void main(String[] args) {
        //Задание1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //Задание2
        for (int y = 10; y >= 1; y--) {
            System.out.println(y);
        }
        //Задание3
        for (int z = 0; z < 17; z = z + 2) {
            System.out.println(z);
        }
        //Задание4
        for (int x = 10; x >= -10; x--) {
            System.out.println(x);
        }
        //Задание5
        for (int e = 1904; e< 2096; e = e +4){
            System.out.println(e + " год является високосным");
        }
        //Задание6
        for (int c = 7; c <=98; c= c +7){
            System.out.println(c);
        }
        //Задание7
        for (int r = 1; r <= 512; r = r * 2){
            System.out.println(r);
        }
        //Задание8
        int money = 29000;
        int total = 0;
        for (int q = 1; q <= 12; q++) {
            total = total + money;
            System.out.println("Месяц " + q + ", сумма накоплений равна " + total + " рублей");
        }
        //Задание9
        int money1 = 29000;
        int total1= 0;
        for (int w = 1; w <= 12; w++) {
            total1 = total1 + total1/100;
            total1 = total1 + money1;
            System.out.println("Месяц " + w + ", сумма накоплений равна " + total1 + " рублей");
        }
        //Задание10
        for (int g = 1; g<=10; g++) {
            System.out.println("2 * " + g + " = "+(2 * g));
        }
    }
}