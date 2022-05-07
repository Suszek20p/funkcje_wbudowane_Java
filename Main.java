public class Main {
    public static void main(String args[]) {

//        parseInt
//Funkcja pobiera argument dowolnego typu (najczęściej tekstowego) i zamienia go na liczbę. Gdy operacja nie powiedzie się, zwraca wartość NaN.
// Funkcja może pobierać jeszcze drugi argument, określający podstawę liczby (dziesiętna, szesnastkowa, binarna).
// Jeżeli ten argument nie zostanie podany, domyślnie podstawa jest dziesiętna.
//
//Ale jeżeli pierwszy argument zaczyna się od "0x", podstawa będzie szesnastkowa, natomiast gdy zaczyna się od "0", podstawa będzie ósemkowa.
//NaN oznacza, że wartość nie jest liczbą.

        int x =Integer.parseInt("123");
        int y =Integer.parseInt("123AB", 16);
        int z =Integer.parseInt("123", 8);
//        int a =Integer.parseInt("123AB", 8);
        int b =Integer.parseInt("0377");
//        int c =Integer.parseInt("0x377");

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
//        System.out.println(a);
        System.out.println(b);
//        System.out.println(c);

//          ParseFloat
//        Funkcja działa podobnie jak parseInt(), ale działa również na ułamkach.
//        Pobiera argument dowolnego typu (najczęściej tekstowego) i zamienia go na liczbę mogącą zawierać część ułamkową.
//        Funkcja poprawnie interpretuje zapisy liczby w postaci wykładniczej.

        Float x2 =Float.parseFloat("123.86");
        System.out.println(x2);

//        isNaN
//        Funkcja sprawdza, czy wartość podana jako parametr nie jest liczbą.
//        Przy jej pomocy można np. sprawdzić, czy funkcji parseInt() udało się z powodzeniem zamienić podaną wartość na liczbę.
//        Funkcja zwraca wartość true, gdy argument wejściowy nie jest liczbą, lub false, gdy argument jest liczbą.liczbą

        Double d1=new Double(7.0/0.0);
        Double d2=new Double(0.0-0.0);
        Double d3=new Double(55.0*0.0/0.0);
        System.out.println(d1 +"-" +d1.isNaN());
        System.out.println(d2 +"-" +d2.isNaN());
        System.out.println(d3 +"-" +d3.isNaN());

//        isFinite
//        Funkcja sprawdza, czy wartość podana jako parametr to liczba różna od infinity oraz od NaN.
//        Gdy argument wejściowy ma wartość infinity lub NaN, funkcja zwraca false, gdy jest liczbą, zwraca true.

        double d1v2 = 99991.22;
        Double d2v2 = new Double(d1/0);

        if(Double.isFinite(d2))
        {
            System.out.println("Value returned is : " +Double.isFinite(d2v2));
        }
        else
        {
            System.out.println("Value returned is : "+Double.isFinite(d2v2));
        }

//        eval
//        Funkcja ta pobiera ciąg znaków i uruchamia go jako kod języka JavaScript. Zaleca się nieużywanie tej funkcji.

//        alert
//        Funkcji alert() nie ma w specyfikacji języka, ale można jej używać w środowisku przeglądarki. Służy do wyświetlania komunikatów w oknie dialogowym.

    }

}