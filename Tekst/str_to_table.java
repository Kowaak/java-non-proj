public class str_to_table {
    public static void main(String[] args) {
        String napis = "abcdef";
        System.out.println("Normalna kolejność znaków: "+napis);
        char[] dane = napis.toCharArray(); //konwersja
        for(int i=0, j=dane.length-1;i<j;i++,j--){
            char tmp = dane[i];
            dane[i] = dane[j];
            dane[j] = tmp; 
        }
    }
} 