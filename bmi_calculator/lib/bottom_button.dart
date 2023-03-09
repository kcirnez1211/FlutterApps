import 'package:flutter/material.dart';

import 'constants.dart';

class BottomButton extends StatelessWidget {

  BottomButton({this.onTap,this.buttonTitle});
  final VoidCallback? onTap;
  final String? buttonTitle;

  @override
  Widget build(BuildContext context) {
    return GestureDetector(onTap: onTap,
      child: Container(
        child: Center(child: Text(buttonTitle!,style: TextStyle(fontSize: 25.0,fontWeight: FontWeight.bold),)),
        color: kBottomContainerColour,
        margin: EdgeInsets.only(top: 10.0),
        height: kBottomContainerHeight,
        width: double.infinity,
      ),
    );
  }
}