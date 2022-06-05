//TAKE INPUT IN dart prog
// v2.10.0 : nyllsafty
import 'dart:io';
void main(){
  print("enter your name");
  stdout.write("similar to print fuction"); //this is simlar to print
  String name =stdin.readLineSync()!;  //null safty operators are ! and ?
  //default value return by readline syc 
  //? -user may enter null value
  //! = user will not enter null value
  print(name);
}