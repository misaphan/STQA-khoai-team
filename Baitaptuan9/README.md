## Nhóm 42:
* Ngô Quốc Thắng
* Phan Bá Mỹ
* Nguyễn Hoàng Quân
* Phạm Văn Bộ

***

## 1. Kỹ thuật review:
Sử dụng danh sách kiểm tra. 

Danh sách kiểm tra là tập các câu hỏi nhằm xác định xem code có mắc phải 1 trong các lỗi phổ biến nào hay không.

Thường được chia thành các danh sách khác nhau, mỗi danh sách đề cập đến 1 kiểu lỗi khác nhau.


### Ví dụ:
![image](https://cloud.githubusercontent.com/assets/14196738/11059122/4aadbe6a-87ca-11e5-9d40-ba8fe9f58f8f.png)
![image](https://cloud.githubusercontent.com/assets/14196738/11059171/a832d412-87ca-11e5-8110-117f8da2a520.png)
![image](https://cloud.githubusercontent.com/assets/14196738/11059333/a78c762a-87cb-11e5-818a-34cb7026e163.png)
![image](https://cloud.githubusercontent.com/assets/14196738/11059379/e77f5fa4-87cb-11e5-971c-f483bdb0d48e.png)

## 2. Áp dụng:
Nhóm thực hiện review code của nhau (sử dụng danh sách kiểm tra) để phát hiện những điểm gây lỗi, dễ gây lỗi, sai chuẩn...cần được sửa.

### Ví dụ: 
Review code sau

    #include <iostream>
    #include <cmath>
    using namespace std;
    
    void main()
    {
        int n, number[50], s = 0;
        cout << "Nhap so phan tu cua day so: ";
        cin >> n;
        
        for(int i = 0; i < n; i++)
        {
            do
            {
                cout << "Nhap phan tu thu " << i + 1 << " : ";
                cin >> number[i];
                if(number[i] < 0 || number[i] > 24)
                    cout << "Ngoai khoang 0 den 24, moi nhap lai.\n";
                else
                    break;
            }
            while(1);
        }
        cout << "------------------------\n";

        for(int i = 0; i < n; i++)
            s = s + number[i];
        cout << "Tong day so = " << s << endl;
        
        cout << "Cac so nguyen to trong day so: ";
        for(int i = 0; i < n; i++)
        {
            if(number[i] > 1)
            {
                int check = 1;
                for(int j = 2; j <= sqrt(number[i]); j++)
                    if(number[i] % j == 0)
                    {
                        check = 0;
                        break;
                    }
                if(check == 1)
                    cout << number[i] <<' ';
            }
        }
        system("pause");
    }

Ta sẽ review code trên dựa vào các danh sách kiểm tra ở phần 1, rồi liệt kê các vấn đề tìm thấy và cách sửa.

**Structure**

* _Does the code conform to any pertinent coding standards?_

   Có thể "void main()" không gây lỗi ở đa số trường hợp, tuy nhiên sử dụng "int main()" và "return 0" là đúng chuẩn và an toàn hơn.

* _Are symbolic used rather than “magic number” constants or string constants?_

   Nên khai báo 1 biến lưu hằng số 50 (ví dụ là MAX), khi đó phần khai báo mảng "number[50]" sẽ trở thành "number[MAX]". Thói quen này sẽ có ích khi chúng ta cần sửa đổi những chương trình lớn.

* _Are any modules excessively complex and should be restructured or split into multiple routines?_

   Nên dùng 1 hàm kiểm tra số nguyên tố thay vì dùng trong main. Việc này giúp code đỡ phức tạp và rõ ràng hơn.

**Documentation**

* _Is the code clearly and adequately documented with an easy-to-maintain commenting style?_

   Không có comment nào. Cần bổ sung comment để người đọc biết code nào làm công việc gì.

**Variables**

* _Are all variables properly defined with meaningful, consistent, and clear names?_

   Biến "s" (để lưu tổng các phần tử trong mảng) cần có 1 cái tên thích hợp hơn. Có thể là "sum".

**Arithmetic Operations**

   Không có.

**Loops and Branches**

   Không có

**Defensive Programming**

* _Are imported data and input arguments tested for validity and completeness?_

   Biến n chưa được kiểm tra tính hợp lệ trước khi gán giá trị (VD: giá trị âm là không hợp lệ).
