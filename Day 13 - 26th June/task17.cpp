#include <iostream>
using namespace std;

int main() {
    int x = 10;       // Declare an integer variable
    int *p = &x;      // Declare a pointer and assign it the address of x

    cout << "Value of x: " << x << endl;          // Output the value of x
    cout << "Address of x: " << &x << endl;       // Output the address of x
    cout << "Value of p (address of x): " << p << endl; // Output the value of p (address of x)
    cout << "Value at address p: " << *p << endl; // Output the value at the address stored in p

    *p = 20;           // Change the value at the address stored in p
    cout << "New value of x: " << x << endl;      // Output the new value of x

    return 0;
}
