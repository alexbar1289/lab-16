public class SimpGen {
    public static void main(String[] args) {

        TwoGen<Integer, String> tgobj = new TwoGen<Integer, String>(88, "Обобщения");
        tgobj.showTypes();
        int v = tgobj.getOb1();
        System.out.println("Значение: " + v);
        String str = tgobj.getOb2();
        System.out.println("Значение: " + str);
    }
}