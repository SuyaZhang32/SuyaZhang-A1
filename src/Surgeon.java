/**
 * Inherited from the HealthProfessional class for surgeon
 */
public class Surgeon extends HealthProfessional{

    //Specialization of health personne
    private String specialization;

    public Surgeon() {
        super();
        this.specialization = "Surgeon"; // Assign a default value
    }

    //Call the superclass constructor to initialize
    public Surgeon(long ID, String name, String describe,String type) {
        super(ID, name, describe);
        this.specialization = specialization; // Use 'this' for better clarity
    }


    //Print member variables of medical professionals
    @Override
    public void print(){
        super.print();
        System.out.println("specialization:'"+this.specialization+ '\'');
    }

}
