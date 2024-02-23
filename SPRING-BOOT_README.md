# Spring Boot là gì ?
- https://viblo.asia/p/hoc-spring-boot-bat-dau-tu-dau-6J3ZgN7WKmB
# Các anotation cần nắm trong spring
- @Autowire: Tự động nhúng các bean được Spring Container sinh ra vào các class được khai báo @Autowire
- @Configuration: Được sử dụng để chỉ ra rằng, Class khai báo sử dụng @Configuration sẽ khai báo một hoặc nhiều @Bean method trong class đó.
- @Bean: Đánh dấu trên method thông báo cho Spring, method đó sẽ sinh ra một bean và được quản lí bởi Spring Container. Thường nằm trong @Configuration và @Component...
- @ComponentScan: Sử dụng annotation này để thông báo cho spring container rằng: “ Phải biết vào các package nào trong dự án để quét các Annotation và tạo Bean.” ví dụ package common và package project.
- @Component: Khi một class sử dụng annotation này: “Thì sẽ được tạo thành 1 Bean, và tiêm vào các lớp nào cần dùng tới nó”.
![spring-boot_component](https://github.com/phuccoderr/StudentApi/assets/124669538/615c9cfb-7f15-4b9a-923b-06611b33fa82)
- @Service: Đây là annotation đặc biệt của @Component. Được dùng để sử lý nghiệp vụ, logic.
- @Repository: Jpa sẽ cung cấp cho các hàm select, update,... cơ bản. Có thể áp dụng thêm Query Creation.
- @PropertySource & @Value:
  - Chúng ta sử dụng @PropertySource để cho Spring biết tìm các file properties cấu hình cho hệ thống ở đâu.
  Đồng thời sử dụng
  - @Value để lấy giá trị trong file properties.
- @Valid: Dùng để kiểm tra dữ liệu có đúng như mình mong muốn hay không.
- @ReponseBody: Thông báo cho người dùng biết rằng APIở controller, sẽ trả về một đối tượng Object kiểu Json cho client chứ không render ra một trang view.
# So sánh spring MVC,BOOT,Framework
- https://viblo.asia/p/java-overview-phan-1-spring-vs-spring-boot-vs-spring-mvc-3P0lPDpblox
