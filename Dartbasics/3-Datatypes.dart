//data types in dart programming language
//1- string
//2- int
// 3-double
// 4-num
// 5-list
// 6-map

void main(){
  String name="flutter course"; //it is strickly typed
  String trainingName ='hybrid mobile app';
  print("$trainingName : $name");
  print(trainingName + " :" +name);
  name="jovac";
  print(name);

  String instituteName="""
  hey
  this
  is
  """;
  print(instituteName);

  //NUMBERED DATA Types
  // 1-integer
  int distance =200;
  print(distance);
  print("distance from delhi to gla: ${distance}km");


  //2-fraction value

  double coursefree=1000.00;
  print(coursefree);
  print("the actual course fee: 4000, but gla student ,its $coursefree");

  //number data type
  num price =1000;
  print(price);
  price=1000.00;
  // price="ten thousand"; num is strict data type
  var price1=1000;

  print(price1);
  print(price);

  //boolean data types

  bool test =12>5;
  print(test);
  print(test.runtimeType);
  print(price.runtimeType);
  print(instituteName.runtimeType);

}