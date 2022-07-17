package classes.vehicles;

public class Bicycle {

    private int id; //BIC-XXX
    private String type;//Mountain, Road.
    private String color;//red,blue,green,yellow,purple.
    private boolean availability;//true,false


    public Bicycle(int id, String type, String color, boolean availability) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "id=" + id + ", type='" + type + '\'' + ", color='" + color + '\'' +  ", availability=" + availability + '}';
    }






}
