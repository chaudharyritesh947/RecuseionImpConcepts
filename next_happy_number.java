#include<math.h>
using namespace std;
bool v[1001];

bool check(int n){
    if(n==1)
        return true;
    if(n==4)
        return false;
    int sum=0;
    while(n>0){
        sum = sum+pow(n%10,2);
        n/=10;
    }
    return check(sum);
}

void pre(){
    for(int i=1;i<=1000;i++){
        if(check(i))
            v[i] = true;
        else
            v[i] = false;
    }
    return ;
}

int main()
 {
	pre();
	int t;cin>>t;
	while(t--){
	    int n;cin>>n;
	    for(int i=n+1;i<=1000;i++){
	        if(v[i]){
	            cout<<i<<endl;
	            //flag=1;
	            break;
	        }
	    }
	}
	return 0;
}