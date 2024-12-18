import java.util.Scanner;
public class cinZodyak {
    public static void main(String[] args) {     
        Scanner input = new Scanner(System.in);
        int dogumYılı, dogumMod;

        System.out.println("Lütfen Doğum Yılınızı Giriniz");
        dogumYılı = input.nextInt();
        dogumMod = dogumYılı % 12; 
        switch (dogumMod) {
            case 0:
                System.out.println("Maymun Yılında doğdunuz");
                break;
            case 1:
                System.out.println("Horoz Yılında doğdunuz");
                break;
            case 2:
                System.out.println("Köpek Yılında doğdunuz");
                break;
            case 3:
                System.out.println("Domuz Yılında doğdunuz");
                break;
            case 4:
                System.out.println("Fare Yılında doğdunuz");
                break;
            case 5:
                System.out.println("Öküz Yılında doğdunuz");
                break;
            case 6:
                System.out.println("Kaplan Yılında doğdunuz");
                break;
            case 7:
                System.out.println("Tavşan Yılında doğdunuz");
                break;
            case 8:
                System.out.println("Ejderha Yılında doğdunuz");
                break;
            case 9:
                System.out.println("Yılan Yılında doğdunuz");
                break;
            case 10:
                System.out.println("At Yılında doğdunuz");
                break;
            case 11:
                System.out.println("Koyun Yılında doğdunuz");
                break;          
            default:
                System.out.println("Doğum Yılınız Bulunamadı");
        }
    }
}
