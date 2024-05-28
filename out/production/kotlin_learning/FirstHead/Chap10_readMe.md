
### how the generic function works:
      1) The <T> after the fun keyword declares the generic type parameter T.
              It represents a type that will be determined at the time of function invocation.
      2) The parameter array: Array<T> indicates that the printArray function expects an array of type T.
      3) Inside the function, you can use the type parameter T to refer to the type of elements in the array.

### NOTE: why we added reified modifier:
           allows you to use the T::class syntax to access the class of the type parameter T at runtime, without using reified see f() printArray2


### The generic type name can be anything that’s a legal identifier
- THE convention (which you should follow) is to use>> “T”. 
- if you’re writing a collection class or interface>>  use “E”  (for “Element”), 
- “K” and “V” (for “Key” and “Value”) if it’s a map.

### Use out to make a generic type covariant
- means that a subtype can be used in place of a supertype.


  