// Map Data Types (Dictionary in Python)
void main(){
  Map data={
    "name": "Manish",
    "age" : 30,
    "address" : "delhi",
    "phoneno": 123456789

  };
  //
  print(data);
  print(data["address"]);
  data["email"]="manish@gmail.com";
  print(data);

  Map course = new Map();

  //Map constructor
  course["name"] = "Flutter";
  course["time"] = "45 Hours";
  course["Fee"] = 1000;
  print(course);


}