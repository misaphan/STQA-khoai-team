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
