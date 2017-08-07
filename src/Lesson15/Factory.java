package Lesson15;

import java.util.Random;
import java.util.Stack;

class Factory {

    static void throwDetails(Stack<Details> stack) {
        Details randomDetail = null;
        int randomNumber = 0;
        randomNumber = (int) (Math.random() * 9);
       switch (randomNumber) {
            case 0:
                randomDetail = Details.HEAD;
                break;
            case 1:
                randomDetail = Details.BODY;
                break;
            case 2:
                randomDetail = Details.LEFTHAND;
                break;
            case 3:
                randomDetail = Details.RIGHTHAND;
                break;
            case 4:
                randomDetail = Details.LEFTFOOT;
                break;
            case 5:
                randomDetail = Details.RIGHTFOOT;
                break;
            case 6:
                randomDetail = Details.CPU;
                break;
            case 7:
                randomDetail = Details.RAM;
                break;
            case 8:
                randomDetail = Details.HDD;
                break;
            default:
                System.out.println("Ошибка в генерации делалей!!!");
        }
        stack.push(randomDetail);
    }

    static int randomAmount(){
        return 1 + (int) (Math.random() * 3);
    }
}
