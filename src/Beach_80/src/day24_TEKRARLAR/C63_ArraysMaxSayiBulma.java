package Beach_80.src.day24_TEKRARLAR;

public class C63_ArraysMaxSayiBulma {
    //Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.
    public static void main(String[] args) {

        int[] arr = {1,5,3,8,9,14,534,605,89,87};
        enBuyukSayi(arr);
    }

    public static void enBuyukSayi(int[] arr) {
        int buyukSayi = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(buyukSayi<arr[i]){
                buyukSayi = arr[i];
            }
        }
        System.out.println("buyukSayi = " + buyukSayi);
    }
}
