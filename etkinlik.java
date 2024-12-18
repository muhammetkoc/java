import java.util.Scanner;

public class etkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sicaklik;

        System.out.println("Lütfen Hava Sıçaklığını Giriniz");
        sicaklik= input.nextInt();

        if(sicaklik > 5 ){
            if(sicaklik > 5 && sicaklik <= 15){
                System.out.println("Sinemaya Gidebilirsiniz");
            }else if(sicaklik > 15 && sicaklik <= 25){
                System.out.println("Piknik Yapmaya Gidebilirsiniz");
            }else{
                System.out.println("Yüzmeye Gidebilirsiniz");
            }
        }else{
            System.out.println("Kayak Yapmaya Gidebilirsiniz");
        }
    }

}
