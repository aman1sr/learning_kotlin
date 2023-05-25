## Extension Function
- Extension functions allow you to add new functions to existing classes without modifying their source code. You can extend classes from both your own code and from external libraries.

- Extension functions are defined outside the class they extend but can be called as if they were member functions of that class. This provides a convenient way to add new behavior or utility functions to classes without cluttering their original implementation.

- Extension functions are defined using the fun keyword followed by the type you want to extend, a dot, and the name of the function. Inside the extension function, you can access the properties and methods of the class you're extending using the this keyword.

- Extension functions can be called on instances of the class they extend just like regular member functions. The compiler handles the dispatching of the function call based on the declared type of the object. This means you can invoke the extension function on any object of the extended class, even if the function was defined elsewhere.

- Extension functions promote code reusability and improve code readability. They allow you to define common operations or utility functions once and apply them to multiple instances of a class. This helps in writing concise and expressive code, making it easier to understand and maintain.

### NOTE:
- all scope functions in Kotlin (let, run, with, apply, and also) are implemented as extension functions. They are defined as extension functions on the Any class, which is the root of the Kotlin class hierarchy.

### eg: 
- let: Executes a block of code on an object and returns the result. It is often used for null-checking or performing transformations on nullable objects.

- run: Executes a block of code on an object and returns the result. It is similar to let, but it can also access the object using the this keyword.

- with: Executes a block of code with an object as a receiver and returns the result. It allows you to access the object's properties and functions directly without using the this keyword.

- apply: Executes a block of code on an object and returns the object itself. It is commonly used for configuring object properties or performing initialization operations.

- also: Executes a block of code on an object and returns the object itself. It is similar to apply, but it allows you to perform additional operations or side effects on the object.

- takeIf: Takes an object and a predicate condition. It returns the object itself if the condition is true, otherwise it returns null.

- takeUnless: Takes an object and a predicate condition. It returns the object itself if the condition is false, otherwise it returns null.

- forEach: Iterates over a collection and performs an action on each element. It is useful for performing operations on each item without returning any result.

- map: Transforms each element of a collection based on a given lambda and returns a new collection with the transformed elements.

- filter: Filters a collection based on a given predicate condition and returns a new collection with the filtered elements.

((next 10 ))
fold: Accumulates the values of a collection into a single value by repeatedly applying an operation. It takes an initial value and a lambda expression that specifies the operation.

groupBy: Groups elements of a collection by a key returned by a lambda expression and returns a map of the groups.

maxByOrNull / minByOrNull: Finds the maximum or minimum element in a collection based on a selector function and returns the element itself.

distinct: Returns a list containing only distinct elements from the original collection.

sorted: Returns a sorted version of the collection. It can take a custom comparator or use the natural order of the elements.

associate: Creates a map from elements of a collection by specifying key-value pairs in a lambda expression.

zip: Creates a list of pairs by combining elements from two collections based on their indices.

firstOrNull / lastOrNull: Returns the first or last element of a collection that matches a given predicate, or null if no such element is found.

partition: Splits a collection into two lists based on a predicate condition and returns a pair of lists.

any / all: Checks if any or all elements in a collection satisfy a given predicate condition and returns a boolean result.