package Beach_80.src.day33_encapculation;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogr1 = new Ogretmen();

        ogr1.setIsim("Tulay");
        System.out.println(ogr1.getIsim());// Tulay
        /*
        Bu yontemde data hiding degil
        daha anlasilir bir kod amaclanmis olur
         */
    }
}
