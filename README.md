# Architecture Pattern

An architectural pattern establishes a relationship between:

- **A context:** A recurring, common situation in the world that give rise to a problem.
- **A problem:** The problem, appropriately generalized, that arises in the given context.
- **A solution:** A successful architectural resolution to the problem, appropriately abstracted. The solution of a pattern is determined and described by:
  - A set of element types
- A set of interaction mechanisms or connectors
- A topological layout of the components
- A set of semantic constraints covering topology, element behavior and interaction mechanisms

### List of architecture styles

- [MVC](architecture/mvc.md)
- [Publish/Subscribe](architecture/publish_subscribe.md)
- [Broker](architecture/broker.md)
- [Client-Server](architecture/client_server.md)
- [Service-Oriented Architecture](architecture/soa.md)
- [Peer to peer](architecture/p2p.md)

# Design Patterns

### Creational
- Abstract the instantion process
- Help make a system independent of how its objects are created, composed and represnted
- **Class patterns:** use inheritance to vary the class that's instantiated
- **Object patterns:** delegate instantiation to another object
- Two dominant ideas
  - encapsulating knowledge about which concrete classes the system uses.
  - hiding how instances of these concrete classes are created and combined
- Creatianol design patterns
  - Give flexibility in what gets created, how it get created and when

### Stuctural
- Concern with how classes and objects are composed to form larget structures
- **Class patterns:** use inheritance to compose interface or implementations.
  - This allows multiple inheritances to be mixed into one.
- **Object patterns:** describe ways to compose objects to realize new functionality
  - This give flexibility to change compositions and run-time.

### Behavioural
- Concern with alogiritms and the assignment of responsibilities between objects.
  - not just pattern of objects, but also patterns of communication between them
- Characterize complex control flow that's difficult to follow at run-time.
  - Shift our focus away from flow of control
  - Concentrate on the way objects are interconnected
- **Class patterns:** use inheritance to distribute behavior between classes.
- **Object patterns:** use object composition rather than inheritance.

### List of Design Patterns

- [Facade](design_pattern/facade.md)
- [Proxy](design_pattern/proxy.md)
- [Factory Pattern](design_pattern/factory_pattern.md)
- [Abstract Factory](design_pattern/abstract_factory.md)
- [Adapter](design_pattern/adapter.md)
- [Observer](design_pattern/observer.md)
- [Singleton](design_pattern/singleton.md)
