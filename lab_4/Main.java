import java.util.Scanner;
import java.io.IOException;

/*Cписок допустимых типов данных в операторе switch включает:

    byte
    short
    int
    char
    Enum
    String 
    ссылочные типы данных , когда используется null в switch
*/

public class Main {
    public static void main(String[] args) throws IOException {
    //byte, short, int (на примере byte, изменяются только допустимые значения)
        byte b = 3;

        switch (b) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("Ошибка");
        }

    //char
        char character = 'C';

        switch (character) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            default:
                System.out.println("Неизвестный символ");
                break;
        }
    //Enum
        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

        Day day = Day.MONDAY;

        switch (day) {
            case MONDAY:
                System.out.println("Сегодня понедельник");
                break;
            case TUESDAY:
                System.out.println("Сегодня вторник");
                break;
            case WEDNESDAY:
                System.out.println("Сегодня среда");
                break;
            case THURSDAY:
                System.out.println("Сегодня четверг");
                break;
            case FRIDAY:
                System.out.println("Сегодня пятница");
                break;
            case SATURDAY:
                System.out.println("Сегодня суббота");
                break;
            case SUNDAY:
                System.out.println("Сегодня воскресенье");
                break;
            default:
                System.out.println("Неизвестный день недели");
                break;
        }
    //String 
        String day_string = "FRIDAY";
        switch (day_string) {
                case "MONDAY":
                    System.out.println("Сегодня понедельник");
                    break;
                case "TUESDAY":
                    System.out.println("Сегодня вторник");
                    break;
                case "WEDNESDAY":
                    System.out.println("Сегодня среда");
                    break;
                case "THURSDAY":
                    System.out.println("Сегодня четверг");
                    break;
                case "FRIDAY":
                    System.out.println("Сегодня пятница");
                    break;
                case "SATURDAY":
                    System.out.println("Сегодня суббота");
                    break;
                case "SUNDAY":
                    System.out.println("Сегодня воскресенье");
                    break;
                default:
                    System.out.println("Неизвестный день недели");
                    break;
            } 
    //ссылочные типы данных , когда используется null в switch

        day_string = null;
        switch (day_string) {
                case "MONDAY":
                    System.out.println("Сегодня понедельник");
                    break;
                case "TUESDAY":
                    System.out.println("Сегодня вторник");
                    break;
                case "WEDNESDAY":
                    System.out.println("Сегодня среда");
                    break;
                case "THURSDAY":
                    System.out.println("Сегодня четверг");
                    break;
                case "FRIDAY":
                    System.out.println("Сегодня пятница");
                    break;
                case "SATURDAY":
                    System.out.println("Сегодня суббота");
                    break;
                case "SUNDAY":
                    System.out.println("Сегодня воскресенье");
                    break;
                case null:
                     System.out.println("Значение null");
                     break;
                default:
                    System.out.println("Неизвестный день недели");
                    break;
            }
        }
    }