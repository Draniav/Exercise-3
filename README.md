# Exercise-3
 Bici-U

## Table of contents

- [About](#about)
- [Archives](#archives)
- [IDE](#ide)
- [Status](#status)
- [ScreenShoots](#screen-shoots)


## About
In this repository is the solution to the 2nd laboratory; its said: 
Create an application what  that allow students and professors to borrow bicycles using tickets and payment of debts
1. Bicycle has a unique code that identifies them. Also, the color, an
   attribute that ensures bicycle is available, and the type: Mountain or Road
2. Users can be students or professors. From each of them you need their DNI, name and
   surname and age.
3. Tickets are the mechanism to manage the usage of the Bicycle. A ticket has an unique
   code the generation must be sequential and automatically assigned, Tickets must be save on a .txt file
   called 'tickets.txt', Ticket status are 3:
   1. OK     : The bicycle was returned at time without problems or the debt was canceled.
   2. Pending: The bicycle was returned at no time, without helmet or damaged. Any of  these cases generate debt that must be paid in order to change the status to OK.
   3. Active : The bicycle was borrowed, and it is in use.
4. Debts are categorized in 3 scenarios. All debts are accumulative.
   This means that if you return the bicycle in no time and damaged, you must add both
   debts. These are the cost according to each scenario.
   1. No time: The bicycle was returned late. For every 30 minutes of delay, user must
      pay $3.
   2. Without helmet: The bicycle was returned with no helmet, user must pay $5
   3. Damaged: The bicycle or helmet was returned with some kind of damage, user must pay for bicycle or helmet $5 each one


## Archives

> ### folder Src             : Archive what contains the main code to run  the application. 
> ### folder app             : Archive what contains the classes needed for control the app's behavior.
> ### folder person          : Archive what contains OOP from  Persons and player.
> ### folder txt             : Archive what stores the different registers.
> ### folder vehicles        : Archive what stores the OOP for the Bicycles.
>
## IDE

The workshop was developed using IntelliJ Express.  



## Status
>in review.

>last update 7/17/2022.    

## Screen Shoots
some menus to  show how the app looks and how u  can  navigate in it.
<img src="src/screenshots/autoassigante ID + users.png"/>.  
<img src="src/screenshots/history + filters.png"/>.
<img src="src/screenshots/menu +updates.png"/>.
