public class ImpCocheCrud implements ICocheCrud{
    @Override
    public void save() {
        System.out.println("este es el metodo SAVE!!");
    }

    @Override
    public void findAll() {
        System.out.println("este es el metodo findAll!!");
    }

    @Override
    public void delete() {
        System.out.println("este es el metodo delete!!");
    }
}
