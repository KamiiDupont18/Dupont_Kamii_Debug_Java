# You need to know before

> This project has been developed using VisualStudioCode IDE, using better comments Extension.
> Ce projet à été développé en utilisant l'IDE VisualStudioCode, et l'extension better comments.

---

# 🩺 AnalyticsCounter

> A Java application that reads a list of symptoms from a file, counts their occurrences, sorts them, and writes the results to an output file.  
> Une application Java qui lit une liste de symptômes à partir d’un fichier, compte leur occurrence, les trie, et écrit les résultats dans un fichier de sortie.

---

## 📁 Project Structure / Structure du projet

```
com.hemebiotech
├── interfaces
│   ├── ISymptomReader.java
│   └── ISymptomWriter.java
├── main
│   ├── AnalyticsCounter.java
│   ├── MainApp.java
│   ├── SymptomReaderService.java
│   ├── SymptomCounterService.java
│   └── SymptomWriterService.java
└── resources
    ├── symptoms.txt       <-- input file / fichier d'entrée
    └── result.out         <-- output file / fichier de sortie
```

---

## 🚀 How to Run / Comment exécuter

1. **Compile the project**  
   Compilez le projet :
   ```bash
   javac -d bin src/com/hemebiotech/**/*.java
   ```

2. **Run the application**  
   Lancez l'application :
   ```bash
   java -cp bin com.hemebiotech.main.MainApp
   ```

---

## 📥 Input Format / Format du fichier d'entrée

Each line contains one symptom name.  
Chaque ligne contient le nom d’un symptôme.

**Example / Exemple :**
```
headache
fever
rash
headache
```

---

## 📤 Output Format / Format du fichier de sortie

The output is a list of symptoms with their count, sorted alphabetically.  
Le fichier de sortie contient la liste des symptômes triés par ordre alphabétique, avec le nombre d’occurrences.

**Example / Exemple :**
```
fever: 1
headache: 2
rash: 1
```

---

## ✅ Features / Fonctionnalités

- Read symptoms from a file  
  Lire les symptômes depuis un fichier texte

- Count each symptom’s occurrences  
  Compter le nombre d’occurrences de chaque symptôme

- Sort the symptoms alphabetically  
  Trier les symptômes par ordre alphabétique

- Write the results to a file  
  Écrire les résultats dans un fichier de sortie

---

## 🔧 Technologies Used / Technologies utilisées

- Java 8+  
- No external libraries / Sans librairies externes

---