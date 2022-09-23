package Beach_80.src.day41_abstractClass_Inteface;

public abstract class DAraba {
    public static void main(String[] args) {
      /*
      abstract class'da main method olmak zurunlulgu yoktur
      Eger abstract class sadece child class'larin
      tasimak zorunda oludugu ozellikleri belirlemek icin
      olusturulduysa main method'a ihtiyac olmaz
      sadece abstract method'lar olur

      ama bir abstract method'da standart belirlemek
      disinda da method'lar calisabilir.
      Bu  durumda ihtiyac olursa main method olusturulabilir
       */
    }
    protected abstract void yakit();
    protected abstract void kaporta();
    protected abstract void motor();
    /*
    sadece child class'larin mecburi tasiyacaklari ozellikleri
    belirleyen method'lar abstract method olur ve
    abstract method'larin body'si olmaz
     */
    public void klima(){
        System.out.println("Bazi arabalarda klima olabilir");
        /*
        abstract olmayan method'lara (abstract:Soyut anlamına geliyor)
        concrete method denir.
        abstract bir method'u abstract keyword ile belirtmek zorunludur
        concrete method'larda bunun deklare edilmesin gerek yoktur.
        Biz sadece abstraction ile ilgili korustugumuzda abstract
        olmayan method'lardan bahsetmek icin concrete tabirini kullaniriz
         */
    }

}
