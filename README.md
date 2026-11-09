# Java Method Overloading Example

A minimal Java program that demonstrates **method overloading**: several methods in the same class share the name `add` but take different parameters.

## What It Demonstrates

```java
void add() {
    System.out.println("Nothing to add");
}

void add(int a) {
    System.out.println("Single parameter: " + a);
}

void add(int a, int b) {
    int c = a + b;
    System.out.println("C = " + c);
}
```

Java chooses which version to run based on the number (and types) of the arguments in the call.

## How It Works

| Call | Method used | Output |
|------|-------------|--------|
| `t.add()` | `add()` | Nothing to add |
| `t.add(5)` | `add(int a)` | Single parameter: 5 |
| `t.add(5, 4)` | `add(int a, int b)` | C = 9 |

## Output

```
Nothing to add
Single parameter: 5
C = 9
```

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

### Clone the repository

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
```

### Compile

```bash
javac Add.java
```

### Run

```bash
java Add
```

## Overloading Rules

- The methods must have the same name but different parameter lists (different number or types of parameters)
- Changing only the return type is **not** enough to overload a method
- Java picks the matching method at compile time

## Project Structure

```
.
├── Add.java
└── README.md
```

## Next Steps

- Add an overloaded `add(double a, double b)` method
- Add a version that takes three integers
- Compare overloading with overriding
