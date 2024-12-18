import java.util.Scanner;
public class kullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, password, forgot, newpassword , trueUsername ="ahmet", truePassword= "mehmet";

        System.out.println("Lütfen Kullanıcı Adınızı Girin");
        username = input.nextLine();
        System.out.println("Lütfen Şifrenizi Girin");
        password = input.nextLine();

        if(username.equals(trueUsername) && password.equals(truePassword)){
                System.out.println("Hoşgeldiniz Sayın:" + username);
        }else{
            System.out.println("Şifre veya Kullanıcı Adı Yanlış. Sıfırlamak İster misiniz? \n Lütfen Evet veya Hayır Yazınız! ");
            forgot= input.nextLine();
            if(forgot.equals("evet")){
                System.out.println("Lütfen Yeni Şifrenizi Girin");
                    newpassword = input.nextLine();
                    if(newpassword.equals(truePassword) ){
                        System.out.println("Önceki Şifreniz İle Aynı Olamaz.");
                    }else{
                        System.out.println("Şifreniz Başarıyla Değiştirildi");
                    }
            }else{
                System.out.println("Tekrar Görüşmek Üzere");
            }
        }
        
    }
}
