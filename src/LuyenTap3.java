import java.util.Scanner;

public class LuyenTap3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cntEmploy = 0;
        float sum = 0;
        float bonus = 0;
        float sumBonus = 0;
        String rank ="";
        float max = Float.MIN_VALUE;
        float min = Float.MAX_VALUE;
        do {
            //hiện menu
            System.out.println("=======MENU=======");
            System.out.println("1. Nhập lương nhân viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Tính tổng tiền thưởng nhân viên");
            System.out.println("4.Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    while (true) {
                        //cn1 - nhập lương
                        System.out.print("nhập lương :");
                        float salary = Float.parseFloat(sc.nextLine());
                        // -1 kết thúc
                        if(salary == -1) {
                            break;
                        }
                        if(salary < 0 || salary > 5*Math.pow(10,8) ) {
                            System.err.println("Lương không hợp lệ. Nhập lại");
                            continue;
                        }
                        // lương từ 0 - 500 triệu

                        if (salary < 5*Math.pow(10,6)) {
                            rank = "thấp";

                        }else  if (salary >= 5*Math.pow(10,6) && salary < 15*Math.pow(10,6)) {
                            rank =" trung bình";

                        }else   if (salary >= 15*Math.pow(10,6) && salary < 50*Math.pow(10,6)) {
                            rank = "khá";
                        }
                        else if (salary >= 50*Math.pow(10,6)) {
                            rank = "cao";
                        }
                        if (salary < 5*Math.pow(10,6)) {
                            bonus = salary*5/100;
                            sumBonus += bonus;

                        }else  if (salary >= 5*Math.pow(10,6) && salary < 15*Math.pow(10,6)) {
                            bonus = salary*10/100;
                            sumBonus += bonus;

                        }else   if (salary >= 15*Math.pow(10,6) && salary < 50*Math.pow(10,6)) {
                            bonus = salary*20/100;
                            sumBonus += bonus;
                        }
                        else if (salary >= 50*Math.pow(10,6)) {
                            bonus = salary*25/100;
                            sumBonus += bonus;
                        }
                        System.out.printf("Phân loại %s\n", rank);
                        //tổng nhân viên
                        cntEmploy++;
                        //tổng lương
                        sum += salary;
                        // max lương
                        if(max < salary) {
                            max = salary;
                        }
                        // min lương
                        if(min > salary) {
                            min = salary;
                        }
                    }
                    System.out.println("Tổng nhân viên " + cntEmploy);
                    System.out.println("Tổng lương "+ sum);
                    System.out.println("Lương cao nhất "+max);
                    System.out.println("Lương thấp nhất"+min);

                    break;
                case 2:
                    //cn2 Thống kê
                    // số nhân viên đã nhập
                    System.out.println("Số nhân viên đã nhập : " +cntEmploy);
                    // tổng lương
                    System.out.println("Tổng lương "+ sum);
                    // max lương
                    System.out.println("Lương cao nhất "+max);
                    // min lương
                    System.out.println("Lương thấp nhất"+min);
                    // lương trung bình
                    System.out.println("Lương trung bình "+ sum/cntEmploy);
                    break;
                case 3:
                    //cn3 Tổng tiền thưởng
                    System.out.println("Tổng tiền thưởng nhân viên :" + sumBonus);
                    break;
                case 4:
                    //cn4 thoát
                    System.exit(0);
                    break;

            }





        } while (true);

    }




}