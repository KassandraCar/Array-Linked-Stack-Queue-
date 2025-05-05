# Stack and Queue Data Structure Implementation and Testing

This project implements fundamental data structures—**Stacks** and **Queues**—using 
two underlying storage mechanisms: **arrays** and **linked lists**. The implementation is thoroughly 
tested for correctness and edge case handling.

## Implemented Data Structures

### 1. Queue Implementations
- `ArrayQueue`: A fixed-size array-backed queue with dynamic resizing.
- `LinkedQueue`: A singly linked list-backed queue supporting constant-time enqueue and dequeue.

### 2. Stack Implementations
- `ArrayStack`: An array-backed stack with dynamic resizing for efficient push/pop operations.
- `LinkedStack`: A linked list-based stack that grows dynamically as elements are added.

## Features

Each data structure supports the following core operations:
- **Add/Enqueue/Push**: Insert an element.
- **Remove/Dequeue/Pop**: Remove and return the element.
- **Peek**: View the front/top element without removing it.
- **Size**: Return the current number of elements.
- **Empty**: Check if the structure is empty.

## Test Coverage

The following tests have passed successfully for all data structures:

- Add a small number of elements (3)
- Add a large number of elements (10,000)
- Peek value correctness
- Multiple peeks return consistent results
- Size correctness
- Correct behavior after being emptied
- Order of elements during mixed addition/removal
- Proper handling of empty structure operations
