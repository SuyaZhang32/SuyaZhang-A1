/**
 * Inherited from the HealthProfessional class for surgeon
 */
public class Surgeon extends HealthProfessional{

    //Specialization of health personnel
    private String specialization;

    public Surgeon() {
        super();
        this.specialization = "Surgeon"; // Assign a default value
    }

    //Call the superclass constructor to initialize
    public Surgeon(long ID, String name, String describe,String type) {
        super(ID, name, describe);
        // Parameter check to ensure that specialization always has a valid value
        if (type == null || type.isEmpty()) {
            this.specialization = "Surgeon"; // Default value
        } else {
            this.specialization = type; // Assign to specialization
        }
    }

    //Print member variables of medical professionals
    @Override
    public void print(){
        super.print();
        System.out.println("specialization:'"+this.specialization+ '\'');
    }

}
