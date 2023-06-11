class Point{
double x;
double y;
public void setx(double x_value){x=x_value;}
public void sety(double y_value){y=y_value;}
public double getx(){return x;}
public double gety(){return y;}
public double sdforigin(){return x*x+y*y;}
public static void main(String args[]){
Point p=new Point();
p.setx(3);
p.sety(6);
System.out.println(p.sdforigin());
}
}