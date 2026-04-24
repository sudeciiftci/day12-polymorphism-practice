# Java Polymorphism Practice

This project demonstrates **polymorphism in Java** using method overriding and arrays of parent class references.

## Classes Included

### Shape Example (Circle, Rectangle, Triangle)
- Shows **runtime polymorphism** with `area()` method.
- Each shape calculates its own area differently.
- All objects are stored in a `Shape[]` array.

### Account Example (Savings, Fixed, Current)
- Each account type overrides `calculateInterest()`.
- Demonstrates different behaviors using the same parent type.
- Uses `Account[]` for unified handling.

### User Example (Student, Instructor)
- Overrides `content()` method.
- Shows role-based behavior:
  - Student → learning content
  - Instructor → teaching content
- Uses `User[]` array for polymorphism.

### Employee Example (Manager, Developer, Intern)
- Overrides `calculateSalary()` method.
- Each role has different salary logic:
  - Manager → bonus added
  - Developer → overtime added
  - Intern → reduced salary
- Demonstrates real-world salary calculation system.

## Key Concepts
- Runtime polymorphism
- Method overriding (`@Override`)
- Parent class references
- Dynamic method dispatch
- Code reusability and flexibility

## Purpose
To understand:
- How Java handles methods at runtime
- How one method name can behave differently
- How polymorphism simplifies code design

