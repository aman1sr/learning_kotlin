
## equals
- works same as == operator in the context of Kotlin data classes
- the equals function checks for equality by checking whether two variables hold references to the same underlying object.
- checks for obj equivalence
- Every object has an equals function 

***NOTE***
for regular classes, == and .equals() do work the same way  ( checks for referential equality (i.e., whether the objects refer to the same instance in memory))


##  === operator
- checks for object identity
- the === operator always evaluates to true if (and only if) the two  variables hold a reference to the same underlying object


### Any
- Class Any is the mother of all classes: the ultimate  superclass of everything. 
- Every class IS-A type of Any without you having to say so.
- It ensures that every class inherits common behavior.
-  It means you can use polymorphism with any object.
- Any class defines several f() inherited by every class:
  - equals(any: Any): Boolean
  - hashCode(): Int
  - toString(): String

  
# Data Class
-  lets you create objects whose main purpose is to store data
- new implementation of equals f() where  objects are compared based on their properties,,, unlike normal class scenario where object are compared by  instance in memory.    (bard: https://g.co/gemini/share/5e66eab9b1f1)
- toString returns value of each property
- copy f() :lets you copy a data object, altering some of its properties where The original object remains intact.
- componentN f(): 
  - val title = obj.component1()    // to retrive the obj 1st property
- destructure data object
  - val (title, veg) = obj       // to explicitly split each object into it's componenet parts


   NOTE::::
* Every data class must have a primary constructor, which must define at least one parameter. Each parameter must be prefixed with val or var.
* If the class has a primary constructor, each secondary constructor must
  delegate to it. 
* Function overloading is when you have two or more functions with the same
  name but with different argument lists.
  * can change the return type, as long as argument lists are different
  * but can't change only return type  (https://g.co/gemini/share/9a03868d00f2)
* JAVA has no concept of default parameter values
* If you plan on making a lot of Java calls to your Kotlin constructor or
  function, an alternative approach is to annotate each function or constructor
  that uses default parameter values with @JvmOverloads. This tells the
  compiler to automatically create overloaded versions that can more easily be
  called from Java
* 

