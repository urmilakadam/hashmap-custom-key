# HashMap with Custom Keys

This repository demonstrates the usage of custom objects as keys in a `HashMap`, highlighting the differences between **immutable** and **mutable** keys using `Student.java` and `StudentMutableClass.java`.

## Files Overview

### `Student.java` (Immutable Key)
- Represents an **immutable** class.
- **Fields** are `private final` and cannot be changed after object creation.
- Overrides `equals()` and `hashCode()` for consistent behavior in `HashMap`.

#### Advantages:
- **Reliable Map Behavior**: Immutable keys ensure the `hashCode()` and `equals()` stay constant, enabling consistent storage and retrieval from the `HashMap`.

### `StudentMutableClass.java` (Mutable Key)
- Represents a **mutable** class where fields can be modified after object creation.
- **Implements Mutable Properties**: While it behaves like a mutable object, this can cause **unpredictable behavior** in a `HashMap` if the state changes after insertion.

#### Issues:
- **Inconsistent Hashing**: Modifying key fields changes the `hashCode()`, potentially breaking `HashMap` functionality, leading to failed retrieval.
- **Breaking Map Key Integrity**: Since the state of the key changes, the object may no longer be found in the map even though it was previously added, resulting in loss of data integrity.

## Map Behavior and Interaction
- **Immutable Keys (`Student`)**: Safe to use in `HashMap`, as the key’s state remains constant.
- **Mutable Keys (`StudentMutableClass`)**: Dangerous in `HashMap`, as modifying key state can cause data loss or retrieval issues.

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/urmilakadam/hashmap-custom-key.git
