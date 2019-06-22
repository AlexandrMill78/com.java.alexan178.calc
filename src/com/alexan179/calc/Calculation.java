package com.alexan179.calc;

public class Calculation {
    private int result;
    private char s;
    private int numberOne;
    private int numberTwo;

    public int calculation(char s, int numberOne, int numberTwo){
        switch (s) {
            case '+': {
                result = numberOne + numberTwo;
                break;
            }
            case '-': {
                result = numberOne - numberTwo;
                break;
            }
            case '*': {
                result = numberOne * numberTwo;
                break;
            }
            case '/': {
                result = numberOne / numberTwo;
                break;
            }
        }
        return result;
    }

    public int getResult() {
        return result;
    }

    public void setS(char s) {
        this.s = s;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }
}

