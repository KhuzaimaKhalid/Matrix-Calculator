# 🧮 Matrix Calculator

This project is a **Matrix Calculator and Array Reversal Utility** written in Java. It demonstrates object-oriented programming (OOP) concepts such as abstract classes, inheritance, method overriding, dynamic type selection, and user interaction with `Scanner`.

---

## 🚀 Features

- **Matrix Operations** (for int, float, double types):
  - Addition
  - Subtraction
  - Element-wise Multiplication
  - Combined operations (e.g., Addition & Multiplication)
  - Custom matrix size (user-specified rows and columns)
- **Array Reversal Utility**:
  - Reverse 1D, 2D, and 3D arrays for int, float, and double types
- **Find Maximum/Minimum** in 1D, 2D, and 3D arrays (int, float, double)
- **Interactive Menus**:
  - Choose data type, operation, and array/matrix manipulation options
  - Input validation and re-entry on invalid choices
- **Extensible OOP Design**:
  - Easily add new numeric types or operations

---

## 🧱 Class Structure

### `matrix` (Abstract Class)
- Fields:
  - `row`, `col` (matrix dimensions)
  - `Scanner sc` (for user input)
- Abstract Methods:
  - `init()`: Initialize matrix size and allocate arrays
  - `input()`: Input matrix values
  - `add()`, `sub()`, `mul()`: Matrix operations
  - `printm()`: Print matrices and results
  - `close()`: Resource cleanup

### `int_matrix`, `float_matrix`, `double_matrix`
- Implement all abstract methods for their type
- Store two input matrices (`mat1`, `mat2`) and three result matrices (`resa`, `resb`, `resc`)

### `reverse_array` (Abstract Class)
- Abstract reversal methods for int, float, and double arrays (1D/2D/3D)

### `int_reverse`, `float_reverse`, `double_array`
- Implement reversal logic for each type and dimension

### `Array_Caller`
- Handles user prompts and calls the appropriate reversal method for 1D, 2D, and 3D arrays

### `max`, `min`
- Utility classes to find maximum and minimum in 1D, 2D, 3D arrays for all numeric types

### `Matrix_Calculator` (Main Class)
- Presents an interactive menu:
  - Select matrix or array operation
  - Select numeric type
  - Enter dimensions and values
  - Choose and perform operations
  - Repeat or exit

---

## 🛠️ How It Works

1. User selects a **data type** (int, float, double) or array/matrix operation.
2. User enters **size/dimensions** and elements as prompted.
3. For matrices: user selects one or more **operations** (Addition, Subtraction, Multiplication, or combinations).
4. For arrays: user selects dimension and type, inputs values, and reverses the array.
5. For min/max: user selects the required array type/dimension and gets the result.
6. Results are displayed. User can perform more operations or exit.

---

## 🧪 Sample Output

```
================================= MATRIX CALCULATOR =======================================
choose data type : 
1. Integer
2. Float
3. Double
4. Integer Reverse 1-D array
...
13. Find integer Minimum Value for 1-D Array
...
22. Find integer Maximum Value for 1-D Array
...
31. Exit
Enter Here = 1

enter row size = 
2
enter column size = 
2
ENTER ELEMENTS OF FIRST MATRIX
enter element [0][0] = 1
enter element [0][1] = 2
enter element [1][0] = 3
enter element [1][1] = 4
ENTER ELEMENTS OF SECOND MATRIX
enter element [0][0] = 5
enter element [0][1] = 6
enter element [1][0] = 7
enter element [1][1] = 8
================== OPERATION SELECTION MENU =====================
1. Addition
2. Subtraction
3. Multiplication
4. Addition & Multiplication
5. Subtraction & Multiplication
6. Addition & Subtraction
Enter Here = 4

FIRST MATRIX
	1	2
	3	4
SECOND MATRIX
	5	6
	7	8
RESULTANT MATRIX OF ADDITION
	6	8
	10	12
RESULTANT MATRIX OF SUBTRACTION
	-4	-4
	-4	-4
RESULTANT MATRIX OF MULTIPLICATION
	5	12
	21	32
```

---

## 🗂️ File Structure

- `Matrix_Calculator.java` — Main menu, matrix logic, and integration, plus array utilities
- `reverse_array.java` — Abstract class and implementations for reversing arrays
- `max_min.java` — Find max/min in arrays of any dimension and type
- `README.md` — This file

---

## About

A command-line calculator for matrices and arrays, featuring interactive menus and OOP-based extensibility for multiple numeric types and dimensions. Suitable for learning, assignments, or as a utility.

---

## Resources

- [Java Documentation](https://docs.oracle.com/javase/8/docs/api/)

---

## Languages

- Java 100%

---
