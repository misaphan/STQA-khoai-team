# TÀI LIỆU KIỂM THỬ
##### Đối tượng kiểm thử:  
TA3SBT – App Sách mềm
##### Nhóm 42: 
* Ngô Quốc Thắng
* Phan Bá Mỹ 
* Phạm Văn Bộ 
* Hoàng Văn Quân

##I.Kế hoạch kiểm thử
###1.Giới thiệu về ứng dụng Sách mềm
Sách mềm (http://sachmem.saokhuee.com/) là một ứng dụng web hỗ trợ học tập. Ứng dụng cung cấp những quyển sách giáo khoa/sách bài tập/…ở dạng mềm, có thể sử dụng ngay trên máy tính thông qua trình duyệt web và có bổ sung/tích hợp nhiều tính năng và nội dung hơn so với sách cứng thông thường.Ứng dụng đang trong quá trình hoàn thiện, nên vẫn còn rất nhiều lỗi cần được phát hiện và xử lí.
###2.Kế hoạch chung
Đối tượng kiểm thử là quyển Tiếng Anh 3 Sách bài tập. Nhóm sẽ kiểm thử sách bằng cách thực hiện các bài tập của sách, sử dụng checklist kiểm tra tính dễ dùng của giao diện cũng như cảm nhận bằng kiến thức và kinh nghiệm bản thân để phát hiện ra các lỗi hoặc điểm cần cải tiến. Các lỗi này sẽ được báo cáo cho bên phát triển để họ cải tiến ứng dụng.
###3.Phân công
Yêu cầu là mỗi bài được test bởi ít nhất 2 người. Nhóm có 4 người, nên sẽ phân chia công việc như sau:
* Thắng, Mỹ: thực hiện unit 1 đến unit 10
* Quân, Bộ: thực hiện unit 11 đến unit 20


##II.Thiết kế kiểm thử
###1.Cơ sở để kiểm thử
* Kiến thức về kiểm thử phần mềm 
* Đặc biệt là kiểm thử hộp đen
* Cảm nhận cá nhân
* Quan điểm cá nhân về: thẩm mĩ, tính đúng đắn, tính hợp lí…
* Checklist về kiểm thử giao diện (tính dễ dùng) của ứng dụng
* Ví dụ 1 checklist:
<ul>
![image](https://cloud.githubusercontent.com/assets/15795478/11609449/7555ef22-9bb9-11e5-86db-334a141e9e30.png)
</ul>

##2.Tạo test case bằng cách nào?
* Nhập vào các câu trả lời đặc biệt 
* Sai kiểu, kích thước lớn, trống,…
* Kiểm tra tính đúng đắn/hợp lí của các tính năng
* Sử dụng checklist kiểm tra giao diện. Mỗi câu hỏi trong checklist là 1 test case.
* VD:
<ul>
    <li>Kiểm tra xem hyperlink có nổi bật lên không?– Có (Pass)</li>
    <li> Kiểm tra xem hyperlink có làm con trỏ chuột thay đổi khi rê tới không? – Không (Fail)</li>
</ul>

###3.Các tính năng, nội dung cần kiểm thử
* Mọi thứ liên quan đến quyển sách “Tiếng Anh 3 Sách bài tập”: giao diện bài học, sự đúng sai của bài học, thừa/thiếu chức năng, chức năng lỗi…

###4.Các tính năng, nội dung không cần kiểm thử
* Những chức năng chung bên ngoài như: quản lý sách, quản lý tài khoản, giao diện trang chủ,…

##III.Thực hiện kiểm thử
* Từng người đọc kĩ phần kế hoạch và thiết kế kiểm thử rồi thực hiện kiểm thử đối tượng “Tiếng Anh 3 Sách bài tập”. Quy trình thực hiện kiểm thử cụ thể như sau:
* Truy cập http://sachmem.saokhuee.com/ , đăng nhập bằng  tài khoản chung của nhóm, rồi chọn sách “Tiếng Anh 3 Sách bài tập.
* Chọn Unit để kiểm thử theo sự phân công ở phần I (Kế hoạch kiểm thử)
* Thực hiện các bài tập của sách, cố gắng tìm ra các vấn đề theo như đã hướng dẫn ở phần II (Thiết kế kiểm thử)
* Với mỗi vấn đề tìm được, vào [đây](https://github.com/truonganhhoang/kiemthu2015/issues) để tạo issue mô tả vấn đề, có dẫn link tới bài học liên quan.
* Vào [đây](https://docs.google.com/spreadsheets/d/1qlAxNqEk1Lz0XJ6bXetO4Lf8vEeSdHsPNsBu7NV1_Hc/edit?ts=565693be&pli=1#gid=1860469050&vpid=A1) để đánh giá mức độ nghiêm trọng của vấn đề tìm được. Điền 0 nếu không tìm thấy vấn đề nào; điền 1, 2, 3, 4 hoặc 5 ứng với mức độ nghiêm trọng tăng dần.

##IV.Kết quả kiểm thử
* Kết quả của kiểm thử là tất cả những vấn đề được phát hiện và được up tại link github ở trên. Cụ thể, các vấn đề (issue) của từng thành viên xem tại các link sau:
<ul>
<li> [Issue của Thắng](https://github.com/truonganhhoang/kiemthu2015/issues?utf8=%E2%9C%93&q=author%3Athangnq1001)</li>
<li> [Issue của Mỹ](https://github.com/truonganhhoang/kiemthu2015/issues?utf8=%E2%9C%93&q=author%3Amisaphan)</li>
<li> [Issue của Quân](https://github.com/truonganhhoang/kiemthu2015/issues?utf8=%E2%9C%93&q=author%3Akhoai23)</li>
<li>[Issue của Bộ](https://github.com/truonganhhoang/kiemthu2015/issues?utf8=%E2%9C%93&q=author%3Aphamvabo)</li>
</ul>
