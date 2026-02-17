# 3DEngine2 (Java + LWJGL)

A lightweight 3D engine / rendering playground written in **Java** using **LWJGL** (GLFW + OpenGL) and **JOML** for math.  
This project is aimed at learning and experimenting with real-time rendering, window/input handling, and engine architecture.

---

## Tech Stack
- **Java**
- **Gradle**
- **LWJGL** (GLFW, OpenGL, optional modules)
- **JOML** (math)

---

## Requirements

### Required
- **JDK 17+** (recommended: **JDK 21 LTS**)
- Gradle Wrapper (included)

### Notes for Windows
LWJGL needs native libraries (DLLs). This project uses Gradle `runtimeOnly` dependencies to pull the correct natives automatically.

---