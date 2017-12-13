# Singleton
Creational pattern.

### Intent
Ensure a class only has one instance, and provide a global point of access to it.

### Problem
Application needs one, and only one, instance of an object. Additionally, lazy initizization and global access are necessary.

### Applicability
Use Singleton Pattern when:
- there must exactly one inctance of a clasee, and it must be accessible to clients from a well-known access point.
- when the sole instance should be extensible by subclassing, and clients should be able to use an extended instance without modifying their code.

### Structure

<img src="../images/singleton_structure.png">

### Participants
- **Singleton**
  - defines an Instance operation that lets clients access its unique instance. Instance is a class operation
  - may be responsible for creating its own unique instance.

### Codes

#### Creating `Singleton`
In `MazeFactory.java`:
```java
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
```

#### Creating `Demo`
In `Demo.java`:
```java
public class Demo {
  public static void main(String[] args) {
    MazeFactory factory = MazeFactory.Instance();

    factory.createMaze();
  }
}
```

Run the code by:
```
cd design_pattern/code/singleton && javac *.java && java Demo
```

#### Output
```
Create Maze.
```

### Consequences
The Singleton pattern has several benefits:

1. **Controlled access to sole instance.**

Because the Singleton class encapsulates its sole instance, it can have strict control over how and when the clients access it.

2. **Reduced name space.**

The Singleton pattern is an improvement over global variables. It avoids polluting the name space with global variables that store sole instances.

3. **Permits a variable number of instances.**

The pattern makes it easy to change your mind and allow more than one instance of Singleton class. Moreover, you can use the same approach to contorl the number of instances of the application uses.
