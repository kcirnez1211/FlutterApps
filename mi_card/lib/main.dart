import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        backgroundColor: Colors.teal,
        body: SafeArea(
          child: Column(mainAxisAlignment: MainAxisAlignment.center,children: [
            CircleAvatar(
              radius: 50.0,
              backgroundImage: AssetImage('images/dp.jpeg'),
            ),
            Text(
              'Shashank Shekhar',
              style: TextStyle(
                  fontSize: 40.0,
                  color: Colors.white,
                  fontWeight: FontWeight.bold,
                  fontFamily: 'Pacifico'),
            ),
            Text(
              'FLUTTER DEVELOPER',
              style: TextStyle(
                  fontSize: 20.0,
                  color: Colors.teal.shade100,
                  fontWeight: FontWeight.bold,
                  fontFamily: 'SourceSansPro',
                  letterSpacing: 2.5),
            ),
            SizedBox(
              height:20.0 ,
              width: 150.0,
              child: Divider(
                color: Colors.teal.shade100,
              ),
            ),
            Card(

              margin: EdgeInsets.symmetric(vertical: 10.0, horizontal: 25.0),
              color: Colors.white,
              child: ListTile(
                leading:Icon(Icons.phone,color: Colors.teal) ,
                title: Text(
                  '+91 98753 54969',
                  style: TextStyle(
                      color: Colors.teal.shade900,
                      fontFamily: 'SourceSansPro',
                      fontSize: 20.0),
                ),
              )
            ),
            Card(

              margin: EdgeInsets.symmetric(vertical: 10.0, horizontal: 25.0),
              color: Colors.white,
              child: ListTile(
                leading:Icon(Icons.email,color: Colors.teal),
                title: Text(
                  'shekharshashank1211@gmail.com',
                  style: TextStyle(
                      color: Colors.teal.shade900,
                      fontFamily: 'SourceSansPro',
                      fontSize: 15.0),
              )
            )
          ),
        ]),
      ),
    ));
  }
}

