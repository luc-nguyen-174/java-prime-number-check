import java.util.Scanner;

class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        int numbers;
        int status = 1;
        int n = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào numbers số nguyên tố đầu tiên:");
        numbers = scanner.nextInt();
        if (numbers >= 1) {
            System.out.println(numbers + " Số nguyên tố đầu tiên là:");
            System.out.println(2);
        }
        for (int i = 2; i <= numbers; ) {
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(n);
                i++;
            }
            status = 1;
            n++;
        }
    }
}