package classes.persons;

public class Professor extends Person implements Ipersons{

    private int id;

    public Professor(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void assignID() {
        System.out.println("code to assign the ID to  professor ,  must  be  P-<consecutive> ");
    }


}
