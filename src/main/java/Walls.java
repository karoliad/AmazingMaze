import java.util.ArrayList;
import java.util.List;

public class Walls {
    private List<Wall> walls = new ArrayList<>();


    public void addWall (Wall wall){
        walls.add(wall);
    }

    public List<Wall> getWalls() {
        return walls;
    }
}
