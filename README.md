# Systems and Components

    - System is compund of compontes
    - Components should be:
        - Cohesive (clear and unique responsabilities)
        - uncoupled from each other
    Objectives
        - Flexibility
        - Maintenance/easy replacement
        - Reuse

##  Inversion of control and Dependency Injection

### Definition

“Inversion of Control is a principle in which the control of objects or portions 
of a program is transferred to a container or framework.” 
— Martin Fowler, “Inversion of Control Containers and the Dependency Injection pattern”, 2004.

In other word, i say that
Inversion of control is the separation of responsibilities between components
where Component A depends on Component B, but Component A has no direct control over Component B.
In this case, Component B is controlled or instantiated by a container, which could be the main 
program or a framework, responsible for creating and providing these objects as needed.

**Car analogy:**

- In a car, the **engine** depends on the **battery**.
- However, the battery fitting base is outside the engine.

## Dependency Injection

### Definition

“Dependency Injection is a specific form of Inversion of Control 
where dependencies are provided to a class rather than the class creating them itself.”
— Martin Fowler, “Inversion of Control Containers and the Dependency Injection pattern”, 2004.

That is, dependencies are injected into the component.
    
    