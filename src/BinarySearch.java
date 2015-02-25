import java.util.Scanner;

/**
 * Created by admin on 25.02.2015.
 */
public class BinarySearch {

    public static void main(String[] args){
        int[] intArray;
        intArray = new int[100]; // инициализирует массив
        for(int i = 0; i < intArray.length; i++){  //заполняет массив от 1 до 100
            intArray[i] = i + 1;
        }
        int required = 33; //искомое
        int lowerBound = 0; //нижняя половина
        int upperBound = intArray.length - 1; //верхняя половина
        int half;
        while (true){
            half = (lowerBound + upperBound)/2;
            if(intArray[half]==required){
                System.out.println("Элемент найден:" + (half+1));
                break;
            } else if(lowerBound > upperBound){
                System.out.println("Элемент не найден!");
                break;
            } else {
                if(intArray[half] < required){ //деление диапазона
                    lowerBound = half + 1;
                } else {
                    upperBound = half - 1;
                }
            }
        }
    }

}
