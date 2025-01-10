This repository showcases an uncommon error encountered when using the `removeIf` function on a `MutableList` in Kotlin. The issue stems from the modification of the list during iteration, which can lead to unexpected behavior and skipped elements.  The `bug.kt` file demonstrates the problem, while `bugSolution.kt` provides a corrected approach.

The core problem is that removing elements while iterating over the list alters the list's indices. This can cause the iterator to skip elements or throw an exception.

The solution demonstrates safer ways to achieve the desired result, avoiding the issues associated with modifying the list during iteration.  This is a subtle but important point in Kotlin collections handling.