/* ad soyad : Ezgi Efsa Güleç 
   no: 250541023 */

public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
       System.out.println("===Amerikan Formatı===");
       System.out.println(day + ", " + mounth + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
       System.out.println("===Avrupa Formatı===");
       System.out.println(date + " " + mounth + " " + year + ", " + day);
    }

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.print("Gün: ");
        String day = input.nextLine();

        System.out.print("Ay: ");
        String month = input.nextLine();

        System.out.print("Tarih : ");
        int date = input.nextInt();

        System.out.print("Yıl: ");
        int year = input.nextInt();

        printAmerican(day, month, date, year);
        printEuropean(date, month, year, day);

    }
}
