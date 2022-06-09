void main() {
  /*
  Dart supports the following types of operators.
  1. Arithmetic Operators
  2. Assignment Operators
  3. Relational Operators
  4. Logical Operators
  5. Conditional Operators
  
  */
  var v1 =10;
  
  var v2 =20;

  //arithmetic operations
  // print("v1+v1 = ${v1 + v2}");
  // print("v1-v1 = ${v1 - v2}");
  // print("v1*v1 = ${v1 * v2}");
  // print("v1/v1 = ${v1 / v2}");
  // print("v1%v1 = ${v1 % v2}");
  // print("v1~/v1 = ${v1 ~/ v2}");  //integer division

  //unary operators
  print(v1++);  //postfix operator 30
  print(++v1); //prefix operator 32
  print(v1--); //post decrement 32
  print(--v1);  //pre decrement 30
  print(-v1);  //unary (-)minus operator
  print(-(-v1));
  var v3;
  var v4;
  v4= v3;
  print(v4);

  //assignment operator
  v1 +=10; //v1 =v1+10
  v1 -=10;
  
  print(v1);
  

  // relational operator

  var res =v1 < v2;
  print("result is : " +res.toString());

  bool x =true;
  bool y=false;
  var z =(v1 < v2) && x;//true
  print(z);
  var r =(v1 < v2) && x && y; //false
  print(r);
  var s =(v1 < v2) && x && (v1>v2); //false
  print(s);
  var t =(v1 < v2) || x || (v1>v2); //true
  print(t);
  var w =!(v1 < v2) ;
  print(w);
  var j=!(x || y);
  print(j);

  int num =10;
  String name =" neha";
  bool isadmin =true;
  var abc =20;
  print(num is! int);  //false
  print(name is! int); //true
  print(abc is! int);  //false
}