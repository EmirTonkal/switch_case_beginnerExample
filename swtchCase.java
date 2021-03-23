import java.util.Scanner;

public class swtchCase {

    public static void main(String[] args) {

        int bakiye = 1000;

        System.out.println("\n1 Para Çekme \n2 Para Yatırma \n3 Bakiye Sorgulama");
        System.out.println("Yapmak istediğiniz işlemi seçiniz:");

        Scanner deger = new Scanner(System.in);

        int deger1 = deger.nextInt();

        switch (deger1) {
        case 1:
            System.out.println("Ne kadar çekmek istiyorsunuz?");
            Scanner cekilecekDeger = new Scanner(System.in);
            int cekilecekDeger1 = deger.nextInt();
            bakiye = bakiye - cekilecekDeger1;
            System.out.println("Yeni bakiye " + bakiye);
            break;

        case 2:
            System.out.println("Ne kadar yatırmak istiyorsunuz?");
            Scanner yatirilacakDeger = new Scanner(System.in);
            int yatirilacakDeger1 = yatirilacakDeger.nextInt();
            bakiye = bakiye + yatirilacakDeger1;
            System.out.println("Yeni bakiye " + bakiye);
            break;

        case 3:
            System.out.println("Bakiyeniz: "+bakiye);
            break;

        default:
            break;
        }

    }
}