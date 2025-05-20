package varnfunc;

public class VarNFunc {

    public static void main(String[] args) {
        //playWithVariables();
        //playWithIntegers();
        //playWithDoubles();
        playWithCharacters();
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
    
}
