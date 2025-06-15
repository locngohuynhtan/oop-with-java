package varnfunc;

import java.util.Scanner; // ~ #include <stdio.h>

public class VarNFunc {

    public static void main(String[] args) {
        //playWithVariables();
        //playWithIntegers();
        //playWithDoubles();
        //playWithCharacters();
        //playWithBooleans();
        //printIntegerList();
        //printIntegerList(200); // hard-code, code cứng giá trị.
        //inputFromKeyboard();
        
        int x = getAnInteger();
        System.out.println("x from keyboard: " + x);
        //printIntegerList(x); // pass by value, truyền tham trị, lấy value có trong x thảy vào hàm gốc.
        
        if (isPrime(x)) 
            System.out.println(x + " is prime.");
        else 
            System.out.println(x + " is not prime.");
        
        //printPrimeList();
        printPrimeList(x);
        
    }
    
    // static chỉ chơi với static
    public static void playWithVariables() {
        // Biến là 1 vùng RAM được đặt tên/định danh/identifier, chiếm 1 số byte nhất định
        // tùy hình thái dữ liệu mà nó sẽ chứa, dùng để chứa 1 value nào đó.
        // Hình thái dữ liệu được gọi là data type, bao gồm 2 hình thái: primitive, object.
        // Biến là cách đặt tên cho 1 đại lượng, 1 giá trị.
        int yob = 2003;
        int a = 79, b;
        b = 39;
        
        System.out.println("yob: " + yob);
        
        int age = 2025 - yob;
        System.out.println("age: " + age + " years old");
        System.out.println("age: " + (2025 - yob) + " years old");
        System.out.printf("age: %d years old\n", age);
    }
    
    // Mọi giá trị/value xuất hiện trong code (số nào đó, chuỗi nào đó, 3.14 xuất hiện trong code, "age" xuất hiện trong code...)
    // được gọi là literal value.
    // Mọi literal value của số nguyên trong code/mọi số nguyên xuất hiện trong code được xem là 4 byte int.
    public static void playWithIntegers() {
        int n = 2_100_000_000;
        System.out.println("n: " + n);
        
        long money = 5_000_000_000L;
        System.out.println("money: " + money);
        
        int status = 0xFA; // Hệ Hexadecimal
        int phone = 070; // Hệ Octal
        
        System.out.println("status: " + status);
        System.out.println("phone: " + phone);
    }
    
    // Mặc định Java ưu tiên chơi với double hơn là chơi với float.
    // Mọi số thực trong code được xem là double.
    public static void playWithDoubles() {
        double pi = 3.14; // 8 bytes
        System.out.println("pi: " + pi);
        System.out.printf("pi: %.2f\n", pi); // Java không hỗ trợ %lf, xài chung %f cho cả double và float.
        
        float vat = 0.1F;
        System.out.println("vat: " + vat);
        System.out.printf("vat: %.2f\n", vat);
    }
    
    // Trong Java, char xài 2 bytes, xài '' kí hiệu 1 kí tự đơn.
    public static void playWithCharacters() {
        char unit = '$';
        System.out.println("unit: " + unit);
        
        // Lưu tên, lưu 1 câu văn, đoạn văn, chuỗi, gồm nhiều kí tự ghép lại,
        // Java cung cấp một kiểu data type hoàn toàn mới, dùng để lưu trữ chuỗi,
        // String - dùng để lưu trữ, tên gọi cho những thứ phức tạp, đống các kí tự ở với nhau, kiểu object.
        String name = "Ngô Huỳnh Tấn Lộc";
        System.out.println("name: " + name);       
        System.out.println("1st letter in my name: " + name.charAt(0));
        System.out.println("My name as in a lowercase: " + name.toLowerCase());
    }
    
    // Một biểu thức so sánh, một mệnh đề, câu phát biểu sẽ rơi vào 2 trạng thái: đúng - sai.
    // C programming: đúng quy ước là 1, sai quy ước là 0 => int.
    // Java: đúng là true, sai là false => boolean (1 bit, 1 byte).
    public static void playWithBooleans() {
        boolean marriedStatus = false;
        if (marriedStatus == true)
            System.out.println("Đánh đồn có địch mới vui.");
        else {
            System.out.println("Vườn hồng có lối nhưng chưa ai vào.");
            System.out.println("Luôn có hy vọng.");
        }    
    }
    
    // In ra các số nguyên từ 1...100
    public static void printIntegerList() {
        System.out.println("The list of 100 first integers: ");
        System.out.println("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20...");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    // In các số tự nhiên từ 1...n
    // Hiện tượng trong 1 class bất kì mà có 2 hàm trùng tên nhau
    // nhưng khác phần tham số đầu vào, khác trên data type, không quan tâm tên biến,
    // hiện tượng này được gọi là OVERLOAD/OVERLOADING - QUÁ TẢI HÀM
    public static void printIntegerList(int n) {
        System.out.println("The list of " + n + " first integers:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    public static void inputFromKeyboard() {
        int yob; //C programming gán rác, on-off hiện nay của RAM.
        
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
    
    // Kiểm tra 1 số có phải số nguyên tố hay không?
    public static boolean isPrime(int n) {
        if (n <= 1) 
            return false;
        else 
            for (int i = 2; i <= Math.sqrt(n); i++) 
                if (n % i == 0)
                    return false;
            
        return true;
    }
    
    // In các số nguyên tố từ 1...1000 - reuse hàm isPrime(int n)
    public static void printPrimeList() {
        System.out.println("The list of prime numbers from 1 to 1000:");
        for (int i = 0; i <= 1000; i++) {
            if(isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    // In các số nguyên tố từ 1...n
    public static void printPrimeList(int n) {
        System.out.println("The list of prime numbers from 1 to " + n + ":");
        for (int i = 0; i <= n; i++) {
            if(isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println("");
    }
    
}
