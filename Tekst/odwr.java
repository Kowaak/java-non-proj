public class odwr {
    public static void main(String[] args) {
        String napis = "abcdef";
        System.out.println("Normalna kolejność znaków: "+napis);
        System.out.print("Odwrotna kolejność znaków: ");
        for(int i=napis.length()-1;i>=0;--i){
            System.out.print(napis.charAt(i));
        }
    }
}   