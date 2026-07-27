📌 Sprint 9: Transaction Management
✅ Features Added
💳 Transaction Class

Implemented a Transaction class to represent banking transactions.

Attributes:

Transaction ID
Transaction Amount
Transaction Type (DEPOSIT, WITHDRAWAL, NOTRANSACTION)
Transaction Status (SUCCESS, FAILED, PENDING)
Associated Account
📋 Constructors
Default Constructor
Parameterized Constructor
🔒 Encapsulation

Implemented complete getters and setters for all attributes.

🏷️ Enums

Created enums to improve readability and type safety.

TransactionType

DEPOSIT
WITHDRAWAL
NOTRANSACTION

TransactionStatus

SUCCESS
FAILED
PENDING
🔗 Association

Established an association between Transaction and Account.

Each transaction stores a reference to the account on which the transaction is performed.

🖥️ Display Method

Added a displayDetails() method to display transaction information.

🧪 Testing

Verified functionality in Main.java by:

Creating a customer
Creating a current account
Creating a transaction
Displaying account details
Displaying transaction details
📂 Updated Project Structure
BankManagementSystem/
│
├── accounts/
│   ├── Account.java
│   ├── SavingsAccount.java
│   └── CurrentAccount.java
│
├── people/
│   ├── Person.java
│   ├── Customer.java
│   └── Employee.java
│
├── services/
│   └── Transaction.java
│
├── enums/
│   ├── TransactionType.java
│   └── TransactionStatus.java
│
└── main/
    └── Main.java
🚀 Project Progress
Sprint	Status
Sprint 1 – Project Setup	✅ Completed
Sprint 2 – Person Class	✅ Completed
Sprint 3 – Customer Class	✅ Completed
Sprint 4 – Employee Class	✅ Completed
Sprint 5 – Account Class	✅ Completed
Sprint 6 – Savings Account	✅ Completed
Sprint 7 – Current Account	✅ Completed
Sprint 8 – Banking Operations	✅ Completed
Sprint 9 – Transaction Management	✅ Completed
🧠 OOP Concepts Practiced
Classes & Objects
Encapsulation
Inheritance
Method Overriding
Polymorphism (Upcasting)
Association (Has-A Relationship)
Constructors
Enums
Package Organization
Business Logic Implementation
