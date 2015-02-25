

/**
 * Created by admin on 25.02.2015.
 */
public class BinarySearch {

    public static void main(String[] args){
        int[] intArray;
        intArray = new int[100]; // инициализирует массив
        int elems = intArray.length; // Кол-во элементов в массиве
        int required = 33; //искомое
        int lowerBound = 0; //нижняя половина
        int upperBound = elems - 1; //верхняя половина
        int half; //половина ряда
        int q = 1; //счетчик операций

//      заполняет массив от 1 до 100
        for(int i = 0; i < elems; i++){
            intArray[i] = i + 1;
        }

//        Линейный поиск
        for (int j=0; j < elems; j++){
            if (intArray[j] == required){
                System.out.println("Количество операций при линейном поиске: " + (j+1));
                break;
            }
        }
        if (elems == required){
            System.out.println("Элемент не найден!");
        } else {
            System.out.println("Элемент найден: " + required);
        }


//        Двоичный поиск
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
                q++;
            }
        }
        System.out.println("Количество операций при бинарном поиске:" + q);
    }

}
