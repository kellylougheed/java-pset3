# Problem Set 3

## Problem 3-0: Ouija Board

Create a OuijaBoard class:

```
OuijaBoard
--------------
String[] nouns
String[] verbs
--------------
askQuestion(): void
answer(): String
```

As you declare the instance variables, initialize the nouns and verbs arrays with a handful of assorted nouns and verbs. The more vague you make your nouns and verbs, the more open to interpretation the answer will be.

The `askQuestion` method should allow the user to type in a question with the Scanner and then do nothing. The `answer` method should return a String that consists of a random noun, a random verb, and another random noun (from the instance variables that contain nouns and verbs). This mysterious String represents the Ouija Board’s answer from the beyond. 

In `main`, create an instance of a OuijaBoard. Call the `askQuestion` and `answer` methods on it.

Sample output:
```
Ask the Ouija Board a question: Will I make the varsity soccer team?
Answer: you conquer everything
```

**Challenge** (+2 EC): Change the arrays into ArrayLists and add a method called `addWords`. Before the user plays the Ouija Board, they can add their own nouns and verbs into the instance variables to customize the Ouija Board. The method should continually prompt the user to enter more nouns and then more verbs unless the user clarifies that they are finished adding words.

Sample output:
```
Add a noun (or type "done"): you
Add a noun (or type "done"): me
Add a noun (or type "done"): done
Add a verb (or type "done"): kick
Add a verb (or type "done"): done
Ask the Ouija Board a question: …
```

In `main`, call `addWords` on your OuijaBoard before the other methods.

## Problem 3-1: Seating Chart

Create a SeatingChart class: 
```
SeatingChart
--------------
ArrayList<String> students
String[4][4] seats
--------------
SeatingChart(ArrayList<String> s)
makeSeatingChart(): void
printSeatingChart(): void
```

The `makeSeatingChart` method should go through the `seats` array and assign a random student to each seat -- but of course, a student should not be repeated.

The `printSeatingChart` method should print out the seating chart in a way that reflects the 4x4 seating arrangement. For instance, the first row should be printed so that the four students’ names are on the same line, ideally separated by spaces.

## Problem 3-2: Word Frequency

In the `main` method of this class, declare a variable that stores a small excerpt from a famous piece of literature.
Then use the string split method to split the string into an array of strings. For example:

```
String hey = "Hello world";
String[] words = hey.split(" "); // returns ["hello", "world"];
```

Initialize a HashMap with a String key and an Integer value.

Loop through your array of words. As you loop, add each new word to the HashMap and set its value to 1. If you encounter a word that is already a key in the HashMap, increase its value by one.

Determine and print one of the words with the highest frequency in your excerpt.

## Problem 3-3: Latin Squares [Optional Challenge]

Latin Squares is an optional extra credit challenge. You will need to create a new LatinSquares.java class and test out your methods in Main.java.

[Click here to access the instructions!](https://docs.google.com/document/d/1q5ajNqH8Qq79B0P0HbT4xEMsUM09ChMpqOrYNq2fA8Y/)
