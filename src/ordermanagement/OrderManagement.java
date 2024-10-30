package ordermanagement;
import java.io.*;
import java.util.*;
public class OrderManagement {

  public static void main(String[] args) throws FileNotFoundException {

      Scanner sc1 = new Scanner(new File("KH.in"));
        int n = sc1.nextInt();
        sc1.nextLine();
        ArrayList<Customer> listCustomer = new ArrayList<>();
        for (int i = 0; i < n; ++ i) {
            listCustomer.add(new Customer(String.format("KH%03d", i + 1), sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        
        Scanner sc2 = new Scanner(new File("MH.in"));
        int m = sc2.nextInt();
        sc2.nextLine();
        ArrayList<Item> listItem = new ArrayList<>();
        for (int i = 0; i < m; ++ i) {
            listItem.add(new Item(String.format("MH%03d", i + 1), sc2.nextLine(), sc2.nextLine(), Integer.parseInt(sc2.nextLine()), Integer.parseInt(sc2.nextLine())));
        }
        
        Scanner sc3 = new Scanner(new File("HD.in"));
        int p = sc3.nextInt();
        sc3.nextLine();
        for (int i = 0; i < p; ++ i) {
            String maKH = sc3.next();
            Customer khachHang = null;
            for (Customer j : listCustomer) {
                if (j.getMaKH().equals(maKH)) {
                    khachHang = j;
                    break;
                }
            }
            String maMH = sc3.next();
            Item matHang = null;
            for (Item j : listItem) {
                if (j.getMaMH().equals(maMH)) {
                    matHang = j;
                    break;
                }
            }
            Order hoaDon = new Order(String.format("HD%03d", i + 1), khachHang, matHang, Integer.parseInt(sc3.next()));
            System.out.println(hoaDon);
        }
    }
    
}
