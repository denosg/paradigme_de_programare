public class Main {

    public static void main(String[] args) {
        Dog cane = new Dog("andrei", "husky");
        Dog cane2 = new Dog("raul","vagabond");

        System.out.println("cane1: " + cane.getName());
        System.out.println("cane2: " + cane2.getName());

        final String caneName = cane.getName();

        cane.setName(cane2.getName());
        cane2.setName(caneName);

        System.out.println("cane1: " + cane.getName());
        System.out.println("cane2: " + cane2.getName());
    }
}
