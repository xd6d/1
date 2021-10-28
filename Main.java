public class Main {
    public static void main(String[] args) {
        Director a = new Director("Jacob", 8, 3);
        Jun b = new Jun("Jacob",8);
 //       jun c = new jun("Jacob",8,null);
        Employee c = b.createDifJun("Jack Fresco",54,"C2");
        System.out.println(c);
    }
}
