package hms.appointments;

import java.util.ArrayList;
import java.util.Scanner;

import hms.util.Label;

public class AppointmentList {
    private static ArrayList<Appointment> list = new ArrayList<>();

    public static boolean add_appointment() {
        Scanner sc = new Scanner(System.in);
        Label.h_label("Fill details to book an appointment");
        int aid = list.size();
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Enter your gender (Male / Female) : ");
        String gender = sc.nextLine();
        System.out.print("Type your Isuue : ");
        String issue = sc.nextLine();
        String comment = "No comment";
        System.out.print("Any Comment for doctor ? (optional) : ");
        comment = sc.nextLine();
        System.out.print("Enter appointment date (DD/MM/YYYY) : ");
        String a_date = sc.nextLine();
        Appointment a = new Appointment(aid ,name,issue ,gender,age ,comment ,a_date);
        list.add(a);


        return false;
    }
}
