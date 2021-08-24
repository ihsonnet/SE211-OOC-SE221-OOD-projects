import com.storage.Report;
import com.storage.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        User user1 = new User(1, "A", 20);
//        User user2 = new User(2, "B", 10);
//        User user3 = new User(3, "C", 30);
//
//        Report report1 = new Report("24R",1);
//        Report report3 = new Report("24R",1);
//        Report report4 = new Report("24R",1);
        Scanner in = new Scanner(System.in);

        User user = new User();
        System.out.println("\nUser Id: ");
        user.setId(in.nextInt());
        System.out.println("\nName: ");
        user.setName(in.next());
        System.out.println("\nAge: ");
        user.setAge(in.nextInt());

        Report report = new Report();
        System.out.println("\nReport Id: ");
        report.setReporId(in.next());
        report.setId(user.getId());
        if (user.getAge()>20){
            System.out.println("\nMore than 20; Report ID = "+report.getReporId());
        }
    }
}
