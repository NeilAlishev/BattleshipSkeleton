import java.util.List;

/**
 * @author Neil Alishev
 */
public class GameField {
    private String playerName;

    // корабль: 1
    // ареол корабля: 0
    // пустое пространство: -1
    // атакованная клетка: -2
    private int[][] playerField;

    // выставляется true тогда, когда до конца отрабатывает метод arrangePlayerField()
    private boolean playerFieldArranged;

    // инициализируется поле с пустым пространством (-1)
    public GameField(String playerName) {
        // TODO
    }

    public String getPlayerName() {
        return playerName;
    }

    public int[][] getPlayerField() {
        return playerField;
    }

    public boolean isPlayerFieldArranged() {
        return playerFieldArranged;
    }

    // Расставляет все корабли для этого поля
    public void arrangePlayerField() {
        // TODO
    }

    // Выводит поле на экран
    public void printField() {
        // TODO
    }

    // Пытается поставить на поле новый корабль, принимая на вход ввод из консоли
    // Вовзращает true, если корабль удалось поставить и false, если не удалось (не прошли все проверки, описанные в задании)
    private boolean arrangeShip(String userInput, int shipSize) {
        // TODO
        return false;
    }

    // этот метод вызывается в методе arrangeShip(String userInput, int shipSize) после того,
    // как прошли проверки на все возможные условия
    // этот метод непосредственно наносит на поле сам корабль и его ореол
    // (меняет значения в двумерном массиве)
    // 1 - сам корабль. 0 - ореол этого корабля
    private void arrangeShip(int[][] shipCoordinates, int shipSize) {
        // TODO
    }

    // проверяет, что валидный корабль можно поставить на поле
    // проверяет, что:
    // 1) Сам корабль занимает свободное пространство на поле
    // 2) В ореоле этого корабля нет кораблей
    private boolean arrangementPossible(int[][] shipCoordinates, int shipSize) {
        // проверяем пространство для самого корабля
        // TODO

        // проверяем простанство ареола корабля
        // TODO

        return false;
    }

    // Возвращает координаты ореола корабля
    private List<Integer[]> getShipAureole(int[][] shipCoordinates, int shipSize) {
        // TODO
        return null;
    }
}
