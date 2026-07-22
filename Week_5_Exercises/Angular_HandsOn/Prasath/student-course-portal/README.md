# Student Course Portal 🎓

This is my final submission for the **Angular Hands-On module** of the Digital Nurture 5.0 Java FSE program. Over the course of 10 hands-on exercises, I built this complete Single Page Application (SPA) to manage student course enrollments. It demonstrates advanced Angular concepts like NgRx state management, HTTP Interceptors, and Reactive Forms.

## 🚀 Features Built
- **Dynamic Course Dashboard**: Displays all available and enrolled courses fetched from a mock REST API.
- **State Management**: Fully integrated **NgRx** store to handle course loading, caching, and enrollment states cleanly.
- **Routing & Guards**: Implemented Lazy Loading for the enrollment module, along with `CanActivate` (Auth) and `CanDeactivate` (Unsaved changes) route guards.
- **Forms & Validation**: Built both Template-driven and Reactive forms with custom async validators (e.g., simulating email uniqueness checks).
- **HTTP Interceptors**: Added global interceptors for injecting Auth tokens into headers and catching API errors globally.
- **Custom Directives & Pipes**: Built a custom `appHighlight` directive for UI interactions and a `creditLabel` pipe for data formatting.

## 🛠️ Tech Stack
- **Angular 20** (Standalone Components)
- **TypeScript** & **RxJS**
- **NgRx** (Store, Effects, Selectors)
- **JSON Server** (Mock REST API)
- **Jasmine & Karma** (Unit Testing)

## ⚙️ How to Run the Project Locally

### 1. Start the Mock Backend (JSON Server)
This project uses JSON server to simulate API calls for the course data. You'll need to run this first:
```bash
npm install -g json-server
json-server --watch db.json --port 3000
```

### 2. Start the Angular Dev Server
In a separate terminal window, install the dependencies and start the app:
```bash
npm install
ng serve
```
Then navigate to `http://localhost:4200/` in your browser to view the application!

## 🧪 Running Unit Tests
I've written comprehensive unit tests for the components and services using Angular's `TestBed` and `HttpTestingController` to ensure high code quality. To run them:
```bash
ng test
```

## 📂 Project Structure
Following Angular best practices, the project is organized cleanly into features:
- `src/app/components/`: Reusable UI elements (Header, Course Cards)
- `src/app/pages/`: Main route views (Home, Course List, Enrollment Forms)
- `src/app/services/`: Shared business logic and HTTP calls
- `src/app/store/`: NgRx state management files
- `src/app/interceptors/`: HTTP request/response manipulation

---
*Developed as part of the CTS Digital Nurture 5.0 Deep Skilling Program.*
