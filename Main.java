public class Main {
    public static void main(String[] args) {
        //Testing Question 1
        APLine line1= new APLine(5, 4, -17);
        double slope1= line1.getSlope();
        boolean onLine1= line1.isOnLine(5, -2);  
        System.out.println(slope1 + " " + onLine1);

        APLine line2= new APLine(-25, 40, 30);
        double slope2= line2.getSlope();
        boolean onLine2= line2.isOnLine(5, -2);
        System.out.println(slope2 + " " + onLine2);

        //Testing Question 2a
        AppointmentBook book = new AppointmentBook();
        int freeBlock1= book.findFreeBlock(1, 15); //Technically period 2 but idc
        int freeBlock2= book.findFreeBlock(1, 9);
        int freeBlock3= book.findFreeBlock(1, 20);
        System.out.println(freeBlock1 + " " + freeBlock2 + " " + freeBlock3);

        //Question 2b
        boolean appointment1= book.makeAppointment(2, 4, 22);
        boolean appointment2= book.makeAppointment(3, 4, 3);
        boolean appointment3= book.makeAppointment(2, 4, 30);
        System.out.println(appointment1 + " " + appointment2 + " " + appointment3);
    }
}
