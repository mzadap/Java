package interview.strings.days100.constructor;

public class ConstructorChainingUsingThis {

    ConstructorChainingUsingThis() {
        this("this");
        System.out.println("Hello");
    }

    ConstructorChainingUsingThis(String str) {
        System.out.println("Hello this is new constructor " + str);
    }

    public static void main(String[] args) {
        ConstructorChainingUsingThis chainingUsingThis = new ConstructorChainingUsingThis();
    }
}
