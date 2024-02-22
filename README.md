# Java
- Java là một trong những ngôn ngữ lập trình hướng đối tượng, dựa trên lớp được thiết kế để có càng ít phụ thuộc thực thi càng tốt.
# Variables
- Tên biến nói không với:
  - Từ khóa (  true, false,null... )
  - Không thể bắt đầu bởi một số
  - không được sử dụng khoảng trắng
  - Phân biệt chữ hoa chữ thường
# Java Data Types 
- Trong Java có 2 kiểu dữ liệu có sẵn: Primitive (kiểu dữ liệu gốc) và Non-primitive (kiểu dữ liệu đối tượng)
- Primitive:
  - Boolean
  - Char
  - Byte
  - Short
  - Int
  - Long
  - Float
  - Double
- Non-primitive:
  - String
  - Array...
# Java Operators
https://www.w3schools.com/java/java_operators.asp
# Java If...Else
# Loop
# Array
# Java Switch
- Thuộc dạng câu lệnh rẽ nhánh, switch sẽ kiểm tra so sánh biến với những giá trị khác nhau
# OOP
- Class và Object ( mèo và nhiều loại mèo )
- Class Attributes ( thuộc tính của Class )
- Class Method ( phương thức của class )
- Định nghĩa hàm tạo ( constructor )
- Access Modifier ( private/public/protected )
- Java Inheritance ( kế thừa )
- Super Class ( gọi method class cha )
- Abstract Class ( khai báo abstract class cha và tạo method abstract rỗng, khi đó class nào kế thừa phải override lại method abstract từ class cha )
- Polymorphism ( Tính đa hình )
# Java Autoboxing/Unboxing (Object wrapper class)
- Do OOP ít làm việc Primitive (kiểu dữ liệu nguyên thuỷ ) nên chúng ta phải convert "primitive type" -> "non-primitive type"
- Ví dụ: boolean -> Boolean, long -> Long, char -> Character... ( Gọi là Autoboxing, còn Unboxing là ngược lại )
# ArrayList
- Array thuần tuý tồn tại các nhược điểm như không thể thêm sửa xoá phần tử, số lượng phần tử cố định, lãng phí bộ nhớ nếu không dùng hết
- ArrayList ra đời khắc phục các điểm trên
~~~
ArrayList a = new ArrayList();
~~~
# Java Generics (Basic)
~~~
ArrayList<String> a = new ArrayList<String>(); ( <type> chỉ định kiểu dữ liệu rõ ràng )
~~~
# Interface
- keyword implements thay vì extends và class sử dụng interface bắt buộc phải ghi đè các method có trong interface
# Interface trong java 8
- Tăng tính mềm dẽo cho Interface, khi thêm default vào method thì không cần phải ghi đè mà vẫn có thể sử dụng được
~~~
public interface father {
  default void speak() {
    system.out.println("Hello");
  }
}
public class child implements father() {
  
}
~~~
# Java package 
- package === folder => nơi chứa code
- package: được tạo nên bởi tập hợp ( class / interface )
- package: có thể chứa sub-package ( cha/con )
- cú pháp: import package_name.class_name
# Try...catch
- Chương trình khi được chạy gồm 2 bước:
  - compile ( từ code java -> byte code ). nếu có lỗi, thì chương trình báo ngay ( ko đề cập tới lỗi này )
  - run ( từ byte code -> JVM rum ). nếu có lỗi chương trình ngỏm lun.
  - => Ngoại lệ là các lỗi xảy ra khi run chương trình và khiến chương trình chúng ta stop
- Keyword finally:
  - Finally: dù có ngoại lệ hay không thì hàm finally luôn được chạy. ( cho dù có return, continue or break đi nữa )
- Throws:
  - viết function/class tổng quát (re-use), không nên dùng try catch
  ~~~
  public class phuc throws IOException() { }
  ~~~
- Throw:
  - ném lỗi trực tiếp bên trong hàm
  ~~~
  public class phuc() {
    if (age <18 ) {
      throw new IOException("message");
    }
    return age;
  }
  ~~~ 
