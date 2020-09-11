/**
 * @author Neil Alishev
 */
public class Battleship {
    // поле первого игрока
    private GameField player1Field;
    // поле второго игрока
    private GameField player2Field;

    // true, пока игра идет. false, когда игра заканчивается
    private boolean gameIsOn;

    // кто сейчас ходит (true - player1, false - player2)
    private boolean isPlayer1;

    // количество кораблей на плаву игрока 1
    private int player1ShipCount;
    // количество кораблей на плаву игрока 2
    private int player2ShipCount;

    // единственный конструктор
    // внутри проверяется, что оба поля заполнены
    // также, инициализируются значения всех полей
    public Battleship(GameField player1Field, GameField player2Field) {
        // TODO
    }

    // запускает цикл игры пока gameIsOn = true
    public void play() {
        // TODO
    }

    // возвращает true, если userInput - валидный ход. Возвращает false, если userInput - невалидный ход
    // первый аргумент true если это ход первого игрока, false - если это ход второго игрока
    private boolean makeMove(boolean isPlayer1, String userInput) {
        // TODO
        return false;
    }

    // Производит удар по ячейке
    // Выводит сообщение либо "Мимо!", либо "Попадание", либо "Утопил".
    // В случае потопления декременитирует количество кораблей на плаву
    // Переводит право на ход другому игроку, если удар был "Мимо!"
    private void hit(int[][] playerField, int[] hitCoordinate) {
        // TODO
    }

    // true - если удар утопил корабль
    // false - если удар не утопил корабль
    private boolean shipSank(int[][] playerField, int[] hitCoordinate) {
        // идем вверх - вниз и вправо-влево пока не упремся в ареол.
        // TODO
        return false;
    }
}
