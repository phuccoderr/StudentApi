# Spring Boot là gì ?
- https://viblo.asia/p/hoc-spring-boot-bat-dau-tu-dau-6J3ZgN7WKmB
# Spring IoC 
- Trong Spring, Spring Container (IoC Container) sẽ tạo các đối tượng, lắp rắp chúng lại với nhau, cấu hình các đối tượng và quản lý vòng đời của chúng từ lúc tạo ra cho đến lúc bị hủy.
- Spring container sử dụng DI để quản lý các thành phần, đối tượng để tạo nên 1 ứng dụng. Các thành phần, đối tượng này gọi là Spring Bean
![spring-IOC](https://github.com/phuccoderr/StudentApi/assets/124669538/664a34fa-3e58-4e99-b92c-0c65d8b81d50)
# Các anotation cần nắm trong spring
- ***@Autowire***: Tự động nhúng các bean được Spring Container sinh ra vào các class được khai báo @Autowire
- ***@Configuration***: Được sử dụng để chỉ ra rằng, Class khai báo sử dụng @Configuration sẽ khai báo một hoặc nhiều @Bean method trong class đó.
- ***@Bean***: Đánh dấu trên method thông báo cho Spring, method đó sẽ sinh ra một bean và được quản lí bởi Spring Container. Thường nằm trong @Configuration và @Component...
~~~
Định nghĩa bean đơn giản thường bao gồm các bước sau:
Định nghĩa bean trong một class: Bean thường được định nghĩa thông qua các class trong ứng dụng Spring. Có thể là thông qua việc đánh dấu class đó bằng @Component, @Service, @Repository, hoặc bất kỳ các annotation nào khác mà Spring hỗ trợ.
Quản lý bởi Spring IoC Container: Khi ứng dụng được khởi động, Spring IoC Container sẽ tìm kiếm và tạo các bean dựa trên cấu hình và các định nghĩa bean đã được cung cấp. Spring sẽ quản lý vòng đời của các bean này, tức là tạo, cấu hình, và sau đó loại bỏ chúng khi không cần thiết.
Injection: Bean có thể được "inject" vào các class khác bằng cách sử dụng dependency injection. Điều này có nghĩa là bạn có thể sử dụng các bean trong các class khác mà không cần tạo chúng hoặc quản lý vòng đời của chúng một cách rõ ràng.
~~~
- ***@ComponentScan***: Sử dụng annotation này để thông báo cho spring container rằng: “ Phải biết vào các package nào trong dự án để quét các Annotation và tạo Bean.” ví dụ package common và package project.
- ***@Component***: Khi một class sử dụng annotation này: “Thì sẽ được tạo thành 1 Bean, và tiêm vào các lớp nào cần dùng tới nó”.
![spring-boot_component](https://github.com/phuccoderr/StudentApi/assets/124669538/615c9cfb-7f15-4b9a-923b-06611b33fa82)
- ***@Service***: Đây là annotation đặc biệt của @Component. Được dùng để sử lý nghiệp vụ, logic.
- ***@Repository***: Jpa sẽ cung cấp cho các hàm select, update,... cơ bản. Có thể áp dụng thêm Query Creation.
- ***@PropertySource & @Value***:
  - Chúng ta sử dụng @PropertySource để cho Spring biết tìm các file properties cấu hình cho hệ thống ở đâu.
  Đồng thời sử dụng
  - @Value để lấy giá trị trong file properties.
- ***@Valid***: Dùng để kiểm tra dữ liệu có đúng như mình mong muốn hay không.
- ***@ReponseBody***: Thông báo cho người dùng biết rằng APIở controller, sẽ trả về một đối tượng Object kiểu Json cho client chứ không render ra một trang view.
# Khái niệm Spring MVC,BOOT,Framework
- https://viblo.asia/p/java-overview-phan-1-spring-vs-spring-boot-vs-spring-mvc-3P0lPDpblox
