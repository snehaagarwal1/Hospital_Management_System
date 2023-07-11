import java.util.Scanner;

import hms.doctor.DoctorList;
import hms.menus.DoctorMenu;
import hms.menus.PatientAuthMenu;
import hms.util.Line;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            DoctorList.initialize();
            // System.out.println(DoctorList.getDoctorList().get(1));
            final int endChoice = 0;
            int choice = endChoice;
            do {
                Line.horizontalLine();
                System.out.println("1 -> Doctor Panel");
                System.out.println("2 -> Patient Panel");
                System.out.println("0 -> Exit");
                Line.horizontalLine();
                System.out.print("Please enter any one :");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        DoctorMenu dm = new DoctorMenu();
                        dm.show();
                        break;

                    case 2:
                        PatientAuthMenu pm = new PatientAuthMenu();
                        pm.show();
                        break;

                    case endChoice:
                        System.out.println("Thanku for using our system");
                        break;

                    default:
                        System.out.println("Invalid choice try again");
                }
            } while (choice != endChoice);
        } catch (Exception ex) {
            System.out.println("Something went wrong : " + ex.getMessage());
        } finally {
            sc.close();
        }
    }

}
