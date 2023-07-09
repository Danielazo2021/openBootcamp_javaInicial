public class Main {
    public static void main(String[] args) {

        ICocheCrud coche= new ImpCocheCrud();
        coche.save();
        coche.findAll();
        coche.delete();

    }
}