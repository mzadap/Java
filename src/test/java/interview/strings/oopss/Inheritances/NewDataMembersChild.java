package interview.strings.oopss.Inheritances;

public class NewDataMembersChild extends DataMembersChild {

    public NewDataMembersChild() {
        super();
        System.out.println("This is New data member child ");
    }

    public static void main(String[] args) {
        new NewDataMembersChild();
    }
}
