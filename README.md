# UniNote

**An engineering degree's study material in one organised library.**

College study material lives everywhere: notes, PDFs, shared drives and links in group chats. UniNote is a Java desktop content library that brings it into one place, organised exactly the way the syllabus is, so any topic is a few clicks away.

Built in 2023 with Java and JavaFX.

## What it does

- **Organised like the degree:** eight semesters, each subject, and every chapter within it.
- **The full curriculum:** from mathematics, physics and chemistry to algorithms, databases, operating systems, computer networks, AI, machine learning, deep learning, big data and cloud computing, plus skill labs and professional-skills modules.
- **References built in:** study material opens from the chapter it belongs to, and a built-in web view shows linked pages without leaving the app.
- **A short animated splash** on start-up.

## Project layout

```text
src/
  App.java, Main_1.java       Entry points (Main_1 is the JAR's Main-Class)
  Controller*.java            Navigation, splash screen and the web view
  Start.fxml, UniNote.fxml    Home and library screens
  Sem1.fxml … Sem8.fxml       One screen per semester
  <Subject>.fxml              One screen per subject, listing its chapters
  Flash.mp4                   Splash animation
out/artifacts/UniNote_jar/    Prebuilt runnable JAR
```

## Run it

You need **Java 17 or later** and the **[JavaFX SDK](https://openjfx.io/)** (UniNote uses the `controls`, `fxml`, `web` and `media` modules).

Run the prebuilt JAR:

```bash
java --module-path /path/to/javafx-sdk/lib \
     --add-modules javafx.controls,javafx.fxml,javafx.web,javafx.media \
     -jar out/artifacts/UniNote_jar/UniNote.jar
```

Or open the folder in IntelliJ IDEA (the project files are included) or VS Code with the Java extensions, add the JAR files from `javafx-sdk/lib` as libraries, and add these VM options to the run configuration:

```text
--module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml,javafx.web,javafx.media
```

## Notes

- The study material itself is linked from shared folders, not stored in this repository.
- Built by [StackWisp](https://stackwisp.com) as an early studio project.
