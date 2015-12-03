/**
 * Created by robertsg.
 * Project for Charles Lim see notes for details
 */

//Importing modules needed
//To learn more about joda time go to http://www.joda.org/
import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import java.util.Scanner;

public class slaProject {
    //Declare variables needed
    int slaHoursRequest;
    String inputDate;

    public void go() {
        //setup loop for weekend
        while (true) {

            //Setup scanner
            Scanner in = new Scanner(System.in);

            //Instructions and Guide
            System.out.println("Calculate what day your project will be completed. \n" +
                    "Enter the start date and expected hours for the completion. \n" +
                    "The program calculates an 8 hour work day and will skip weekends. \n" +
                    "If your start date is on a weekend you will receive a warning and \n" +
                    "it will move the start date to Monday.");

            System.out.println();

            //What is the start date to begin the project
            System.out.println("What is the start date for the project?");
            System.out.println("Please input date in mm/dd/yyyy format");
            inputDate = in.nextLine();
            //todo: validate that correct format was used if not allow to retype date

            //Converting string aDate into date DateTime object
            DateTime startDate = DateTime.parse(inputDate,
                    DateTimeFormat.forPattern("MM/dd/yyyy"));

            //Check what day of the week the start is
            int dayOfWeek = startDate.getDayOfWeek();

            //Check if start is on a weekend and flash warning.
            if ((dayOfWeek == 6) || (dayOfWeek == 7)) {
                //If it's a weekend add 2 days
                startDate = startDate.plusDays(2);
                //Whatever week it is we start with Monday as it was the weekend when we started
                startDate = startDate.withDayOfWeek(DateTimeConstants.MONDAY);

                System.out.println("The start of project is on the weekend do you want to proceed?");
                System.out.println("The program will skip to Monday and start from there.");
                System.out.println("Press n to start over or press any other key to continue");
                String weekendCheck = in.nextLine();
                if (weekendCheck.equalsIgnoreCase("n")) {

                    System.out.println("Please go back and revise the start date");
                    break;
                }
            }

            //System.out
            System.out.println("The start date of the project is: " + startDate.toString("MMM-dd-yyyy"));

            //What is the SLA time in whole hours
            System.out.println("What is the requested hours for completion?");
            slaHoursRequest = in.nextInt();

            //Convert slaHoursRequest into days
            int addADay = 0;
            for (int hoursInDay = 8; hoursInDay < slaHoursRequest; ) {
                addADay++;
                slaHoursRequest = slaHoursRequest - 8;
            }

            //Remove the weekends from the calendar
            LocalDate weekendEliminatorDate = new LocalDate(startDate);
            int i = 0;
            while (i < addADay) {
                weekendEliminatorDate = weekendEliminatorDate.plusDays(1);
                if (weekendEliminatorDate.getDayOfWeek() <= 5) {
                    i++;
                }
            }

            //setup endDate may want to make more calculations later and don't want to change weekendEliminatorDate
            LocalDate endDate = new LocalDate(weekendEliminatorDate);

            System.out.println("Your expected end date is: " + endDate.toString("MMM-dd-yyy"));
            break;
        }
    }
}