import java.util.Scanner;
public class artikYıl {
    public static void main(String[] args) {
        int yil, mod;
        Scanner input = new Scanner(System.in);

        System.out.println("Artık Yıl hesaplamak için Yılı Giriniz");
        yil = input.nextInt();
        mod = yil % 4;

        if(mod == 0 ){
            System.out.println(yil + " Artık Bir yıldır!");
        }else {
            System.out.println(yil+"  Artık Bir Yıl Değildir");
        }
    }
}
