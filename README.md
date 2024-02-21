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
- 
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
# Java Inheritance
