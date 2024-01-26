package plusUltra

/*
* The shl operator is efficient for calculating powers of 2, but not for other bases.
For general exponentiation, use the pow() function.
*
* 2 raised to the power of (count - 1) is calculated using 1.shl(count - 1)
* 4.shl(count - 1) is equivalent to 4 * (2 ^ (count - 1))
*
* eg>> {@link Day04Seb}
* */