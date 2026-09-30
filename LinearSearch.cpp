#include <iostream>
#include <vector>
using namespace std;

int linearSearch(const vector<int>& arr, int target);

int main(){
    cout << "Hello World" << endl;
    

    int arr[] = {23, 67, 89, 80, 45, 20, 10};
    vector<int> vec(arr, arr + sizeof(arr)/sizeof(arr[0]));
    int target = 80;

    int result = linearSearch(vec, target);

    if(result == -1) {
        cout << "Element not found" << endl;
    }
    else {
        cout << "Element found at index " << result << endl;
    }
    return 0;
}

int linearSearch(const vector<int>& arr, int target) {
    for(int i = 0; i < arr.size();i++){
        if(arr[i]== target) {
            return i;
        }
    }
    return -1;
}
