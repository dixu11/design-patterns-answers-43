package creational.singleton_example;

public class Repository {

    //Eager Singleton
    //private static Repository repository = new Repository();
    //Lazy Singleton
    private static  Repository repository = null;
    public static final String TYPE = "database";


    private Repository() {
        System.out.println("Budujemy obiekt");
    }

    public void save() {
        System.out.println("Zapisuje");
    }

    public static Repository getRepository() {
        if (repository == null) { // lazy
            repository = new Repository();
        }
        return repository;
    }

    public static void showType() {
        System.out.println("Typ repo to: " + TYPE);
    }

}
