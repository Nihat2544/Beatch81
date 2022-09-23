package Beach_80.src.day18_while_doWhileLoop;

public class W09_DoWhileSoru2 {
    public static void main(String[] args) {
    // m'den baslayarak c harfine kadar tum harfleri yazdirin

        char ilkHarf= 'm';
        char sonHarf= 'c';
        char temp=ilkHarf;

        do{
            System.out.print(temp + " ");
            temp--;
        }while(temp>=sonHarf);

    }
}
