package Beach_80.src.day18_while_doWhileLoop;

public class W08_DoWhileSoru1 {
    public static void main(String[] args) {
        //9'dan 190'a kadar 7'nin tam kayi olan sayilari yazdirin

        int bas=9;
        int bitis=190;
        int temp=bas;

        do{
            if(temp %7 == 0){
                System.out.print(temp + " ");

            }temp++;

        }while(temp<bitis);
    }
}
