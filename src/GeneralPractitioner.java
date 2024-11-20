/**
 *  Represents a general practitioner in the health system.
 *  Inherits from the HealthProfessional class.
 */

public class GeneralPractitioner extends HealthProfessional{


    //Specialization of the practitioner
    private String specialization;

    //Sets default specialization to "General Practitioner".
    public GeneralPractitioner() {
        super();
        this.specialization = "General Practitioner"; // Assign a default value
    }

    //Call the superclass constructor to initialize
    public GeneralPractitioner(long ID, String name, String describe,String type,int yearsOfExperience, String contactInfo) {
        super(ID, name, describe, yearsOfExperience, contactInfo);
        this.specialization = type;
    }


    //Print member variables of medical professionals
    @Override
    public void print(){
        super.print();
        System.out.println("Specialization:'"+this.specialization+ '\'');
    }
}
