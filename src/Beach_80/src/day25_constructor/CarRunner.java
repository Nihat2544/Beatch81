package Beach_80.src.day25_constructor;

public class CarRunner {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.fiyat=150000;
        car1.yil=2020;
        car1.marka="Toyota";

        System.out.println("Car1 bilgileri\nMarka : " + car1.marka + "\nModel :" + car1.model +
                           "\nFiyat :" + car1.fiyat + "\nYil : " + car1.yil);

        Car car2 = new Car();
        System.out.println("Car2 bilgileri\nMarka : " + car2.marka + "\nModel :" + car2.model +
                "\nFiyat :" + car2.fiyat + "\nYil : " + car2.yil);
        /*
        Herhangi bir obje uzerinden bir variable yazdirmaya calistigimizda
        Java degeri su siralama ile arar
        1- o obje olusturulduktan sonra bir deger atandi mi?
        2- Objenin olusturuldugu class'da variable'a bir deger atandi mi?
        3- O zaman data turune gore Java default bir deger atar
         */

    }
}
