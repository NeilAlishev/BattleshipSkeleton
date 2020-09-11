/**
 * @author Neil Alishev
 * <p>
 * Collection of useful static methods
 */
// Класс с полезными статическими методами
public class Util {
    // Парсит одну координату (x,y)
    public static int[] parseCoordinate(String inputCoordinate) {
        // TODO
        return null;
    }

    // Парсит координаты корабля (x1,y1;xn,yn)
    public static int[][] parseShipCoordinates(String shipCoordinates, int shipSize) {
        // TODO
        return null;
    }

    // Проверяет координату x,y на валидность
    public static boolean checkCoordinate(String inputCoordinate) {
        // TODO
        return false;
    }

    // проверяет координаты корабля на валидность
    // (проверяет, что количество координат соответствует размеру корабля и проверяет отдельно каждую
    // координату x,y на валидность)
    public static boolean checkCoordinates(String userInput, int correctNumberOfCoordinates) {
        // TODO
        return false;
    }

    // Проверяет, что координаты - это валидный корабль
    // для корректного корабля одна координата всегда должна быть одинаковой
    // а вторая координата должна увеличиваться на единицу
    public static boolean checkShip(int[][] shipCoordinates, int shipSize) {
        // проверка на одну координату константу
        // TODO
        // проверка на одну возрастающую на единицу координату
        // TODO

        return false;
    }

    // Проверяет, что в массиве все значения одинаковые (используется в методе checkShip)
    private static boolean allValuesEqual(int[] array) {
        // TODO
        return false;
    }

    // Проверяет, что в массиве значения увеличиваются на единицу (используется в методе checkShip)
    private static boolean allValuesAscending(int[] array) {
        // TODO
        return false;
    }

    // возвращает true, если корабль расположен вертикально и false, если горизонтально
    public static boolean verticalOrHorizontal(int[][] shipCoordinates) {
        // TODO
        return false;
    }
}
