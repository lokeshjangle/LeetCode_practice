/*- - - 1 
- - 2 3 2 
- 3 4 5 4 3 
4 5 6 7 6 5 4 */

// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;
int main() {
    // Write C++ code here
    int n = 4;
    for(int i=1;i<=n;++i){
        for(int j=0;j<n-i;j++){
            cout<<"-"<<" ";
        }
        for(int k=i;k<=2*i-1;k++){
            
            cout<<k<<" ";
        }
        for(int k=2*i-1;k>i;k--){
            cout<<k-1<<" ";
        }
        cout<<endl;
    }
    return 0;
}
