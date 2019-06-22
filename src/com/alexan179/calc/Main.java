package com.alexan179.calc;

public class Main {
    public static void main(String[] args) {
        String data;
        int numberOne = 0;
        int numberTwo = 0;
        String sing;
        int result;

        InData inData = new InData();
        data = inData.getingData();
//        for (int i = 0; i < data.length(); i++){
//            char s = data.charAt(i);
//            temp[i] = s;                                  // packing array temp  with elements (or.. look down)
        //char [] temp;
        //temp = data.toCharArray();                          // temp     - is Char array {5 + 2 =}
        int spaceInd = data.indexOf(" ", 0);       // looking for !" " = ind
        if (spaceInd > 2){
            System.out.println("Input Error (num1 is illegal)");
            System.exit(0);
        }
        //---------------------------- Num1 ----------------------------------------------------
        String tempNum = data.substring(0, spaceInd);        // temp_num { 5 }
        if (spaceInd == 1){                                  // space-index = 1
            if (Character.isDigit(tempNum.charAt(0))){
                numberOne = Integer.parseInt(tempNum);
            }
        } else if (Character.isDigit(tempNum.charAt(1))){    // space-index = 2 !
            if (Character.isDigit(tempNum.charAt(1))){
                numberOne = Integer.parseInt(tempNum);           // !! try ... catch (NumberFormatException e) ??
            }
        } else {
            System.out.println("Input Error (num1 isn't a number)");
            System.exit(0);
        }
        //-------- (+ - / *) if(data.indexOf(...) != -1) isn't element in String ----------
        sing = data.substring(spaceInd + 1, spaceInd + 2);
        char s = sing.charAt(0);

        //---------------------------- Num2 ----------------------------------------------------
        String tempNum2 = data.substring(data.indexOf(s)+2, data.indexOf(" ", data.indexOf(s)+2));
       /* if (data.indexOf(s)+1 == 5){                                  // space-index  on 5 posiz in data
            if (Character.isDigit(tempNum2.charAt(0))){
                numberTwo = Integer.parseInt(tempNum2);
            }
        } else if (Character.isDigit(tempNum2.charAt(1))){    // space-index = 2 !
            if (Character.isDigit(tempNum2.charAt(1))){
                numberTwo = Integer.parseInt(tempNum2);           // !! try ... catch (NumberFormatException e) ??
            }
        } else {
            System.out.println("Input Error");
            System.exit(0);
        }*/
        try {
            numberTwo = Integer.parseInt(tempNum2);
        }
        catch (NumberFormatException e){
            System.out.println("Input Error (num2 isn't a number)");
            System.exit(0);
        }


        //--------------------------- Calculation -----------------------------------------------

        if (s == '+' || (s == '-') || (s == '*') || (s == '/')){
            Calculation calculation = new Calculation();
//            calculation.setNumberOne(numberOne);
//            calculation.setNumberTwo(numberTwo);
//            calculation.setS(s);

            result = calculation.calculation(s, numberOne, numberTwo);
            System.out.print(result);

        } else {
            System.out.println("Input Error (num1 isn't a number)");
            System.exit(0);
        }
    }
}
