# iCalc - Number Converter

A comprehensive command-line Java application that provides seamless number system conversion between Decimal, Binary, Octal, and Hexadecimal formats, with complete Roman numeral conversion functionality.

## Features

- **Decimal Converter**: Convert decimal numbers to binary, octal, and hexadecimal
- **Binary Converter**: Convert binary numbers to decimal, octal, and hexadecimal  
- **Octal Converter**: Convert octal numbers to decimal, binary, and hexadecimal
- **Hexadecimal Converter**: Convert hexadecimal numbers to decimal, binary, and octal
- **Roman Number Converter**: Complete bidirectional conversion between decimal and Roman numerals
  - Decimal to Roman numeral conversion (range: 1-1000)
  - Roman numeral to decimal conversion with proper subtractive notation handling (IV, IX, XL, XC, CD, CM)
- Interactive menu-driven interface with beautiful ASCII art
- Comprehensive input validation and error handling
- User-friendly retry options for invalid inputs
- Elegant program flow with homepage navigation

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Command line interface (Terminal/Command Prompt)

### Installation

1. Clone the repository:

```bash
git clone https://github.com/PasinduOG/iCalc-Converter.git
```

2. Navigate to the project directory:
```bash
cd iCalc-Converter
```

3. Compile the Java file:
```bash
javac ICalc.java
```

4. Run the application:
```bash
java ICalc
```

## Usage

When you run the application, you'll see the main menu with the following options:

```
[01] Decimal Converter
[02] Binary Converter
[03] Octal Converter
[04] Hexadecimal Converter
[05] Roman Number Converter
```

### Example Usage

1. **Decimal to Other Systems**:
   - Select option 1
   - Enter a decimal number (e.g., 42)
   - Output: Binary: 101010, Octal: 52, Hexadecimal: 2a

2. **Binary to Other Systems**:
   - Select option 2  
   - Enter a binary number (e.g., 101010)
   - Output: Decimal: 42, Octal: 52, Hexadecimal: 2a

3. **Octal to Other Systems**:
   - Select option 3
   - Enter an octal number (e.g., 52)
   - Output: Decimal: 42, Binary: 101010, Hexadecimal: 2a

4. **Hexadecimal to Other Systems**:
   - Select option 4
   - Enter a hexadecimal number (e.g., 2A or 2a)
   - Output: Decimal: 42, Binary: 101010, Octal: 52

5. **Roman Numeral Conversion**:
   - Select option 5, then choose sub-option:
     - Option 1: Decimal to Roman (e.g., 42 → XLII)
     - Option 2: Roman to Decimal (e.g., XLII → 42)

### Supported Number Systems & Validation

- **Decimal**: Positive integers (1 and above)
- **Binary**: Binary digits only (0 and 1) - validates each character
- **Octal**: Octal digits only (0-7) - validates each character  
- **Hexadecimal**: Hexadecimal digits (0-9, A-F, a-f) - case insensitive
- **Roman Numerals**: Standard Roman numerals with subtractive notation support
  - Supports: I(1), V(5), X(10), L(50), C(100), D(500), M(1000)
  - Subtractive pairs: IV(4), IX(9), XL(40), XC(90), CD(400), CM(900)

## Project Structure

```
iCalc/
├── ICalc.java          # Complete application with all converters implemented
├── ICalc.class         # Compiled Java bytecode
└── README.md           # This documentation file
```

## Code Organization

The application is implemented as a single Java class with:
- Main menu loop with ASCII art interface
- Switch-case structure for converter selection
- Individual converter methods with validation
- Error handling and user retry logic
- Clean program flow with homepage navigation

## Current Status

✅ **All Converters Fully Implemented and Working:**
- **Decimal Converter**: Complete - converts to binary, octal, and hexadecimal
- **Binary Converter**: Complete - converts to decimal, octal, and hexadecimal  
- **Octal Converter**: Complete - converts to decimal, binary, and hexadecimal
- **Hexadecimal Converter**: Complete - converts to decimal, binary, and octal
- **Roman Numeral Converter**: Complete - bidirectional conversion with full subtractive notation support

✅ **Advanced Features:**
- Comprehensive input validation for all number systems
- Elegant error handling with retry options
- Beautiful ASCII art interface
- Seamless navigation between converters
- User-friendly menu system

## Technical Implementation Details

### Conversion Algorithms
- **Decimal to Binary/Octal/Hex**: Uses division method with remainder collection
- **Binary to Decimal**: Power-of-2 calculation with character-to-digit conversion
- **Octal to Decimal**: Power-of-8 calculation with digit validation
- **Hexadecimal to Decimal**: Uses `Integer.parseInt()` with base 16
- **Roman Numerals**: Implements both additive and subtractive notation (IV, IX, XL, XC, CD, CM)

### Input Validation
- **Binary**: Accepts only 0s and 1s, validates each character
- **Octal**: Validates each digit is between 0-7
- **Hexadecimal**: Case-insensitive, accepts 0-9, A-F, a-f
- **Roman**: Validates against standard Roman numeral characters (I, V, X, L, C, D, M)

## Current Limitations

- Supports positive integers only (no negative numbers)
- No support for floating-point numbers  
- Roman numeral conversion range: 1-1000 for decimal to Roman
- Binary input limited by integer size constraints

## Future Enhancements

- [ ] Add support for negative numbers
- [ ] Add support for floating-point numbers
- [ ] Extend Roman numeral range beyond 1000
- [ ] Implement file input/output functionality
- [ ] Add batch conversion mode
- [ ] Create unit tests
- [ ] Develop GUI version
- [ ] Add conversion history feature

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-feature`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/new-feature`)
5. Create a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author

**PasinduOG**
- GitHub: [@PasinduOG](https://github.com/PasinduOG)

## Acknowledgments

- Thanks to the Java community for excellent documentation
- ASCII art generated for the application interface

---

*Happy Converting! 🔢*
