package Beach_80.src.day22_multiDimensionalArrays;

public class C03_MdaIstenenSayilariYazdirma {
    public static void main(String[] args) {
        /*
        Verilen 2 katli bir multi-dimensional array'de
        outer indeksi inner indeksi aynı olan sayıların toplamını bulunuz

        int[][] sayilar ={{1,5,6,9,4},{2,5,5,8},{3,1,6}};
        [0][0] + [1][1] + [2][2] ....
        */

        int[][] sayilar ={{1,5,6,9,4},{2,5,5,8},{3,1,6},{1,1,1,1,1}};
                        // 0,1,2,3,4,  0,1,2,3,  0,1,2,  0,1,2,3,4
        int istenenToplam=0;

        //kac kat array varsa o kadar for loop oluturacagiz

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if(i==j){
                    istenenToplam += sayilar[i][j];
                }
            }

        }
        System.out.println("istenenToplam = " + istenenToplam); // 1+5+6+1 = 13

    }
}
