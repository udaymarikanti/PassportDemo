//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


            FlightTicket ticket = new FlightTicket();
            PassPortDetails passPortDetails = new PassPortDetails("uday",556677,30,984875);
        FlightDetails fd = ticket.ticketDetails(passPortDetails);
        System.out.println(fd);
        }
    }
