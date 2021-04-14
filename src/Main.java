import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        CrispyFlour c1 = new CrispyFlour("1", "tt", LocalDate.of(2020, 10, 20), 10000, 1);
        CrispyFlour c2 = new CrispyFlour("1", "tit", LocalDate.of(2020, 10, 20), 20000, 1);
        CrispyFlour c3 = new CrispyFlour("1", "it", LocalDate.of(2020, 10, 20), 30000, 1);
        CrispyFlour c4 = new CrispyFlour("1", "it", LocalDate.of(2020, 10, 20), 40000, 1);
        CrispyFlour c5 = new CrispyFlour("1", "it", LocalDate.of(2020, 10, 20), 50000, 1);

        Meat m1 = new Meat("1", "name", LocalDate.of(2021, 04,10), 100000, 2);
        Meat m2 = new Meat("1", "name", LocalDate.of(2021, 04,10), 100000, 2);
        Meat m3 = new Meat("1", "name", LocalDate.of(2021, 04,10), 100000, 2);
        Meat m4 = new Meat("1", "name", LocalDate.of(2021, 04,10), 100000, 2);
        Meat m5 = new Meat("1", "name", LocalDate.of(2021, 04,10), 100000, 2);

        Material[] materials = {c1, c2, c3, c4, c5, m1, m2, m3, m4, m5};


        Manager m = new Manager(materials);
        System.out.println(m.getDifferent());
    }
}
