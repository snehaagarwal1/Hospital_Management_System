package hms.menus;

import java.util.Scanner;

import hms.appointments.Appointment;
import hms.appointments.AppointmentList;
import hms.db.LocalDB;
import hms.patient.PatientList;
import hms.util.Label;
import hms.util.Line;

public class PatientMenu implements Menuable {
    public void show() {
        Scanner sc = new Scanner(System.in);
        final int endChoice = 0;
        int choice = endChoice;
        do {
            Line.horizontalLine("upper");
            System.out.println("1 -> Book Appointment");
            System.out.println("2 -> View Appointment");
            System.out.println("3 -> Cancel Appointment");
            System.out.println("4 -> View Medicines");
            System.out.println("4 -> Logout");
            System.out.println("0 -> Exit");
            Line.horizontalLine();
            System.out.print("Please enter any one :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (AppointmentList.book_appointment()) {
                        System.out.println("Appointment booked Successfully");
                    } else {
                        System.out.println("failed to book an appointment");
                    }
                    break;

                case 2:
                    Appointment ap = AppointmentList.view_AppointmentByPatient(LocalDB.getPatientData().getPid());
                    Label.h_label("Appointment Details");
                    System.out.println("Patient Id : " + ap.getPid());
                    System.out.println("Appointment Id : " + ap.getAid());
                    System.out.println("Patient Name : " + ap.getName());
                    System.out.println("Patient Gender : " + ap.getGender());
                    System.out.println("Patient Age: " + ap.getAge());
                    System.out.println("Appointment Date : " + ap.getA_date());
                    System.out.println("Patient Issue : " + ap.getIssue());
                    System.out.println("Comment: " + ap.getComment());

                    break;

                case endChoice:
                    break;

                default:
                    System.out.println("Invalid choice try again");
            }
        } while (choice != endChoice);
    }

}
