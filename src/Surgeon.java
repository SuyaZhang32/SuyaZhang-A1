
public class Surgeon extends HealthProfessional{

    //Types of health personne
    private String type;

    public Surgeon() {
        super();
    }

    public Surgeon(long ID, String name, String describe,String type) {
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
