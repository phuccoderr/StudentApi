# HTTP Status Code
- ***Information responses / Phản hồi thông tin***:
  - ***100 Continue***: Phản hồi tạm thời này cho biết rằng mọi thứ tới hiện tại vẫn ổn và phía client nên tiếp tục yêu cầu hay bỏ qua phản hồi nếu yêu cầu đã hoàn tất.
  - ***101 Switching Protocol***: Code này được gửi để phản hồi header yêu cầu Upgrade từ phía client và cho biết giao thức máy chủ đang chuyển sang.
  - ***102 Processing (WebDAV)***: Code này cho biết rằng máy chủ đã nhận và đang xử lý yêu cầu, nhưng phản hồi vẫn chưa có hiệu lực.
  - ***103 Early Hints***: Được sử dụng để trả về một số tiêu đề phản hồi trước message HTTP cuối cùng.
- ***Successful responses / Phản hồi thành công***:
  - 200 OK: Yêu cầu đã thành công. Ý nghĩa của thành công còn phụ thuộc vào phương thức HTTP là gì:
  ~~~
  GET: Tài nguyên đã được tìm nạp và được truyền trong nội dung thông điệp.
  HEAD: Các header thực thể nằm trong nội dung thông điệp.
  PUT hoặc POST: Tài nguyên mô tả kết quả của hành động được truyền trong nội dung thông điệp.
  TRACE: Nội dung thông điệp chứa thông báo yêu cầu khi máy chủ nhận được.
  ~~~
  - ***201 Created***: Yêu cầu đã thành công và kết quả là một tài nguyên mới đã được tạo. Đây thường là phản hồi được gửi sau các yêu cầu POST hoặc một số yêu cầu PUT.
  - ***202 Accepted***: Yêu cầu đã được nhận nhưng chưa được thực hiện. Yêu cầu này là non-committal, vì không có cách nào trong HTTP để gửi sau đó một phản hồi không đồng bộ cho biết kết quả của yêu cầu. Nó dành cho các trường hợp trong đó 1 quá trình / máy chủ khác xử lý yêu cầu hoặc để xử lý hàng loạt.
  - ***203 Non-Authoritative Information***: Code phản hồi này có nghĩa là siêu thông tin được trả về không hoàn toàn giống với thông tin có sẵn từ máy chủ gốc, nhưng được thu thập từ phần copy local hay của bên phía thứ   3. Code này chủ yếu được sử dụng để phản chiếu hoặc sao lưu tài nguyên khác. Ngoại trừ trường hợp cụ thể đó, thông thường phản hồi “200 OK” được ưu tiên cho trạng thái này.
  - ***204 No Content***: Không có nội dung để gửi cho yêu cầu này, nhưng các header có thể hữu dụng. User-agent có thể cập nhật các header đã lưu trong bộ nhớ cache cho tài nguyên này bằng các header mới.
  - ***205 Reset Content***: Cho user-agent biết để reset document đã gửi yêu cầu này.
  - ***206 Partial Content***: Code phản hồi này được dùng khi Range header được gửi từ client để yêu cầu chỉ 1 phần của nguồn tài nguyên.
  - ***207 Multi-Status (WebDAV)***: Truyền tải thông tin về nhiều nguồn tài nguyên, đối với các trường hợp mà nhiều status code có thể đều thích hợp.
  - ***208 Already Reported (WebDAV)***: Được sử dụng trong 1 phần tử phản hồi <dav:propstat> để tránh liệt kê nhiều lần các thành viên nội tại của nhiều liên kết vào cùng 1 tập hợp.
  - ***226 IM Used (HTTP Delta encoding)***: Máy chủ đã hoàn thành yêu cầu GET cho nguồn tài nguyên và phản hồi là sự trình bày kết quả của 1 hoặc nhiều thao tác instance được áp dụng cho instance hiện tại.
- ***Redirects / Điều hướng***:
  - ***300 Multiple Choice***: Yêu cầu có thể có nhiều hơn 1 phản hồi khả dụng. User-agent hay user nên chọn 1 trong số đó.
  - ***301 Moved Permanently***: URL của tài nguyên được yêu cầu đã được thay đổi vĩnh viễn. URL mới được đưa ra trong phần phản hồi.
  - ***302 Found***: Code phản hồi này có nghĩa là URI của tài nguyên được yêu cầu đã được thay đổi tạm thời. Những thay đổi khác trong URI có thể được thực hiện trong tương lai.
  - ***303 See Other***: Máy chủ gửi phản hồi này để điều hướng client lấy nguồn tài nguyên tại 1 URI khác với 1 yêu cầu GET.
  - ***304 Not Modified***: Code này được sử dụng cho mục đích caching. Nó cho client biết rằng phản hồi chưa được điều chỉnh, nên client có thể tiếp tục sử dụng cùng phiên bản phản hồi trong bộ nhớ cache.
  - ***305 Use Proxy***: Được xác định trong phiên bản trước của HTTP specification để chỉ ra rằng phản hồi được yêu cầu phải được truy cập bằng proxy. Nó được yêu cầu do quan ngại về phần bảo mật liên quan đến      cấu hình trong băng tần của proxy.
  - ***306 unused***: Mã phản hồi này không còn được sử dụng nữa, nó được bảo lưu và chỉ được sử dụng trong phiên bản trước của HTTP/1.1 specification.
  - ***307 Temporary Redirect***: Máy chủ gửi phản hồi này để điều hướng client tới lấy tài nguyên được yêu cầu tại 1 URI khác với cùng 1 phương thức đã được sử dụng trong yêu cầu trước đó, cùng ý nghĩa như code     phản hồi HTTP 302 Found ( ngoại trừ việc user-agent không được thay đổi phương thức HTTP sử dụng )
  - ***308 Permanent Redirect***: Điều này có nghĩa là tài nguyên hiện được đặt cố định tại 1 URI khác, được chỉ định bởi header Location: HTTP Response, cùng ý nghĩa như code phản hồi HTTP 301 Moved Permanently    ( ngoại trừ việc user-agent không được thay đổi phương thức HTTP sử dụng )
- ***Client errors / Lỗi phía client***:
  - ***400 Bad Request***: Máy chủ không thể hiểu yêu cầu do cú pháp không hợp lệ.
  - ***401 Unauthorized***: Cho dù quy chuẩn HTTP chỉ định “unauthorized” (không có thẩm quyền), nhưng nó có nghĩa phản hồi này là “unauthenticated” (chưa được xác thực). Có nghĩa là, client phải các tự xác thực    chính mình để nhận được phản hồi đã yêu cầu.
  - ***402 Payment Required***: Code phản hồi này được dành cho những lần sử dụng trong tương lai. Mục đích ban đầu của việc tạo mã này là sử dụng nó cho các hệ thống thanh toán kỹ thuật số, tuy nhiên status code này rất hiếm khi được sử dụng và không tồn tại quy ước tiêu chuẩn nào.
  - ***403 Forbidden***: Client không có quyền truy cập vào phần nội dung, nghĩa là nó không được phép, vì vậy máy chủ từ chối cung cấp tài nguyên được yêu cầu. Không giống như 401, danh tính của client đã được     máy chủ nhận biết.
  - ***404 Not Found***:
  - ***405 Method Not Allowed***: Phương thức yêu cầu được máy chủ nhận biết nhưng đã bị vô hiệu hóa và không thể sử dụng được.
  - ***406 Not Acceptable***: Phản hồi này được gửi khi máy chủ web, sau khi thực hiện server-driven content negotiation, không tìm thấy bất kỳ nội dung nào phù hợp với các tiêu chí do user-agent đưa ra.
  - ***407 Proxy Authentication Required***: Code này tương tự như 401 nhưng việc xác thực là cần thiết để được thực hiện bởi proxy.
  - ***408 Request Timeout***: một đoạn mã HTTP chỉ ra rằng máy chủ đã không nhận được yêu cầu hoàn thành từ khách hàng trong thời gian quy định của máy chủ.
  - ***409 Conflict***: Phản hồi này được gửi khi 1 yêu cầu xung đột với trạng thái hiện tại của máy chủ.
  - ***410 Gone***: Phản hồi này được gửi khi nội dung được yêu cầu đã bị xóa vĩnh viễn khỏi máy chủ, không có địa chỉ chuyển tiếp.
  - ***411 Length Required***: Máy chủ đã từ chối yêu cầu vì trường header Content-Lenghth không được xác định và máy chủ thì yêu cầu chuyện đó.
  - ***412 Precondition Failed***: Client đã chỉ ra các điều kiện tiên quyết trong các header của nó mà máy chủ không đáp ứng được.
  - ***413 Payload Too Large***: Thực thể yêu cầu lớn hơn giới hạn do máy chủ xác định, máy chủ có thể đóng kết nối hoặc trả về trường header Retry-After.
  - ***414 URI Too Long***: URI được yêu cầu bởi client dài hơn mức máy chủ muốn thông dịch.
  - ***415 Unsupported Media Type***: Định dạng phương tiện của dữ liệu được yêu cầu không được máy chủ hỗ trợ, do đó máy chủ đang từ chối yêu cầu.
  - ***416 Range Not Satisfiable***: Client yêu cầu một phần của tập tin nhưng máy chủ không thể cung cấp nó. Trước đây được gọi là “Requested Range Not Satisfiable”.
  - ***417 Expectation Failed***: Máy chủ không thể đáp ứng các yêu cầu của trường Expect trong header.
- ***Server errors / Lỗi phía máy chủ***:
  - ***500 Internal Server Error***: Một thông báo chung, được đưa ra khi máy chủ gặp phải một trường hợp bất ngờ, message cụ thể không phù hợp.
  - ***501 Not Implemented***: Máy chủ không công nhận các phương thức yêu cầu hoặc không có khả năng xử lý nó.
  - ***502 Bad Gateway***: Máy chủ đã hoạt động như một gateway hoặc proxy và nhận được một phản hồi không hợp lệ từ máy chủ nguồn.
  - ***503 Service Unavailable***: Máy chủ hiện tại không có sẵn (hiện đang quá tải hoặc bị down để bảo trì). Đây chỉ là trạng thái tạm thời.
  - ***504 Gateway Timeout***: Máy chủ đã hoạt động như một gateway hoặc proxy và không nhận được một phản hồi từ máy chủ nguồn.
  - ***505 HTTP Version Not Supported***: Máy chủ không hỗ trợ phiên bản “giao thức HTTP”.
