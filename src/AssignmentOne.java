import java.util.ArrayList;

/**
 * AssignmentOne is the main class of the project and is used to perform interactions with the reservation system
 */

public class AssignmentOne {

    public static void main(String[] args) {
        long hpOneID = 62345l;
        String hpOneName = "voctoy";
        String hpOneDesc = "super healthProfessional";
        int hpOneExperience = 10;
        String hpOneContact = "voctoy@example.com";

        //Create examples of medical professionals by constructing methods
        HealthProfessional hpOne = new HealthProfessional(hpOneID,hpOneName,hpOneDesc,hpOneExperience,hpOneContact);
        //Call the output information method of the instance
        hpOne.print();
        System.out.println("");
        // Part 3 – Using classes and objects
        GeneralPractitioner  general1 = new GeneralPractitioner(12345l,"voctoy.smix","first generalProfessional","general",5,"smix@123.com");
        general1.print();
        System.out.println("");
        GeneralPractitioner  general2 = new GeneralPractitioner(12346l,"voctoy.aluph","18 age generalProfessional","general",3,"aluph@123.com");
        general2.print();
        System.out.println("");
        GeneralPractitioner  general3 = new GeneralPractitioner(12349l,"voctoy.alix","new generalProfessional","general",7,"alix@123.com");
        general3.print();
        System.out.println("");
        Surgeon surgeon1 = new Surgeon(12352l,"voctoy.adom","super surgeon","surgeon",4,"adom@123.com");
        surgeon1.print();
        System.out.println("");
        Surgeon surgeon2 = new Surgeon(12354l,"voctoy.frened","old surgeon","surgeon",8,"frened@123.com");
        surgeon2.print();
        System.out.println("");
        System.out.println("------------------------------");


        // Part 5 – Collection of appointments
        ArrayList<Appointment> appointmentList = new ArrayList<>();
        //Make an appointment with a general practitioner 1
        appointmentList = createAppointment(appointmentList,new Appointment("Susan",19928831l,"8:00",general2));
        //Make an appointment with a general practitioner 2
        appointmentList = createAppointment(appointmentList,new Appointment("Jduer",19954671l,"11:00",general3));
        //Make an appointment with a surgeon1
        appointmentList = createAppointment(appointmentList,new Appointment("Jessic",199546731l,"12:00",surgeon1));
        //Make an appointment with a surgeon2
        appointmentList = createAppointment(appointmentList,new Appointment("Galun",19976541l,"3:00",surgeon1));
        //Print a list of appointments
        printExistingAppointments(appointmentList);
        System.out.println("------------------------------");

        //Unappointed surgeon 1
        appointmentList = cancelBooking(appointmentList,new Appointment("Susan",19928831l,"8:00",general2));
        //Print the list of cancelled appointments
        printExistingAppointments(appointmentList);

        System.out.println("------------------------------");
    }


    public static ArrayList<Appointment>  createAppointment(ArrayList<Appointment> appointmentList,Appointment appointment){
        if(appointmentList == null){
            System.out.println("exception appointmentList is null");
            return appointmentList;
        }
        if(appointment == null){
            System.out.println("exception appointment is null");
            return appointmentList;
        }
        //For loop reservation information, if it is not repeated, the appointment will be successful
        for (Appointment element:appointmentList) {
            if(element.equals(appointment)){
                System.out.println("exception appointment is repeat");
                return appointmentList;
            }
        }
        appointmentList.add(appointment);
        return appointmentList;
    }

    public static void  printExistingAppointments(ArrayList<Appointment> appointmentList){
        //For loop printing appointment information
        for (Appointment element : appointmentList) {
            element.print();
            System.out.println("");
        }
    }

    public static  ArrayList<Appointment>  cancelBooking(ArrayList<Appointment> appointmentList,Appointment appointment){

        if(appointmentList == null){
            System.out.println("exception appointmentList is null");
        }
        if(appointment == null){
            System.out.println("exception appointment is null");
        }
        if(appointmentList.size() == 0){
            System.out.println("error appointment info not found");
        }
        //For circular reservation information. If the reservation information is successfully compared, find the elements to be deleted
        Appointment cancelElement = null;
        for (Appointment element:appointmentList) {
            if(element.equals(appointment)){
                cancelElement = element;
            }
        }
        //Did not find the element that will be deleted, print the prompt. Otherwise, the cancellation is successful.
        if(cancelElement == null){
            System.out.println("error appointment info not found");
        }else{
            appointmentList.remove(cancelElement);
        }
        return appointmentList;

    }

}