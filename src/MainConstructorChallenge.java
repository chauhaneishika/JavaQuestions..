public class MainConstructorChallenge {
    static void main() {

        ConstructorChallenge constructor = new ConstructorChallenge("Eishika",500.00,"chauhaneishika@gmail.com");

        System.out.println(constructor.getName());
        System.out.println(constructor.getCreditLimit());
        System.out.println(constructor.getEmailAddress());

        ConstructorChallenge secondConstructor = new ConstructorChallenge();
        System.out.println(secondConstructor.getName());
        System.out.println(secondConstructor.getCreditLimit());
        System.out.println(secondConstructor.getEmailAddress());

        ConstructorChallenge thirdConstructor = new ConstructorChallenge("Manya","manya123@gmail.com");
        System.out.println(constructor.getName());
        System.out.println(constructor.getCreditLimit());
        System.out.println(constructor.getEmailAddress());

    }
}
