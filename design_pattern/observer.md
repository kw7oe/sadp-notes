# Observer
Behavioral pattern.

### Intent
Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

### Applicability
Use the Observer pattern in any of following situations:
- When an abstraction has two aspects, one dependent on the other. Encapsulating these aspects in seperate objects let you vary and reuse them independently.
- When a change to one object requires changing others, and you don't know how many objects need to be changed.
- When an object should be able to notify other objects without making assumptions about who these objects are. In other words, you don't want these objects tightly coupled.

### Structure

<img src="../images/singleton_structure.png">

### Participants
- **Subject**
  - knows its observer. Any number of `Observer` objects may observe a subject.
  - provides an interface for attaching and detaching `Observer`
- **Observer**
  - define an updating interface for objects that should be notified of changes in a subject.
- **ConcreteSubject**
  - stores state of interest to `ConcreteObserver` objects.
  - sends a notification to its observers when its state changes.
- **ConcreteObserver**
  - maintains a reference to a `ConcreteSubject` object.
  - stores state that should stay consistent with the subject's.
  - implements the `Observer` updating interface to keep its state consistent wiht the subject's.

### Code

#### Creating `ConcreteSubject`
In `Subject.java`:
```java
import java.util.ArrayList;
import java.util.List;

public class Subject {
  private List<Observer> observers = new ArrayList<Observer>();
  private int state;

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
    notifyObservers();
  }

  public void attach(Observer observer) {
    observers.add(observer);
  }

  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update();
    }
  }
}
```

#### Creating `Observer`:
In `Observer.java`:
```java
public abstract class Observer {
  protected Subject subject;
  public abstract void update();
}
```

#### Creating `ConcreteObserver`
In `BinaryObserver.java`:
```java
public class BinaryObserver extends Observer {
  public BinaryObserver(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
  }
}
```

In `HexaObserver.java`:
```java
public class HexaObserver extends Observer {
  public HexaObserver(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("Hexa String: " + Integer.toHexString(subject.getState()));
  }
}
```


#### Creating `Demo`
In `Demo.java`:
```java
public class Demo {
  public static void main(String[] args) {
    Subject subject = new Subject();

    new BinaryObserver(subject);
    new HexaObserver(subject);

    System.out.println("State change: 15");
    subject.setState(15);
  }
}
```

Run the code by:
```
cd design_pattern/code/observer && javac *.java && java Demo
```

#### Output
```
State change: 15
Binary String: 1111
Hexa String: f
```

### Consequences
The Observer pattern lets you vary subjects and observers independently. You can reuse subjects without using their observers and vise versa. It lets you add observers without modifying the subject or other observers.

Further benefits and liabilities of the Observer pattern include the following:

1. Abstract coupling between `Subject` and `Observer`.
    - Subject know a list of observers.
    - Subject doesn't know the concerete class of any observer, only their interface of the abstract `Observer` class.
    - Thus, the coupling between subjects and observers is abstract and minimal.

2. Support for broadcast communication.

3. Unexpected updates.
    - Because observers have know knowledge of each other's presence, they can blind to the ultimate cost of changing the subject.
    - A operation on the subject may cause a cascade updates to observers and their dependent objects.