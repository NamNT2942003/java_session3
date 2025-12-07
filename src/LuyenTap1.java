import java.text.DecimalFormat;
import java.util.Scanner;

public class LuyenTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("###,###.00");
        do {
            System.out.println("======== NHẬP THÔNG TIN HÓA ĐƠN ======");
            System.out.println("Nhập tên khách hàng: ");
            String customerName = validInput();
            System.out.println("Nhập tên sản phẩm: ");
            String productName = validInput();
            System.out.println("Nhập giá sản phẩm: ");
            double price = validInteger();
            System.out.println("Nhập số lượng mua: ");
            double quantity = validInteger();
            System.out.println("Khách có thẻ thành viên? (true/false): ");
            boolean trueFalse = Boolean.parseBoolean(validInput());

            double total = price * quantity;
            double bouns = total * 10 / 100;
            double VAT = total * 8 / 100;

            System.out.println("============= HÓA ĐƠN ===========");
            System.out.println("Khách hàng: " + customerName);
            System.out.println("Sản phẩm: " + productName);
            System.out.println("Số lượng: " + quantity);
            System.out.println("Đơn giá: " + formatter.format(price) + "VND");
            System.out.println("Thành tiền: " + formatter.format(total) + "VND");
            if (trueFalse) {
                System.out.println("Giảm giá thành viên (10%): " + formatter.format(bouns) + "VND");
                System.out.println("Tiền VAT (8%): " +formatter.format(VAT) +"VND");
                double totalPrice = total-bouns+VAT;
                System.out.println("Tổng thanh toán: " + formatter.format(totalPrice) + "VND");
            }else {
                System.out.println("Tiền VAT (8%): " +formatter.format(VAT) +"VND");
                System.out.println("Giảm giá: 0");
                double totalPrice = total-VAT;
                System.out.println("Tổng thanh toán: " + formatter.format(totalPrice) + "VND");
            }

        } while (true);
    }

    public static String validInput() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine();
                return input;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static double validInteger() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                double input = Double.parseDouble(sc.nextLine());
                return input;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
