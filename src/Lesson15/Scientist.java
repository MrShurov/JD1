package Lesson15;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Stack;

@Getter
@NoArgsConstructor
public class Scientist {
    String scientistName;
    private int counterHead;
    private int counterBody;
    private int counterLeftHand;
    private int counterRightHand;
    private int counterLeftFoot;
    private int counterRightFoot;
    private int counterCPU;
    private int counterRAM;
    private int counterHDD;
    int amountRobots;

    Scientist(String scientistName) {
        this.scientistName = scientistName;
    }

    Details getDetails(Stack<Details> stack) {
        Details detail = null;
        if(stack.empty()){
            return Details.NOTHING;
        }
        return detail = stack.pop();
    }

    void countDetail(Details detail) {
        if (Details.CPU.equals(detail)) {
            counterCPU++;
        } else if (Details.HEAD.equals(detail)) {
            counterHead++;
        } else if (Details.BODY.equals(detail)) {
            counterBody++;
        } else if (Details.LEFTHAND.equals(detail)) {
            counterLeftHand++;
        } else if (Details.LEFTFOOT.equals(detail)) {
            counterLeftFoot++;
        } else if (Details.RAM.equals(detail)) {
            counterRAM++;
        } else if (Details.RIGHTFOOT.equals(detail)) {
            counterRightFoot++;
        } else if (Details.RIGHTHAND.equals(detail)) {
            counterRightHand++;
        } else if (Details.HDD.equals(detail)) {
            counterHDD++;
        } else if(Details.NOTHING.equals(detail)){
            System.out.println("Прислужник пришел пустой к " + scientistName);
          return;
        } else {
            System.out.println("Ошибка подсчета делалей!!!");
        }
        System.out.println(scientistName + " получил " + detail.toString());
    }

    void createRobot() {
        if (counterHDD >= 1 && counterRightHand >= 1 && counterRightFoot >= 1 && counterLeftFoot >= 1 && counterLeftHand >= 1 && counterRAM >= 1 && counterCPU >= 1 && counterHead >= 1 && counterBody >= 1) {
            amountRobots++;
            counterHDD--;
            counterRightHand--;
            counterRightFoot--;
            counterLeftFoot--;
            counterLeftHand--;
            counterRAM--;
            counterCPU--;
            counterHead--;
            counterBody--;
            System.out.println("Собрался робот " + amountRobots + " у " + scientistName);
        }
    }
}
