import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Jumanyn kunun Jazynyz: ");
        String day = sc.nextLine();
        Days days = Days.valueOf(day.toUpperCase());

        switch (days){
            case DUYSHONBU -> System.out.println("Java sabagy, teoria!");
            case SHEISHENBI -> System.out.println("Java sabagy, practica!");
            case SHARSHENBI -> System.out.println("Anglis tili sabagy!");
            case BEISHENBI -> System.out.println();
            case JUMA -> System.out.println();
            case ISHENBI -> System.out.println();
            case JEKSHEMBI -> System.out.println("Dem aluu kunu!");
            default -> System.out.println("Mynday kun jok!");
        }

    }
}