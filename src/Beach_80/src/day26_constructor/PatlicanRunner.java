package Beach_80.src.day26_constructor;

public class PatlicanRunner {
    public static void main(String[] args) {

        Patlican bodur = new Patlican("Adana", "Kor Ahmet", 2022, "Yerli");
        System.out.println("bodur :  " + bodur);

        System.out.println("********************");
        Patlican bostan = new Patlican("Tokat", 2021);
        System.out.println("bostan : " + bostan);

        System.out.println("********************");
        Patlican kebaplik = new Patlican("Bursa", "Cifci Ali Emmi" , "Yerli");
        System.out.println("kebaplik : " + kebaplik);

    }
}
