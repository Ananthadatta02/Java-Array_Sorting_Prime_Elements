# Sorting Prime Elements in an Array

## Description
This Java program sorts only the prime numbers in an array while keeping the non-prime elements unchanged. It extracts the prime numbers, sorts them separately, and then reinserts them into their original positions. The implementation includes an `isPrime()` method to check for prime numbers and nested loops for sorting.

## How It Works
1. **User Input:** The user enters the size of the array and its elements.
2. **Prime Number Extraction:** The program identifies prime numbers in the array and stores them separately.
3. **Sorting:** The extracted prime numbers are sorted in ascending order.
4. **Reinsertion:** The sorted prime numbers are placed back into their original positions within the array.
5. **Final Output:** The modified array with sorted prime numbers is displayed.

## Explanation of Variables
- **size**: Stores the size of the array entered by the user.
- **arr[]**: The main array that holds all the elements entered by the user.
- **count**: Keeps track of the number of prime numbers in the array.
- **newArr[]**: Stores the extracted prime numbers before sorting.
- **index**: Helps in inserting sorted prime numbers back into their original positions.

## Explanation of Code Sections

### User Input and Array Initialization
```java
Scanner s = new Scanner(System.in);
System.out.println("Enter the Size");
int size = s.nextInt();
int arr[] = new int[size];
System.out.println("Enter the elements");
for(int i=0; i<=arr.length-1; i++)
{
    arr[i] = s.nextInt();
}
```
- The program prompts the user to enter the array size.
- The array `arr[]` is created with the given size.
- The user then inputs elements into the array using a `for` loop.

### Counting and Storing Prime Numbers
```java
int count = 0;
for(int i=0; i<=arr.length-1; i++)
{
    if(isPrime(arr[i]))
        count++;
}
int newArr[] = new int[count];
int index = 0;
for(int i=0; i<=arr.length-1; i++)
{
    if(isPrime(arr[i]))
        newArr[index++] = arr[i];
}
```
- The first `for` loop counts the number of prime numbers in `arr[]`.
- A new array `newArr[]` is created to store the prime numbers.
- The second `for` loop extracts prime numbers from `arr[]` and stores them in `newArr[]`.

### Sorting the Prime Numbers
```java
for(int i=0; i<=newArr.length-1; i++)
{
    for(int j=0; j<=i-1; j++)
    {
        if(newArr[j] > newArr[i])
        {
            int temp = newArr[i];
            newArr[i] = newArr[j];
            newArr[j] = temp;
        }
    }
}
```
- A nested `for` loop sorts `newArr[]` in ascending order using the **bubble sort** approach.
- The `if` condition swaps elements if `newArr[j]` is greater than `newArr[i]`.

### Reinserting Sorted Prime Numbers
```java
index = 0;
for(int i=0; i<=arr.length-1; i++)
{
    if(isPrime(arr[i]))
    {
        arr[i] = newArr[index++];
    }
}
```
- The sorted prime numbers are placed back into their original positions in `arr[]`.

### Prime Number Check Method
```java
public static boolean isPrime(int n)
{
    int count = 0;
    for(int i=1; i<=n; i++)
    {
        if(n % i == 0)
            count++;
    }
    return count == 2;
}
```
- This method checks if a number is prime by counting its divisors.
- If `count == 2`, the number is prime; otherwise, it is not.

## Example Input/Output
### Input:
```
Enter the Size: 5
Enter the elements: 3 4 7 10 5
```
### Output:
```
Array [3, 4, 7, 10, 5]
New Array [3, 7, 5]
New Array Sorted [3, 5, 7]
Sorted Array [3, 4, 5, 10, 7]
```
## Key Features
- Extracts prime numbers from an array.
- Sorts prime numbers separately.
- Reinserts sorted prime numbers without affecting non-prime elements.
- Uses efficient logic for sorting and checking primes.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Array_Sorting_Prime_Elements.git
```
