# JavaFX Shapes and Image Display Application

## Description

This JavaFX application demonstrates the use of various graphical elements, including text, shapes, and images, in a JavaFX scene. The application features a black background and displays different shapes, including a line, rectangle, polygon, and circle. Additionally, an image is loaded and displayed within the scene.

## Features

- Displays a welcome message (`Hello, World!`) with a custom font and color.
- Renders various shapes:
  - **Line** with a white stroke and rotation.
  - **Rectangle** with a red fill.
  - **Polygon** with a blue fill.
  - **Circle** with a green fill.
- Loads and displays an image (`logo.png`).
- Adds an application icon using `logo.png`.
- Sets the application window size to 750x750 pixels.
- Disables window resizing.
- Enables full-screen mode with an exit hint (`Press Q`) and an exit key (`Q`).

## Requirements

- Java Development Kit (JDK) 11 or later
- JavaFX SDK installed
- A valid `logo.png` image file in the project directory

## Installation and Usage

1. Clone the repository:
   ```sh
   git clone https://github.com/Paradox01240/JavaFX-1.git
   ```
2. Navigate to the project directory:
   ```sh
   cd your-repository
   ```
3. Compile and run the application:
   ```sh
   javac --module-path "path/to/javafx/lib" --add-modules javafx.controls,javafx.graphics Main.java
   java --module-path "path/to/javafx/lib" --add-modules javafx.controls,javafx.graphics Main
   ```

## File Structure

```
/your-repository
├── src
│   ├── Main.java
│   ├── logo.png
├── README.md
```

## Notes

- Ensure that `logo.png` is available in the project directory; otherwise, the application may throw an exception.
- If running JavaFX separately, make sure to specify the correct module path.

## License

This project is licensed under the MIT License.

## Author

Tharusha Madushan
