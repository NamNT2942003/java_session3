import java.util.Scanner;

public class LuyenTap2 {
    public static void main(String[] args) {
        int cntStudent = 0;
        double sum = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        do {
            System.out.println("************* MENU NHẬP ĐIỂM ************");
            System.out.println("1.    Nhập điểm học viên");
            System.out.println("2.    Hiển thị thống kê");
            System.out.println("3.    Thoát");
            System.out.println("Lựa chọn của bạn: ");
            int choice = validInt();
            switch (choice) {
                case 1:
                    System.out.println("--- Nhập điểm học viên (nhập -1 để dừng) ---");
                    while (true) {
                        System.out.println("Nhập điểm: ");
                        Double score = validDouble();
                        if (score == -1) {
                            break;
                        } else if (score >= 0 && score <= 10) {
                            System.out.println("Học lực: " + rank(score));
                            cntStudent++;
                            sum += score;
                            if (score > max) {
                                max = score;
                            }
                            if (score < min) {
                                min = score;
                            }

                            continue;
                        } else System.err.println("Điểm không hợp lệ nhập lại");

                    }
                    break;
                case 2:
                    double avg = sum / cntStudent;
                    if (cntStudent == 0) {
                        System.out.println("Chưa có dữ liệu");
                        break;
                    } else

                        System.out.println("--- KẾT QUẢ ---");
                    System.out.printf("Số học viên đã nhập: %d%n", cntStudent);
                    System.out.printf("Điểm trung bình: %.2f%n", avg);
                    System.out.printf("Điểm cao nhất: %.2f%n", max);
                    System.out.printf("Điểm thấp nhất: %.2f%n", min);
                     break;
                case 3:
                    System.exit(0);
            }

        } while (true);

    }

    public static int validInt() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int input = Integer.parseInt(sc.nextLine());
                return input;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static double validDouble() {
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

    public static String rank(Double score) {
        String rank = "";
        if (score >= 0 && score < 5) {
            rank = "Yếu";

        } else if (score >= 5 && score <= 7) {
            rank = "Trung bình";

        } else if (score >= 7 && score < 8) {
            rank = "Khá";
        } else if (score >= 8 && score < 9) {
            rank = "Giỏi";
        } else if (score >= 9 && score <= 10) {
            rank = "Xuất sắc";
        }
        return rank;
    }
}


