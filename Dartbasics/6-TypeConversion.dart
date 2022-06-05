void main(){
   /* Type Conversion in Dart
    INT
    int -> String == toString() 
    int -> double == toDouble() 
    
    DOUBLE
    double -> String == toString() 
    double -> int    == toInt() 
    
    STRING
    String -> int    == int.parse() 
    String -> double == double.parse() 
    BOOL
    bool -> String == toString() 
  */
  bool value =true;
  print("before conversion => ${value.runtimeType}");
  var convertedval =value.toString();
  print("after conversion==> ${convertedval.runtimeType}");
  print(convertedval);

}