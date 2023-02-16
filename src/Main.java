public class Main {
    public static void main(String[] args) {
//        String[][] array = {
//                {"2" , "3" , "5" ,"6"} ,
//                {"2" , "3" , "5" ,"6"} ,
//                {"2" , "3" , "5" ,"6"} ,
//                {"2" , "3" , "j" ,"6"}
//        };
//        int[][] numberArray = new int[4][4];
//
//        try {
//            Main.setArray(array , numberArray);
//        } catch (MyArraySizeException e) {
//            throw new RuntimeException(e);
//        }
//
//
//        for (int num[] : numberArray) {
//            for (int number : num) {
//                System.out.print(number + " ");
//            }
//        }


   int[] numbers = new int[5];
   numbers[0] = 2;
   numbers[1] = 3;



    }

    public static void  setArray(String[][] array , int[][] arrayNum) throws MyArraySizeException{
        for (int i = 0; i < array.length; i++) {
            if (array.length == 4 && array[i].length == 4){
                System.out.println("Ok");
            }else {
                throw new MyArraySizeException("Размер выходит за рамки ресурса");
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length; j++) {
                try {
                    arrayNum[i][j] = Integer.parseInt(array[i][j]);
                }catch (NumberFormatException e){
                    System.out.println("В индексе: " + j  + " ошибка");
                }
            }
        }

    }
}



/*
2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
ячейке лежит символ или текст вместо числа), должно быть брошено исключение
MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
 */