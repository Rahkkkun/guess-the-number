# 🎮 Guess The Number Game
A simple, interactive number-guessing game built with Java! Challenge yourself to guess the correct number within a limited number of attempts.

---

## 🚀 Features
- **Random Number Generation:** A number between 1 and 10 is randomly generated.
- **User Interaction:** The program provides feedback (e.g., *Too high*, *Too low*).
- **Limited Attempts:** You get **5 chances** to guess the number correctly.
- **Fun Gameplay:** Test your intuition and have fun guessing!

---

## 🛠️ How It Works
1. The program generates a random number between **1** and **10**.
2. You get **5 attempts** to guess the number.
3. Feedback is given for each guess:
   - If your guess is too low: *"Too low!"*
   - If your guess is too high: *"Too high!"*
   - If you guess correctly: *"Correct!"*
4. If you run out of attempts, the correct number is revealed.

---

## 📋 Prerequisites
- **Java Development Kit (JDK)** installed on your system.
- A basic understanding of Java to run the program.

---

## ▶️ How to Run

1. Clone the repository or copy the source code:
   ```bash
   git clone https://github.com/yourusername/guess-the-number-game.git
   ```
2. Navigate to the project directory:
   ```bash
   cd guess-the-number-game
   ```
3. Compile the program:
   ```bash
   javac GuessTheNum.java
   ```
4. Run the game:
   ```bash
   java GuessTheNum
   ```

---

## 📖 Example Output

```plaintext
Guess the number between 1 and 10. You have 5 attempts!
Enter your guess: 5
Too low! You have 4 attempts left.
Enter your guess: 8
Too high! You have 3 attempts left.
Enter your guess: 7
Correct! The number was: 7
```

---

## 💡 Future Enhancements
- Extend the range of numbers.
- Add a difficulty selection (Easy, Medium, Hard).
- Implement a scoring system based on attempts left.

---

## 📂 Project Structure
```plaintext
.
├── GuessTheNum.java  # Main program file
```

---

## 🤝 Contributing
Contributions are welcome! Feel free to fork this repository, make changes, and submit a pull request.

---

## 📜 License
This project is licensed under the [MIT License](LICENSE).

---

Have fun guessing! 🎉
