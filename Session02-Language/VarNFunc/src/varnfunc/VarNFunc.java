package varnfunc;

import java.util.Scanner;

public class VarNFunc {

    public static void main(String[] args) {
        //playWithVariables();
        //playWithIntegers();
        //playWithDoubles();
        //playWithCharacters();
        //playWithBooleans();
        //printIntegerList();
        //printIntegerList(1000); // hard-code, code cứng giá trị.
        //inputFromKeyboard();
        
        int x = getAnInteger();
        System.out.println("x from keyboard: " + x);
        
        // In từ 1 -> x
        printIntegerList(x); // pass by value, truyền tham trị, lấy value có trong x thảy xuống hàm gốc ở dưới.
        
        testMathFunctions();
    }
    
    // static chỉ chơi với static
    public static void playWithVariables() {
        // Biến là một vùng RAM được đặt tên/định danh/identifier chiếm 1 số byte nhất định tùy hình thái dữ liệu mà nó sẽ chứa,
        // dùng để chứa 1 value nào đó.
        // Biến là cách đặt tên cho 1 đại lượng, 1 giá trị.
        // Hình thái dữ liệu được gọi là data type, có 2 hình thái: primitive, object.
        
        int yob = 2003;
        int a = 79, b;
        b = 39;
        
        System.out.println("yob: " + yob);
        
        int age = 2025 - yob;
        System.out.println("age: " + age + " years old");
        System.out.println("age: " + (2025 - yob) + " years old");      
        System.out.printf("age: %d\n", age);
    }
    
    // Mọi giá trị/value xuất hiện trong code (số nào đó, chữ nào đó, chuỗi nào đó, 3.14 xuất hiện trong code, 0.1 xuất hiện trong code, "age" xuất hiện trong code)
    // được gọi là literal value.
    // Mọi literal value của số nguyên xuất hiện trong code/mọi số nguyên xuất hiện trong code được xem là 4 byte int
    public static void playWithIntegers() {
        int n = 2_100_000_000;
        System.out.println("n: " + n);
        
        long money = 15_000_000_000L;
        System.out.println("money: " + money);
        
        int status = 0xFA; // hex
        int phone = 070; // oct
        
        System.out.println("status: " + status);
        System.out.println("phone: " + phone);
    }
    
    // Mặc định Java ưu tiên chơi với double hơn là chơi với float.
    // Mọi số thực trong code được xem là double.
    public static void playWithDoubles() {
        double pi = 3.14; // 8 bytes
        System.out.println("pi: " + pi);
        System.out.printf("pi: %.2f\n", pi); // Java không hỗ trợ %lf, xài chung %f
    
        float vat = 0.1F;
        System.out.printf("vat: %.2f\n", vat);
    }
    
    // char trong Java xài 2 bytes, xài '' kí hiệu 1 kí tự đơn
    public static void playWithCharacters() {
        char unit = '$';
        System.out.println("unit: " + unit);
        
        // Lưu tên, lưu 1 câu văn, đoạn văn, chuỗi, tức là gồm nhiều kí tự ghép lại,
        // trong C Programming: char name[] = "Loc Ngo-Huynh-Tan";
        // xử lí trên chuỗi là phải xài hàm, tên mảng không phải là primitive.
        
        // Java cung cấp 1 kiểu data type hoàn toàn mới, dùng để lưu trữ chuỗi,
        // String (S viết hoa), dùng để lưu trữ, tên gọi cho những thứ phức tạp,
        // một đống các kí tự ở với nhau, kiểu object.
        String name = "Loc Ngo-Huynh-Tan";
        System.out.println("name: " + name);
        
        System.out.println("1st letter in my name: " + name.charAt(0));
        System.out.println("my name as in a lowercase: " + name.toLowerCase());
    }
    
    // Một biểu thức so sánh, một mệnh đề, câu phát biểu sẽ rơi vào 2 trạng thái: đúng - sai.
    // C Programming: đúng thì quy ước là 1 (> 0), sai quy ước là 0 => int.
    // Java Programming: đúng là true, sai là false => boolean.
    public static void playWithBooleans() {
        boolean marriedStatus = false;
        if (marriedStatus == true) {
            System.out.println("Đánh đồn có dịch mới vui.");
        } else {
            System.out.println("Vườn hồng có lối nhưng chưa ai vào.");
            System.out.println("Luôn có hy vọng.");
        }

    }
    
    // In ra các số nguyên từ 1 -> 100
    public static void printIntegerList() {
        System.out.println("The list of 100 first integers: ");
        System.out.println("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23...");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    // CÁC LOẠI HÀM KHÁC
    // In các số tự nhiên từ 1 -> n
    // HIỆN TƯỢNG TRONG 1 CLASS BẤT KÌ MÀ CÓ 2 HÀM TRÙNG TÊN NHAU NHƯNG KHÁC PHẦN THAM SỐ ĐẦU VÀO,
    // KHÁC TRÊN DATA TYPE, KHÔNG QUAN TÂM TÊN BIẾN, HIỆN TƯỢNG NÀY ĐƯỢC GỌI LÀ OVERLOAD/OVERLOADING,
    // QUÁ TẢI HÀM - 1 đám giống nhau ở cùng 1 chỗ - quá tải.
    public static void printIntegerList(int n) {
        System.out.println("The list of " + n + " first integers: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    public static void inputFromKeyboard() {
        int yob; // C Programming gán rác - on-off hiện nay của RAM.
        
        Scanner banPhimCuaTui = new Scanner(System.in);
        System.out.print("Please input your year of birth: ");
        yob = banPhimCuaTui.nextInt();
        
        System.out.println("yob: " + yob);
    }
    
    public static int getAnInteger() {
        int n;
        
        Scanner banPhimCuaTui = new Scanner(System.in);
        System.out.print("Please input a positive integer: ");
        n = banPhimCuaTui.nextInt();
        
        return n;
    }
    
    public static void testMathFunctions() {
        double result = Math.sqrt(100);
        System.out.println("result: " + result);
        System.out.println(Math.sqrt(121));
    }
    
}
