# RestFX Application

RestFX is a JavaFX-based application that demonstrates how to interact with a RESTful API and display the retrieved data in a graphical user interface.

## Features

- Load data from a RESTful API and display it in a ListView.
- Show a welcome message and a button to load the data.
- Display user ID,name,age & email addresses in the ListView.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- JavaFX 8 or higher

## Getting Started

1. Clone the repository to your local machine.
2. Open the project in your favorite Java IDE (e.g., IntelliJ, Eclipse).
3. Build the project to resolve dependencies.

## How to Run

1. Locate the `HelloApplication` class in the package `com.example.restfx`.
2. Run the `main` method in the `HelloApplication` class to start the application.
3. The application window will appear, showing a welcome message and a button to load the data.
4. Click the "Load Data" button to fetch the data from the RESTful API and display the email addresses in the ListView.

## Dependencies

- [JavaFX](https://openjfx.io/): JavaFX is used to create the graphical user interface.
- [Gson](https://github.com/google/gson): Gson is used for JSON serialization and deserialization.

## RESTful API Endpoint

The application uses the following RESTful API endpoint to fetch data:

- API URL: `https://api.example.com/data`
- Request Method: GET

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to create a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgments

- The RestFX application is developed as part of a sessional exam for [ CSE 254 ].
- Special thanks to [ChatGPT] for the guidance and support.

Feel free to customize this README file according to your application's specific details.
