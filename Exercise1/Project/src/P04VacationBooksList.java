import java.util.Scanner;

public class 200P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pages = Integer.parseInt(scan.nextLine());
        int hourPages = Integer.parseInt(scan.nextLine());
        int daysCount = Integer.parseInt(scan.nextLine());
        int time = (pages/hourPages)/daysCount;
        System.out.println(time);
    }
}
