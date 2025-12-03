public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}

main() başlar

print("No, I ");
Çıktı: No, I

zoop() çağrısı:
zoop()
1. baffle()
print(" wug");
ping();


ping():

println(".");

 wug.

zoop() devam
print(" You wugga ");

 Çıktı:

 You wugga 

2. baffle() tekrar

Yine:

 wug.

No, I  wug. You wugga  wug.

main() devam:
print("I ");

Çıktı:

I 

main() → baffle()

Yine:
 wug.

No, I  wug. You wugga  wug.I  wug.
