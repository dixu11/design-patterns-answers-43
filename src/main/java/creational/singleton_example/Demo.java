package creational.singleton_example;

public class Demo {
    public static void main(String[] args) {

       Repository.showType();

        Repository repository1 =  Repository.getRepository();
        Repository repository2 = Repository.getRepository();
        System.out.println("Czy takie same?");
        System.out.println(repository1 == repository2);

        SingletonEnum enumowy1 = SingletonEnum.INSTANCE;
        SingletonEnum enumowy2 = SingletonEnum.INSTANCE;
        System.out.println("Czy takie same?");
        System.out.println(enumowy1 == enumowy2);
    }
}
