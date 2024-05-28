/*
* -------------------------------x--ABSTRACT Class--x-------------------------------
* abstract class means that nobody can create any objects of that type
* they define the protocol for a group of subclasses
* An abstract class can have abstract properties and functions
* The first concrete class in the inheritance tree below the abstract superclass must
  implement all abstract properties and functions.
* Java: Java does not allow a class to directly inherit from multiple classes (including abstract classes). This is done to avoid complexities like the "Diamond Problem" that can arise with multiple inheritance.
*       while programming lang like c++, Eiffle can inherit from multiple abstract classes
* */
  /*
  *-------------------------------x--INTERFACE Class--x-------------------------------
  *Interfaces are used to define a protocol for common behavior
* a class can implement multiple interfaces, but can only inherit from a single direct superclass
* Interface functions can be abstract or concrete   (https://g.co/gemini/share/48185d403091)
* Restriction:
    * Unlike properties in abstract classes, properties that are defined in an interface can’t store state,
      and therefore can’t be initialized. You can, however, return a value for a property by defining a custom getter
    * Interface properties don’t have backing fields ( ie can't define custom setters)
*
* */
  /** -------------------------------x--CONCLUSION--x-------------------------------
* Make an abstract class:
    * when you want to define a template for a group of subclasses.
    * when you want to guarantee that nobody can make objects of that type.
* Make an interface :
    * when you want to define common behavior, regardless of where these classes are in the inheritance tree
* */