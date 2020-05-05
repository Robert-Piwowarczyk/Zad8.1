import java.util.Scanner;

public class Meadow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Insect[] insects = new Insect[3];
        for (int i = 0; i < insects.length; i++) {
            Insect insect = new Insect("", 4);
            if (isNotRepeated(insect, insects)) {
                insects[i] = insect;
                i++;
            } else {
                System.out.println("duplicat, ponów próbę dodawania" +
                        " owadów");
            }
        }
        for (Insect insect : insects) {
            if (insects.equals(insect)) ;
        }
        new Insect("", 4);
        System.out.println("Podaj nazwy owadów, zakończ enterem: ");
        String name = sc.nextLine();
    }
    private static boolean isNotRepeated(Insect insect, Insect[] insects) {
    }
}



