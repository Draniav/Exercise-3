package classes.persons;

public class Student extends Person implements Ipersons{

    private int id;

    public Student(String name, String surname, int age) {
        super(name, surname, age);
    }


    @Override
    public void assignID() {
        System.out.println("code to assign  the ID to  students ,  must  be  S-<consecutive> ");
    }


}
