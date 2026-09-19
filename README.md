# 🚌 Tranzio – College Bus Tracking Management System

**Tranzio** is a web-based **College Bus Tracking Management System** designed to simplify college transportation management and provide students and administrators with better visibility into bus operations.

The system provides a centralized platform for managing college buses, tracking transportation information, and improving communication between transportation administrators and students.

## 🌐 Live Demo

🔗 **Live Application:**
https://tranzio.vercel.app/

---

## ✨ Features

### 🚌 Bus Management

* Manage college bus information
* Maintain bus details and transportation records
* Organize buses based on routes and availability

### 📍 Bus Tracking

* Track college transportation information
* Provide users with bus-related updates
* Improve visibility of college bus operations

### 🛣️ Route Management

* Manage college bus routes
* Organize route information
* Provide route details to users

### 👨‍🎓 Student Access

* View available bus information
* Check route and transportation details
* Access relevant bus updates

### 👨‍💼 Admin Management

* Manage bus information
* Manage routes
* Maintain transportation-related information
* Monitor the overall bus management system

---

## 🎯 Problem Statement

Managing college transportation manually can make it difficult for students and administrators to obtain accurate and timely bus information.

Tranzio aims to provide a centralized digital solution where transportation information can be managed and accessed through a web application.

### Traditional Approach

```text
Students
   │
   ├── Ask for bus information
   ├── Check route manually
   └── Depend on transportation updates
```

### Tranzio

```text
             ┌──────────────────────┐
             │       Tranzio        │
             │ College Bus System   │
             └──────────┬───────────┘
                        │
          ┌─────────────┼─────────────┐
          │             │             │
          ▼             ▼             ▼
       Students       Admins       Bus Data
          │             │             │
          └─────────────┼─────────────┘
                        ▼
                 Centralized System
```

---

## 🏗️ Project Structure

```text
Tranzio/
│
├── BusTrackingSystem/
│   ├── app/
│   ├── components/
│   ├── public/
│   ├── ...
│   └── ...
│
└── README.md
```

---

## 🛠️ Technologies Used

The application is organized as a modern web application. The repository contains the main `BusTrackingSystem` application along with its frontend configuration and supporting project files.

### Frontend

* React / Next.js
* JavaScript / TypeScript
* HTML
* CSS
* Tailwind CSS

### Development Tools

* Git
* GitHub
* npm
* VS Code
* Vercel

---

## 📱 Application Modules

### 🏠 Dashboard

Provides an overview of the bus transportation system and important information.

### 🚌 Bus Information

Displays available college bus information and related transportation details.

### 🛣️ Routes

Provides route-related information to help users understand available transportation paths.

### 📍 Tracking

Provides bus tracking functionality to improve visibility of college transportation.

### 👨‍💼 Administration

Allows authorized users to manage transportation-related information.

---

## 🚀 Getting Started

### Prerequisites

Make sure you have the following installed:

* Node.js
* npm
* Git

Check your versions:

```bash
node --version
npm --version
git --version
```

---

## 📥 Installation

Clone the repository:

```bash
git clone https://github.com/SoundaryanA46/Tranzio.git
```

Navigate into the project:

```bash
cd Tranzio
```

Navigate to the application:

```bash
cd BusTrackingSystem
```

Install dependencies:

```bash
npm install
```

---

## ▶️ Run the Application

Start the development server:

```bash
npm run dev
```

Open the application in your browser at:

```text
http://localhost:3000
```

The exact development URL may vary depending on the project's configuration.

---

## 🌐 Deployment

The project is deployed and accessible through Vercel.

### Live Application

🔗 https://tranzio.vercel.app/

---

## 📸 Screenshots

Add screenshots of the main application pages here.

Recommended screenshots:

* Login / Landing page
  <img width="1793" height="806" alt="image" src="https://github.com/user-attachments/assets/b738680c-0805-4fa3-9c62-2fd2e413033c" />

* Dashboard
  <img width="1890" height="899" alt="image" src="https://github.com/user-attachments/assets/1d99a740-56da-4f55-bfd5-806f88e73893" />

* Bus listing
  <img width="1782" height="899" alt="image" src="https://github.com/user-attachments/assets/0ca2f147-4abe-4e5a-a95b-d1d3a83e475f" />

* Route management
  <img width="1650" height="741" alt="image" src="https://github.com/user-attachments/assets/7f04847a-8a52-476e-afd7-ef6d991158ab" />

* Bus tracking
<img width="1914" height="848" alt="Screenshot 2025-08-09 070537" src="https://github.com/user-attachments/assets/28c83e15-de9a-410e-aff4-52271316a86b" />
  
* Admin panel
  <img width="1902" height="910" alt="image" src="https://github.com/user-attachments/assets/3e04fa28-d255-4647-942c-27ee0115cd75" />



### 🛣️ Routes

![Routes](screenshots/routes.png)
```

---

## 🔄 Application Workflow

```text
User
 │
 ▼
Open Tranzio
 │
 ▼
Authentication / Access
 │
 ├───────────────┐
 ▼               ▼
Student         Admin
 │               │
 ▼               ▼
View Bus       Manage Bus
Information    Information
 │               │
 ▼               ▼
View Routes    Manage Routes
 │               │
 └───────┬───────┘
         ▼
   Transportation
      Information
```
