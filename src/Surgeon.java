/**
 * Represents a surgeon in the health system.
 * Inherits from the HealthProfessional class.
 */
public class Surgeon extends HealthProfessional{

    //Specialization of health personnel
    private String specialization;

    //Sets specialization to "Surgeon" by default.
    public Surgeon() {
        super();
        this.specialization = "Surgeon"; // Assign a default value
    }

    //Call the superclass constructor to initialize
    public Surgeon(long ID, String name, String describe,String type,int yearsOfExperience, String contactInfo) {
        super(ID, name, describe, yearsOfExperience, contactInfo);
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
