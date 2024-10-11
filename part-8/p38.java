import java.util.*;

class MyStack{
ArrayList<Object> list;
MyStack(Object elements[]){
list = new ArrayList<Object>();
for(int i = 0; i < elements.length; i++){
list.add( elements[i] );
}
}
MyStack(){
list = new ArrayList<Object>();
}
boolean isEmpty(){
return (list.size() == 0);
}
Object peek(){
return list.get( list.size()-1 );
}
Object pop(){
Object ob = list.get( list.size()-1 );
list.remove( list.size()- 1 );
return ob;
}
void push(Object o){
list.add(o);
}
}

public class p38{
public static void main(String[] args){
Integer arr[] = new Integer[]{1,2,3,4};
MyStack s = new MyStack( arr );
System.out.println("Current top = " + s.peek());
System.out.println("Pushing 7,8,9 in the stack");
s.push(7);
s.push(8);
s.push(9);
s.pop();
System.out.println("Elements in the stack are: ");
while(!s.isEmpty()){
System.out.println(s.pop());
}
}
}

