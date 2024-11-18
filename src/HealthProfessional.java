/**
 * Basic category of medical professionals
 * ID
 * name
 * describe
 */
public class HealthProfessional {

    // Private member variable that stores the ID, name, and profile of the medical professional
    private long ID;

    private String name;

    private String describe;
    public HealthProfessional() {

    }
    // Full parameter constructor used to initialize the HealthProfessional object
    public HealthProfessional(long ID, String name, String describe) {
        this.ID = ID;
        this.name = name;
        this.describe = describe;
    }
    //Print Medical Professional Base Category Member Variables
    public void print(){
        System.out.println("ID:"+this.ID +"  "+"name:'"+this.name+ '\'');
        System.out.println("describe:'"+this.describe+ '\'');
    }

    // Compare two HealthProfessional objects for equality
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HealthProfessional that = (HealthProfessional) o;

        if (ID != that.ID) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (ID ^ (ID >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
