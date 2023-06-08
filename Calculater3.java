class Calculater3{
static int a=30;
static class Inner{
void msg(){
System.out.println(a);
}
}

public static void main(String args[]){
Calculater3.Inner o=new Calculater3.Inner();
o.msg();



}
}