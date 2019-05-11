###4 Bài tập ôn tập Java- Core (20 câu hỏi)


####Bai 1: Java Decision, Loop, Exception
Gợi ý: Java Decision, Loop, Exception được sử dụng khi nào?

Bài tập: Viết chương trình thực hiện yêu cầu sau: (max 1.25đ)
* a) Cho phép nhập từ màn hình commandline một số nguyên thể hiện tuổi (age) của một học viên. Gợi ý: sử dụng Scanner. (0.25đ)
* b) Nếu nhập đúng: tuổi là số nguyên và thoả điều kiện >= 10 và <= 50, in ra màn hình số tuổi vừa nhập. (0.25đ)
  > Ví dụ: "Học viên có tuổi là: 10". 
* c) Nếu tuổi không thoả điều kiện >= 10 và <= 50, in ra màn hình đại loại: (0.25đ)
  > "Học viên không thoả điều kiện, vui lòng liên hệ phòng đào tạo để tìm hiểu thêm." 
* d) Nếu người dùng nhập sai: người dùng nhập chuỗi, hoặc kí tự đặc biệt không chuyển đổi chính xác sang số nguyên được thì in ra màn hình thông báo lỗi và cho phép nhập lại 1 lần. Gợi ý dùng try{}catch{}. (0.25đ)
  > "Dữ liệu không hợp lệ, vui lòng nhập tuổi là 1 số nguyên: ..."
* e) Nếu người dùng vẫn tiếp tục nhập sai như trong trường hợp (d), LẶP LẠI các bước như trên cho đến khi người dùng nhập đúng (b) hoặc (c) mới dừng lại. Gợi ý dùng While. (0.25đ)


####Bai 2: Java Arrays/List & Loop
Gợi ý: khi nào dùng Arrays/List? Nếu muốn thao tác trên mọi phần tử của Arrays có nhiều phần tử, ví dụ 1000 phần tử, mà không dùng Loop có được không?

Bài tập: (max 1.25đ)
* a) Cho một mảng gồm 10 số ngẫu nhiên từ 1 -> 100, tính tổng các số trong mảng. (0.25đ)
* b) Copy tên 100 nhân vật bất kì mà bạn biết trên Google và lưu vào 1 mảng/danh sách. In ra 100 cái tên này trên màn hình. (0.25đ)
* c) Săp xếp danh sách (b) theo thứ tự A -> Z và in ra. Gợi ý dùng hàm sắp xếp có sẵn sort(). (0.25đ)
* d) Tạo một danh sách lưu thông tin các học viên (Student). Mỗi học viên có ID, tên, và điểm số. Khởi tạo danh sách với 3 học viên bất kì. In danh sách học viên theo tên từ A -> Z. (0.25đ)
* e) Thêm vào danh sách (d) N học viên (N là một số bất kì tuỳ tình hình thực tế). Ví dụ N = 2: In danh sách học viên mới theo tên từ A -> Z. Gợi ý dùng List. (0.25đ)


####Bài 3: String, Regular Expression, File I/O
Gợi ý: nắm được các thao tác xử lý trên String, và đọc được file text *.txt

Bài tập: (max 1.25đ)
* a) Cho chuỗi sau: "Apple, Banana, Motorbike, Computer, Strawberry, Lemon". Dựa vào chuỗi đã cho in ra màn hình theo format dưới đây. (0.25đ)
  > "Item 01: Apple"
  > "Item 02: Banana"
* b) Thay thế từ "Motorbike" và từ "Computer" bằng tư mới để chuổi (a) ở trên trở thành một danh sách chứa toàn trái cây. (0.25đ)
* c) Thực hiện tương tự yêu cầu ở bài tập (a) cho chuỗi sau: "   Apple, ,Banana, Motorbike,++, Computer, Strawberry, Lemon ". Loại bỏ các kí tự nhiễu để có kết quả tốt nhất. (0.25đ)
* d) Cho menu đồ uống như dưới đây. Tạo menu tiếng Anh từ menu tiếng Việt được cho bằng cách thay thế tên đồ uống và đơn giá. Ví dụ 20K thay bằng 1$. Rồi in ra. (0.25đ)
  > "01 Cam ép           -> 20K"
  > "02 Việt quất        -> 30K"
  > "03 Cà phê sữa đá    -> 15K"
* e) Menu ở bài (d) được lưu trong file input.txt thay vì cho sẵn trong String. Hãy đọc menu từ file rồi làm theo yêu cầu bài (d). (0.25đ)
  

####Bài 4: Lập trình Hướng Đối Tượng - OOP
Gợi ý: Khi nào cần tạo thêm một class mới? Có nên gom code vào hết một class hay không? Khi nào nên cho class A kế thừa extends từ class B?

Bài tập: (max 1.5đ)
* a) Một cửa hàng đồ uống nọ có bán: CaPhe, TraSua, và Soda (sô đa). Mỗi mặt hàng có mã hàng (category), tên (name), và giá bán (price). Cụ thể:
  > category   | name     | price
  > C          | cà phê   | 20
  > T          | trà sữa  | 30
  > S          | sô đa    | 15
      
    Viết chương trình in ra menu đồ uống của cửa hàng. Gợi ý tạo một danh sách DoUong[] (đồ uống) và đặt tên là menu, rồi in ra. (0.25đ)

* b) Trong 1h cửa hàng đã bán được 10 đồ uống theo thứ tự: "CCTSCTSTTT". Tức là bán được 2 ly CaPhe, 1 ly TraSua, tiếp đến là 1 ly Soda,... tổng công 10 ly theo mã hàng như trên. Yêu cầu tính doanh thu cửa hàng thu được trong 1h như trên. Gợi ý tạo danh sách DoUong[] và đặt tên là dsBanDuoc (danh sách bán được). (0.5đ)
* c) Trong 5h nếu cửa hàng đã bán được như sau: "CCTSCTSTTTTSCSCTTTSCCSTCSSSTTTTTT" thì tổng doanh thu sau 5h là bao nhiêu? (0.25đ)
* d) Mỗi đồ uống có size khác nhau: S (nhỏ), M (vừa) L (lớn). Giá niêm yết ở trên là dành cho sai S. Nếu là size M thì giá tăng thêm 5K, sai L thì giá tăng thêm 10K. Tính doanh thu của cửa hàng khi bán được 10 ly như câu (b) "CCTSCTSTTT", nếu size lần lượt là "SMSSLSLLSM". (0.5đ)
* e) In hoá đơn trong trường hợp khách hàng mua 10 sản phâm như câu (d). Hoá đơn liệt kê từ 1 -> 10 danh sách các món đã mua, size, và giá. Và tổng giá sau cùng. (0.25đ)
