public class tekst {
    public static void main(String[] args) {
        System.out.println("Ćwiczenia z języka Java".charAt(0)); //wypisuje znak ze stringa z danym indexem
        System.out.println("Ćwiczenia z języka Java".length()); //wypisuje długość stringa ze spacjami
        System.out.println("Ćwiczenia z języka Java".toLowerCase()); //wypisuje wszystko w małych literach
        System.out.println("Ćwiczenia z języka Java".toUpperCase()); //wypisuje wszystko w wielkich literach
        System.out.println("Ćwiczenia z języka Java".indexOf('Ć')); //zwraca pierwsze miejsce na którym jest dany char
        System.out.println("Ćwiczenia z języka Java".indexOf("nia")); //zwraca pierwsze miejsce na którym jest dany string
        //replaceAll działa prawie tak samo ale zamienia każdy przypadek pierwszego argumentu
        System.out.println("Ćwiczenia z języka Java".replace("Ćwiczenia","Zadania")); //zamienia tekst z pierwszego argumentu tym z drugiego
        System.out.println("Ćwiczenia z języka Java".replace('n','i')); //zamienia chara z pierwszego argumentu tym z drugiego
        System.out.println("Ćwiczenia z języka Java".substring(10)); //wycina pierwsze 10 znaków i wyswietla reszte
        System.out.println("Ćwiczenia z języka Java".concat(" z rozw.")); //dolaczenie na koniec tesktu stringa w argumencie
        System.out.println("Ćwiczenia z języka Java" + " \b " + "z odp."); //konkatenacja
    }
}