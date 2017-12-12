public class MazeFactory {
  private static MazeFactory instance;
  private MazeFactory() {}

  public static MazeFactory Instance() {
    if (instance == null) {
      instance = new MazeFactory();
    }
    return instance;
  }

  public void createMaze() {
    System.out.println("Create Maze.");
  }
}