public class Program{
public static void prime(int n){
for (int num=0;num<=n;num++){
int i;
for(i=2;i<num;i++){
if(num %i == 0)
break;
}
if(i==num)
System.out.print(num+" ");
}
}
public static void main(String[] args){
prime(100);
}
}