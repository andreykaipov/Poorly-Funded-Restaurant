# Poorly-Funded-Restaurant
This program is a simulation of a poorly funded restaurant written in Java.

To check out this program, just run `Restaurant.jar` from the `dist` folder.

Our poorly funded restaurant has only one table that can be reserved every 15 minutes, and a special table that is exclusively for those who "walk-in" without a reservation.

Reservations are modeled in the form of a linked list, so that we can easily insert a reservation into a sorted list. 
Similarly, walk-ins are modeled in the form of a linked queue, so that our walk-ins are seated on a first-come-first-serve basis.

This program utilizes NetBeans' Swing GUI builder, so there is a lot of generated bulky code in the main class.

This was my Programming II (COP 3337) final project, and it got a few good laughs when I presented it to the class.
As part of the project, the `LinkedList.java` and `LinkedQueue.java` classes were written from scratch.
