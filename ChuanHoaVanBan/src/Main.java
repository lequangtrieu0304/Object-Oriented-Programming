import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        VanBan vanBan = new VanBan(text);
        System.out.println(vanBan.demSoTu());
        System.out.println(vanBan.demKyTuA());
        System.out.println(vanBan.chuanHoa());
    }
}