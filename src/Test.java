/**
 * @author Neil Alishev
 */
public class Test {
    public static void main(String[] args) {
        GameField gameField1 = new GameField("Player 1");

        // Какое-нибудь валидное игровое поле:

        // 4 - 0,0;0,1;0,2;0,3
        // 3(1) - 1,6;1,7;1,8
        // 3(2) - 3,2;4,2;5,2
        // 2(1) - 4,4;4,5
        // 2(2) - 7,2;7,3
        // 2(3) - 9,8;9,9
        // 1(1) - 2,0
        // 1(2) - 9,0
        // 1(3) - 7,6
        // 1(4) - 4,8

        gameField1.arrangePlayerField();
        gameField1.printField();

        GameField gameField2 = new GameField("Player2");
        gameField2.arrangePlayerField();
        gameField2.printField();

        Battleship battleship = new Battleship(gameField1, gameField2);
        battleship.play();
    }
}
