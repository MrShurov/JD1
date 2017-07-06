import java.util.Scanner;

public class Date {

    public static void main(String[] args) {
        int Day;
        int Month;
        int Year;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день:");
        Day = in.nextInt();
        System.out.println("Введите месяц:");
        Month = in.nextInt();
        System.out.println("Введите год:");
        Year = in.nextInt();
        Day = ++Day;
        switch(Month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (Day == 32){
                    Month = ++Month;
                    Day = 1;
                    dateOut(Day, Month, Year);
                } else if (Day > 32){
                    System.out.println("Введены не верные данные.");
                } else if (Day <= 31){
                    dateOut(Day, Month, Year);
                }
                break;
            case 2:
                if (Day == 29){
                    Month = ++Month;
                    Day = 1;
                    dateOut(Day, Month, Year);
                } else if(Year % 4 == 0 && Year % 100 != 0) {
                    if (Day == 30){
                        Month = ++Month;
                        Day = 1;
                        dateOut(Day, Month, Year);
                        System.out.println("Весокосный год");
                    } else if(Day > 30){
                        System.out.println("Введены не верные данные.");
                    } else if (Day <= 29){
                        dateOut(Day, Month, Year);
                        System.out.println("Весокосный год");
                    }
                } else if(Year % 4 == 0 && Year % 100 == 0 && Year % 400 == 0){
                    if (Day == 30){
                        Month = ++Month;
                        Day = 1;
                        dateOut(Day, Month, Year);
                        System.out.println("Весокосный год");
                    } else if(Day > 30){
                        System.out.println("Введены не верные данные.");
                    } else if (Day <= 29){
                    dateOut(Day, Month, Year);
                    System.out.println("Весокосный год");
                    }
                } else if(Day > 29){
                    System.out.println("Введены не верные данные.");
                } else if(Day <= 28){
                    dateOut(Day, Month, Year);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (Day == 31){
                    Month = ++Month;
                    Day = 1;
                    dateOut(Day, Month, Year);
                } else if (Day > 31){
                    System.out.println("Введены не верные данные.");
                } else if (Day <= 30){
                    dateOut(Day, Month, Year);
                }
                break;
            case 12:
                if (Day == 32){
                    Month = 1;
                    Day = 1;
                    Year = ++Year;
                    dateOut(Day, Month, Year);
                } else if (Day > 32){
                    System.out.println("Введены не верные данные.");
                } else if (Day <= 31){
                    dateOut(Day, Month, Year);
                }
                break;
            default:
                System.out.println("Введены не верные данные.");
        }
    }

    private static void dateOut(int Day, int Month, int Year){
        System.out.println(Day + "." + Month + "." + Year);
    }
}
