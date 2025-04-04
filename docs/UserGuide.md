# User Guide

## Introduction

{Give a product intro}

## Quick Start

1. Ensure that you have Java 17 or above installed.
2. Down the latest zip file of `Navi` from [here](https://github.com/AY2425S2-CS2113-W12-2/tp/releases).
3. Unzip the file and cd into that directory on your terminal.
4. Enter `java -jar Navi.jar` and enjoy the app!

___
## Starting Navi
Whenever users start Navi, they will first be greeted and then prompted to first enter their name.

Example:
`Alfred`
```
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Welcome! I'm:
 _   _             _
| \ | | __ ___   _(_)
|  \| |/ _` \ \ / / |
| |\  | (_| |\ V /| |
|_| \_|\__,_| \_/ |_|
What’s your name?
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Alfred
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Hello, Alfred! Nice to meet you!
Alright, what can I do for you?
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
```
Then, user may enter `canteen`, `budget` or `favorites` to use these features.
___
## Features
1. Canteen Feature
2. Budget Feature
3. Favorites Feature
___
## Canteen: `canteen`
The Canteen feature provides 2 sub-features which includes:
1. Canteen Finder 
2. Canteen Lookup

Format: `Canteen` or `c`

Example: `c`
```
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
c
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
You've entered the Canteen feature!
You can enter "finder" to look for the nearest canteen to you,
or you can enter "lookup" to see a canteen's stalls information.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
```
___
### To enter Canteen Finder: `finder`
This sub-feature allows users to search for the nearest canteen in NUS Kent Ridge Campus 
based on user specified canteen criteria and location.

Format: `finder` or `f`

Example: `f`
```
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
f
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
So you wanna find where's the nearest canteen to you?
What kind of canteen are you looking for?
You can list out: "Halal Certified", "Muslim Owned", "Vegetarian", "Aircon"
or "NIL" if you're fine with anything!
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
```
### Canteen Finder

#### 1. Enter desired canteen criteria: `criteria`
Users can enter certain criteria to filter the search for the nearest canteen. 

These criteria include `halal certified`/`hc`, `muslim owned`/`mo`, `vegetarian`/`v` 
and `aircon`/`a`. User can enter multiple criteria at once by separating each criterion
with a `,`. 

User can also enter `nil` if they do not wish to specify any criteria.

**Tip 1:** There are very limited stalls that satisfies multiple criteria.

**Tip 2:** It is redundant to include both `halal certified` and `muslim owned` as 
if a stall is already halal, there is no nid to check if its muslim owned.

Format: `criterion 1, criterion 2`

Example: `hc, a`
```
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
hc, a
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
So you're looking for a canteen has:
halal certified, aircon stalls.
I would need to know where are you now!
You can enter either faculties, hostels or other major landmarks in NUS!
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
```
#### 2. Enter location name: `location`
After specifying the canteen criteria, users can then enter the general location
of where they are at.

We only support locations at the `faculty` and `hostel` level as well as 
other `key buildings` that don't belong to the two categories above.

Format: `location`

Example: `soc`
```
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
soc
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Alright! The nearest canteen to you that fit your criteria is
The Deck
which has:
Mrs Hen
  [Y] Halal Certified
  [N] Muslim Owned
  [N] Vegetarian
  [Y] In Aircon Area
and it is approximately at most 220m from where you are.
You can enter your canteen criteria again to start the search again,
or "exit" to exit canteen finder.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
```
#### 3. Exit Canteen Finder `exit`
Users can exit Canteen Finder whenever they feel like it.

Format: `exit` or `e`

Example: `e`
```
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
e
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
You have exited the Canteen Finder feature!
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
```
___
### To enter Canteen Lookup: `lookup`
This sub-feature allows user to check what kind of stalls are present in their desired canteen.

Format: `lookup` or `l`

Example: `l`
```
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
l
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
You've entered the Canteen Lookup feature!
Enter any Canteen in NUS to check what kind of stalls it have!
Eg. Techno Edge
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
```
### Canteen Lookup
#### 1. Enter canteen name `canteen`
Users can enter a specific canteen name in NUS Kent Ridge Campus.

Format: `canteen`

Example: `techno`
```
```
#### 2. Exit Canteen Lookup `exit`
Users can exit Canteen Finder whenever they feel like it.

Format: `exit` or `e`

Example: `e`
```
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
e
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
You've exited the Canteen Lookup feature
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
```
___
### To quit Canteen: `quit`
This is to quit the canteen feature. Users need to have exited `Canteen Finder`
or `Canteen Lookup` to quit `Canteen`.

Format: `quit` or `q`

Example: `q`
```
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
q
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
You've exited the Canteen feature!
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
```
___
## Budget: `budget`

```
💰 Budget Tracker: Enter a command (add X, deduct X, view, exit)
```
### Weekly budget resets
Every mondays, system will prompt the following question

```
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Do you want to carry over last week's remaining budget? (yes/no)
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
> no
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

```
### View status of budget and expenses
Format: `view`

Example:
```
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
view
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Remaining weekly budget: $0.00
Total spent today: $0.00
Total spent this week: $0.00
Total spent this month: $100.00
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

```

### Add to weekly budget
Format: `add AMOUNT`

Example:
```
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
>add 100
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Added $100.00 to this week's budget.
Remaining weekly budget: $100.00
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

```

### Deduct from weekly budget and add to expenses
Format: `deduct AMOUNT`

Example:
```
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
deduct 20
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Deducted $20.00 from your weekly budget.
Remaining weekly budget: $80.00
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

```

### View remaining budget and expenses
Format: `view`

Example:
```
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
view
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Remaining weekly budget: $80.00
Total spent today: $20.00
Total spent this week: $20.00
Total spent this month: $120.00
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

```
### Exit budget feature
Format: `exit`
```
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
> exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
👋 Exiting Budget Tracker.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
```

### Automatic expenses resets
* Daily Reset: Expenses clear at midnight
* Weekly Reset: Expenses clear on Monday
* Monthly Reset: Expenses clear on 1st of month


___
## Favorites: `favorites`

```
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
🌟 Favorites Tracker: Enter a command:
  - add <description> : <rating> : <location>
  - remove N
  - view
  - sort asc
  - sort desc
  - search X
  - undo
  - exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
```
### Add to favorites list
Format: `add <description> : <rating> : <location>`

```

> add milo:3:com
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
✅ Added: milo | Rating: 3 | Category: com
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
```
### Remove from favorites list
Format: `remove N`

```
> remove 1
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
❌ Removed: milo | Rating: 3 | Category: com
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
```
### View favorites list
Format:`view`

```
> view
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
🌟 Your favorite items:
1. milo | Rating: 3 | Category: com
2. cheese prata | Rating: 10 | Category: utown
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
```
### Sort favorites list in ascending order
Format: `sort asc`

```
> sort asc
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
📊 Favorites sorted in ascending order.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
> view
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
🌟 Your favorite items:
1. milo | Rating: 3 | Category: com
2. cheese prata | Rating: 10 | Category: utown
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
```
## Sort favorites list in descending order
Format: `sort desc`

```
> sort desc
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
📊 Favorites sorted in descending order.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
> view
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
🌟 Your favorite items:
1. cheese prata | Rating: 10 | Category: utown
2. milo | Rating: 3 | Category: com
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
```
### Search for your favorite item
Format: `search X`

```
> search milo
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
🔎 Search results for 'milo':
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
milo | Rating: 3 | Category: com
milo | Rating: 8 | Category: deck
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
```
### Undo any accidental remove commands
Format: `Undo`

```
> undo 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
🔄 Restored: milo | Rating: 8 | Category: deck
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
```
### Exit favorites tracker
Format: `exit`

```
> exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
👋 Exiting Favorites Tracker.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
```





## FAQ

**Q**: How do I transfer my data to another computer? 

**A**: {your answer here}

## Command Summary

{Give a 'cheat sheet' of commands here}

### Main Application

| Feature                 | Command          |
|-------------------------|------------------|
| Enter Canteen feature   | `canteen` or `c` |
| Enter budget tracker    | `budget`         |
| Enter favorites manager | `favorites`      |
| Exit chatbot            | `bye`            |
___

### Canteen feature (main)

| Feature              | Command         |
|----------------------|-----------------|
| Enter Canteen finder | `finder` or `f` |
| Enter Canteen lookup | `lookup` or `l` |
| Exit Canteen         | `quit` or `q`   |

#### Canteen finder

| Feature                          | Command                                                                                     | Example |
|----------------------------------|---------------------------------------------------------------------------------------------|---------|
| Specify desired canteen criteria | `criteria 1, criteria 2`<br/> (halal certified/hc, muslim owned/mo, vegetarian/v, aircon/a) | `hc,a`  |
| Enter location of user           | `FACULTY` or `HOSTEL` or  `KEY BUILDINGS`                                                   | `soc`   |
| Exit Canteen Finder              | `exit` or `e`                                                                               | `e`     |

#### Canteen lookup

| Feature                | Command                                                                         | Example |
|------------------------|---------------------------------------------------------------------------------|---------|
| View stalls in canteen | `CANTEEN NAME`<br/> (techno, terrace, frontier, deck, fine food, flavours, pgp) | `deck`  |
| Exit Canteen Lookup    | `exit` or `e`                                                                   | `e`     |

___
### Budget tracker

| Feature                    | Command         |
|----------------------------|-----------------|
| Add funds to weekly budget | `add AMOUNT`    |
| Record expenses            | `deduct AMOUNT` |
| View expenses & budget     | `view`          |
| Exit Budget                | `exit`          |

___
### Favorites tracker 

| Feature          | Command                                     |
|------------------|---------------------------------------------|
| Add favorites    | `add <description> : <rating> : <location>` |
| Remove favorites | `remove N`                                  |
| View favorites   | `view`                                      |
| Sort ascending   | `sort asc`                                  |
| Sort descending  | `sort desc`                                 |
| Search favorites | `search X`                                  |
| Undo Remove      | `undo`                                      |
| Exit favorites   | `exit`                                      |
