#  💳 BankManagement System (Java + MySQL)

A comprehensive Java-based banking application that simulates core banking operations including user authentication, account management, and financial transactions.

## Features

- **Secure Authentication**: Login system for customers and staff
- **Multi-step Account Creation**: Streamlined user registration process
- **Transaction Management**: Support for deposits, withdrawals, and fund transfers
- **Database Integration**: MySQL backend for persistent data storage
- **Modern UI**: Clean interface built with Java Swing components and JCalendar

## ⚙️ Technical Stack

- **Language**: Java
- **Database**: MySQL
- **Dependencies**:
  - JCalendar 1.4 (Date picker component)
  - MySQL Connector Java 8.0.28

##  🛠️  Setup Instructions

### Prerequisites
- JDK 8 or higher
- MySQL Server
- IDE (Eclipse, IntelliJ IDEA, or NetBeans recommended)

###  💻 Installation

1. Clone this repository
   ```https://github.com/Karansehgal0611/BMS.git```
   
2. Import the project into your IDE

3. Set up the MySQL database
- Create a new database named `bank_management`
- Import the database schema from `database_schema.sql` (not included in the current file structure, needs to be created)

4. Configure database connection
- Open `src/Conn.java`
- Update the connection parameters if needed:
  ```java
  // Default configuration
  String url = "jdbc:mysql://localhost:3306/bank_management";
  String username = "root";
  String password = "password";
  ```

5. Add the required libraries to your classpath
- JCalendar 1.4
- MySQL Connector Java 8.0.28

These JAR files are included in the `lib` directory.

6. Run the application
- The entry point is `src/login.java`

## Usage

1. 👤 **Login**: Existing users can access their accounts through the login screen
2. 🔐 **New Account**: New customers can register through the multi-step signup process:
- signupOne: Personal details
- signupTwo: Additional information
- signupThree: Account configuration and credentials
3. 💰 **Transactions**: Perform deposits and withdrawals
4. 🔁 **Account Management**: View transaction history and account details

## Future Enhancements

- Statement generation and account history
- Fund transfers between accounts
- Bill payments and scheduled transactions
- Admin panel for bank staff
- Mobile-friendly responsive design

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments

- Thanks to all contributors who have helped with this project
- Inspiration from modern banking applications

## 👤 Author
Karan Sehgal
B.Tech CSE – Vellore Institute of Technology

---
### 📄 License
This project is for academic learning purposes. Please do not use it for production without review and enhancements.

