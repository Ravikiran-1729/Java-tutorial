#include <iostream>
#include <vector>

using namespace std;

void printvector(vector<int> &v){
    for(int x : v){
        cout << x << " ";
    }
    cout<<"\n"<< "";
}

int main(){
    vector<int> v = {1,2,3,4,5};
    printvector(v);
}