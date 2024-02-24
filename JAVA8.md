# Functional interface
- Functional interface là interface có duy nhất 1 abstract method, có thể không có hoặc có nhiều default/static method.
- Annotation không bắt buộc, tuy nhiên bạn nên có để tránh sai sót (ví dụ có nhiều hơn 1 abstract method chẳng hạn).
- Java method không dynamic được như js callback ( hàm truyền hàm ) từ đó functional interface được ra đời.
~~~
@FunctionalInterface
interface Calculable {
    double calculate();
}
// Có thể gọi được method trong khuôn mẫu
public void printResult(Calculable func) {
    System.out.println("Result: " + func.calculate());
}
// Method thực sự truyền vào, được wrap vô trong khuôn mẫu
printResult(new Calculable() {
    @Override
    public double calculate() {
        return 3.14;
    }
})
~~~
# Lambda expression
- là 1 dạng function nhưng viết code ít hơn so với function thông thường.
~~~
(parameters) -> {expression} 
~~~
|  (Method/ Function)  |  (Lambda expression) |
| --- | --- |
| Name: tên phương thức | No name: không có tên phương thức, nó là một phương thức ẩn danh (anonymous method). |
| Parameter list: danh sách các tham số. | Parameter list: danh sách các tham số. |
| Body: biểu thức, câu lệnh xử lý. | Body: biểu thức, câu lệnh xử lý. |
| return type: kiểu dữ liệu trả về. | No return type: không có kiểu trả về tường minh, trình biên dịch Java 8 có thể tự suy luận ra kiểu dữ liệu trả về dựa vào code thực thi. |

# Method reference
- Một method reference là cú pháp ngắn của lambda expression giúp thực thi một method.
- Được tạo ra để thay thể một lambda expression sử dụng một method.
~~~
Object :: methodName
( Lambda expression )
Consumer<String> c = s -> System.out.println(s);
( Method preference )
Consumer<String> c = System.out::println;
~~~
- ==> Anonymous Class Có thể sử dụng : Lambda Expression Nếu chỉ gọi một method trong lambda thì có thể sử dụng : Method reference
# Optional
- Đặc điẻm:
  - Không bắt buộc kiểm tra Null.
  - Tránh NullPointerException ở runtime.
  - Hỗ trợ phát triển các API một cách gọn gàng.
~~~
Optional<String> gender = Optional.of("MALE");
~~~
# Khái niệm Interface
- Java 8 chúng ta sẽ có thêm 2 khái niệm mới đối với interface là phương thức default (default methods) và phương thức static (static methods).
- Thiết kế interface luôn là một công việc rất khó khăn, bởi vì khi chúng ta thay đổi các phương thức bên trong interface nó đòi hỏi phải thay đổi tất cả các class được implements từ nó. Một khi số lượng các        class được implements từ interface phát triển nhiều lên thì đến mức độ nào đó interface có thể không mở rộng được nữa.
- Default: không bắt buộc phải implement phương thức default, giúp chúng ta mở rộng interface mà không phải lo ngại phá vỡ các class được implements từ nó.
- Static: không override phương thức của interface được implements
~~~
public interface DefaultInterface {
    default void firstMethod(String string);
}

public interface StaticInterface 
    static void secondMethod();
}

public class MyClass implements DefaultInterface,StaticInterface {
    @Override
    public void firstMethod() {
    }
    public void secondMethod() {
    }
}
~~~
# Stream API
- gồm những API xử lý tuần tự các element cho collection.
- A stream đại diện cho một collection được xử lý tuần tự và hỗ trợ rất nhiều loại operation để tính toán dựa trên những element của collection đó.
- Một stream operation có thể ở giữa hoặc ở cuối. Nếu nó là operation ở giữa, nó sẽ return một stream, nhờ vậy mà ta có thể thực hiện tính toán trên nhiều element ngay trong lúc này mà không cần bất cứ một dấu      chấm phẩy nào.
- Hầu hết các operation của stream đều có thể dùng lamba expression.
- có rất nhiều collection, bạn có thể lên đây để tìm hiểu thêm: https://viblo.asia/p/collections-streams-in-java-8-roavrEWjkRM
~~~
List<String> myList =
    Arrays.asList("a", "aa", "bb", "b", "c");

myList
    .stream()
    .filter(s -> s.startsWith("b"))
    .map(String::toUpperCase)
    .sorted()
    .forEach(System.out::println);
~~~
