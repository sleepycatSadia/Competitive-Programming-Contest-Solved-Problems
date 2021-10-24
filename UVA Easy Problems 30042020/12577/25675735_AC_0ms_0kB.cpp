#include<bits/stdc++.h>
using namespace std;
int main(){
    int x=1;
while(true){
 string s;
 cin>>s ;
  if(s=="Hajj"){
    cout<<"Case "<<x<<": "<<"Hajj-e-Akbar"<<"\n";
x++;
  }else if(s=="Umrah"){
cout<<"Case "<<x<<": "<<"Hajj-e-Asghar"<<"\n";
x++;
}else if(s=="*"){
break;
}

}
return 0;
 }
