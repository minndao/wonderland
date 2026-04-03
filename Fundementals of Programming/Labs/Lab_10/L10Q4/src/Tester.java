
package Lab_10.L10Q4.src;

 class Tester {
    public static void main(String[] args) {
        Appointment appointment = new Appointment(8, 11, 2026, 10, 13);
        Appointment a2 = new Appointment(20,11,2026,15,17);
       

        appointment.search("8/9/2026 13","8/9/2026 15");
        a2.search("8/11/2026 10","8/11/2026 13");
    }
}
