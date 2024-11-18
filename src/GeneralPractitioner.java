


public class GeneralPractitioner extends HealthProfessional{


    //Types of health personnel
    private String type;

    public GeneralPractitioner() {
        super();
    }

    public GeneralPractitioner(long ID, String name, String describe,String type) {
        super(ID, name, describe);
        this.type = type;
    }


    //Print member variables of medical professionals
    @Override
    public void print(){
        super.print();
        System.out.println("type:'"+this.type+ '\'');
    }
}
