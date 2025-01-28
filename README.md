# Scala Type Variance Bug

This example demonstrates a subtle bug that arises from Scala's type variance rules.  The `MyClass` example showcases how comparing objects of different but compatible numeric types using `==`  can lead to unexpected results.

The solution demonstrates how to correctly handle these types of comparisons, ensuring that type variance considerations do not compromise the correctness of your code.

## Bug Description

When comparing instances of `MyClass` with different numeric types (like `Int` and `Double`), the comparison using `==` might yield `false` even if the underlying values are numerically equivalent. This is because the type parameters are not covariant, leading to a type mismatch.