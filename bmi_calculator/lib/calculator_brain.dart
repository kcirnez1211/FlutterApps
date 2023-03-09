
import 'dart:math';

class CalculatorBrain{

  CalculatorBrain({required this.weight,required this.height});

  final int weight;
  final int height;
  double _bmi=0;

  String BMICalculate(){
    _bmi = weight/pow(height/100, 2);
    return _bmi.toStringAsFixed(1);
  }

  String getResults(){
    if(_bmi>=25)
      return 'OVERWEIGHT';
    else if(_bmi>18)
      return 'NORMAL';
    else
      return 'UNDERWEIGHT';
  }

  String getInterpretation(){
    if(_bmi>=25)
      return 'You have higher than normal body weight. Try to exercise more.';
    else if(_bmi>18)
      return 'You have a normal body weight. Good Job!';
    else
      return 'Your BMI result is quite low. You should eat more!';
  }

}