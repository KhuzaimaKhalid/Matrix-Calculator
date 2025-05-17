# 🧮 Matrix Calculator

This is a simple **Matrix Calculator** written in Java, utilizing object-oriented programming (OOP) concepts such as abstract classes, inheritance, method overriding, dynamic class selection, and user input handling via `Scanner`.

---

## 🚀 Features

- Supports **three data types**: Integer, Float, and Double matrices
- **Dynamic selection** of matrix type at runtime
- **Matrix operations**:
  - Addition
  - Subtraction
  - Element-wise Multiplication
  - Combined operations (e.g., Addition & Multiplication)
- **Custom matrix size**: user can specify number of rows and columns
- **Interactive menu system** for operation selection
- **Input validation** and interactive prompts

---

## 🧱 Class Structure

### `matrix` (Abstract Class)
- Fields:
  - `row`, `col` (matrix dimensions)
  - `Scanner sc` (for user input)
- Abstract Methods:
  - `init()`: Initialize matrix size and allocate arrays
  - `input()`: Take matrix values from user
  - `add()`: Matrix addition
  - `sub()`: Matrix subtraction
  - `mul()`: Element-wise multiplication
  - `printm()`: Print matrices and results
  - `close()`: Close resources

### `int_matrix`, `float_matrix`, `double_matrix` (Concrete Classes)
- Inherit from `matrix`
- Implement all abstract methods for respective data types
- Fields:
  - Two input matrices (`mat1`, `mat2`)
  - Three result matrices (`resa`, `resb`, `resc`) for addition, subtraction, and multiplication

### `Matrix_Calculator` (Main Class)
- Presents a menu to:
  - Select matrix type (Integer/Float/Double)
  - Enter matrix dimensions and elements
  - Choose desired matrix operations
  - Display results
  - Repeat or exit

---

## 🛠️ How It Works

1. User selects the **data type** (Integer, Float, Double) for matrices.
2. User enters the **matrix size** (rows and columns).
3. User **inputs elements** for two matrices.
4. User chooses one or more **operations** (Addition, Subtraction, Multiplication, or combinations).
5. The calculator **performs the operations** and displays all matrices.
6. User can perform more calculations or exit.

---

## 🧪 Sample Output

```
================================= MATRIX CALCULATOR =======================================
choose data type : 
1. Integer
2. Float
3. Double
4. Exit
Enter Here = 1

enter row size = 
2
enter coloumn size = 
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
RESULTANT MATRIX OF SUBRACTION
	-4	-4
	-4	-4
RESULTANT MATRIX OF MULTIPLICATION
	5	12
	21	32
```

---

## About

A command-line matrix calculator featuring interactive menus and OOP-based extensibility for multiple numeric types.

---

## Resources

- [ReadMe](#)
- [Java Documentation](https://docs.oracle.com/javase/8/docs/api/)

---

## Languages

- Java 100%

---
