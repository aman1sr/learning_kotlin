### Array
- we’ve wanted to hold references to a bunch of objects in one place, we’ve used an array
- can't change arr size

###  kotlin.collections package
- The Kotlin Standard Library contains pre-built classes and functions grouped into packages  Kotlin has three main types of collection—List, Set and Map:
  - List: when sequence matters
  - Set: when uniqueness matters
  - Map: when finding something by key matters
- Simple Lists, Sets and Maps are immutable
- Kotlin has mutable subtypes that you can use instead: MutableList, MutableSet and MutableMap
  - they have extra f() to add, remove , update, rearrange items
- 


### some useful builtIn f()
- shuffle() : randomize 
- addAll() : add all item at once
- removeAll() : removes items that are held in another collection
- the retainAll function retains all the items that are held in another collection and removes everything else:
- clear() : remove every item

### SET
-  create a Set by calling a function named setOf,
- Unlike a List, a Set is unordered, and can’t contain duplicate values.  (eg: https://g.co/gemini/share/d46aef91db8b)
- The Set gets the object’s hash code, and compares it with the hash codes of the objects already in the Set.
- The Set uses the === operator to compare the new value against any objects it contains with the same hash code.
- The Set uses the == operator to compare the new value against any objects it contains with matching hash codes.
- A MutableSet is a subtype of Set, but with extra functions that you can use to add and remove values.

### MAP
- Each entry in a Map is actually two objects—a key and a value
- create a Map by calling a function named mapOf
-  3 main things you might want to do with a Map: 
  - check whether it contains a specific key or value 
  - retrieve a value for a specified key
  - loop through the Map’s entries.
- check whether a Map contains a particular key or value using its containsKey() and containsValue()
-  get the value for a specified key using the get() and getValue()
- for mutable map use :  mutableMapOf()
  - put()
  - putAll()
  - remove()
- entries : get direct access to the key/value pairs using the Map’s entries property. The entries property returns a Set if it’s used with a Map,
  and returns a MutableSet if it’s used with a MutableMap
- 
  
  
  
