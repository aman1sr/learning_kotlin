package higherOrderFunction

/*
* list.any{}: The any function is used on a list to check if at least one element in the list satisfies a given condition.
*           eg : val hasEvenNumber = numbers.any { it % 2 == 0 }
*
* list.any{}{}: This is an extension of the previous construct, allowing you to specify an additional condition for the elements that satisfy the first condition. It's similar to chaining two any{} calls together.
*           eg: val hasEvenSquare = numbers.any({ it % 2 == 0 }) { it * it > 10 }

*
* */