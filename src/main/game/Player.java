package game;

import game.Enums.Direction;
import lombok.Data;

@Data
public class Player extends SpielElement implements Movable {
    @Override
    public void move(Direction direction) {

    }
}