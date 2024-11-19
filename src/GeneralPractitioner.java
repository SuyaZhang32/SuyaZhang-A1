/**
 * Inherited from the HealthProfessional class, denotes general practitioner
 */

public class GeneralPractitioner extends HealthProfessional{


    //Types of health personnel
    private String specialization;

    public GeneralPractitioner() {
        super();
        this.specialization = "General Practitioner"; // Assign a default value
    }

    //Call the superclass constructor to initialize
    public GeneralPractitioner(long ID, String name, String describe,String type) {
        super(ID, name, describe);
        this.specialization = specialization;
    }


    //Print member variables of medical professionals
    @Override
    public void print(){
        super.print();
        System.out.println("Specialization:'"+this.specialization+ '\'');
    }
}
