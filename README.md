# Proflex Backend (Java)

### Developed by Fernando Fogaça  
**Version:** TP01 – October 2025  

---

## 🧭 Overview

This project is the beginning of the **Proflex Backend**, a Java-based API that will serve both the **Proflex Web** and **Proflex Mobile** applications.  
The aim at this first stage was to set up the environment, understand the fundamentals of Java, and start shaping the data structure for the Proflex system.

The Proflex platform is designed for **independent physiotherapists and wellness professionals**, helping them manage clients, sessions, and personal records.  
This backend will gradually become the central hub that connects all Proflex versions together.

---

## ⚙️ Current Stage (TP01)

This first version focuses on the **core Java fundamentals**:

- ✅ Environment setup with **JDK 21** and **Eclipse IDE**  
- ✅ Creation of a **Spring Boot** project (`fogaca_api`)  
- ✅ Implementation of the first **Java classes**:
  - `Paciente` (Patient data)
  - `Endereco` (Address data)
- ✅ Use of **variables and data types** (`String`, `int`, `boolean`)
- ✅ Reading input from the user using the **Scanner** class  
- ✅ Displaying information in the console with `System.out.println`
- ✅ Debugging with breakpoints and variable inspection inside Eclipse  

The project currently simulates a **patient registration process** via the console.  
Users can type patient information directly into the terminal, and the system creates and displays the profile details dynamically.

---

## 🧩 Project Structure

fogaca_api/
├── src/
│ ├── main/java/br/edu/infnet/fogaca_api/
│ │ ├── FogacaApiApplication.java
│ │ ├── model/domain/Paciente.java
│ │ └── model/domain/Endereco.java
│
├── pom.xml
└── README.md


---

## What Has Been Learned

Through this first version, I learned how to:
- Configure and run a Java project from scratch  
- Understand classes, attributes, and methods  
- Work with constructors and objects  
- Use `Scanner` for input (like a simple console “form”)  
- Print data and test logic through the console  
- Use Eclipse’s **debug mode** to track variable values step by step  

This practical experience helped me connect theory with a real project — my own **Proflex** system — instead of generic exercises.

---

## 🚀 Next Steps (TP02 Preview)

The next phase will focus on:
- Storing multiple patients (lists and collections)  
- Organising data with packages and services  
- Preparing REST endpoints for real integration with the Proflex Web and Mobile apps  

---

## 🧾 About the Project

**Proflex** is a multi-platform system originally built with:
- **React** (Web) → [github.com/FernandoFogaca/proflex](https://github.com/FernandoFogaca/proflex)
- **React Native** (Mobile) → [github.com/FernandoFogaca/ProflexApp](https://github.com/FernandoFogaca/ProflexApp)

The **Java Backend** is now being developed to connect them both through a unified API.

---

> 💬 *“I decided to use my own real project (Proflex) for this Java course instead of random exercises,  
> so I could learn Java while building something that actually means something to me.”*  
> — Fernando Fogaça

---

### 🏁 Status
**✅ TP01 – Completed and running successfully in Eclipse (macOS, JDK 21)**  
Backend foundation ready for the next stages of development.

