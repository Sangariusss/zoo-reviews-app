# Zoo Review System

This is a simple Zoo Review System that allows users to leave reviews for different services or products offered by a zoo.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The Zoo Review System is designed to collect and manage reviews from users about various services or products provided by a zoo. It includes a structured three-layer architecture, user, review, and service/product entities, and uses serialization for data persistence.

## Features

- **User Management:** Users can be added to the system.
- **Service/Product Management:** Services or products offered by the zoo can be added.
- **Review Submission:** Users can submit reviews for specific services or products.
- **Serialization:** Data is persisted using serialization to maintain state between program runs.

## Getting Started

To get started with the Zoo Review System, follow these steps:

1. Clone the repository: `git clone https://github.com/Sangariusss/zoo-review-system.git`
2. Navigate to the project directory: `cd zoo-review-system`
3. Compile the project: `javac -d target/classes src/zoo/Main.java`

## Usage

After compiling the project, you can run the application:

```bash
java -classpath target/classes com.sangarius.oop.practice6.zoo.Main
```
Follow the on-screen instructions to interact with the Zoo Review System.

## Contributing

If you'd like to contribute to the development of the Zoo Review System, please follow these guidelines:

1. Fork the repository.
2. Create a new branch for your feature or bug fix: `git checkout -b feature/new-feature`.
3. Make your changes and commit them: `git commit -m "Add new feature"`.
4. Push your changes to your fork: `git push origin feature/new-feature`.
5. Open a pull request.

## License

This project is licensed under the [MIT License](LICENSE) - see the LICENSE file for details.
