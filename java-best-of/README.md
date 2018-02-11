# JAVA DEV PRACTICE

####################
## OOP PRINCIPLES
####################

### ABSTRACTION

### ECAPSULATION

### POLYMORPHISM

### TELL, DON'T ASK
This principle states that instead of asking (ask) an object for information to exploit, 
it is better to say (tell) to this object what to do and it will do it itself.

### DRY
Don't Repeat Yourself

### KISS
Keep it Stupid-Simple

### YAGNI
You ain't Gonna Need It

### LAW OF DEMETER
We trust only his friends, not the friends of his friends.

### MoSCcoW Method

##########
## SOLID
##########

#### Single Responsibility Principle : 
A class, function or method must have one and only one responsibility
Avoid God Class and God Method

#### Open/closed principle :
A class must be open to extension, but closed to modification

#### Liskov substitution Principle 
An instance of type T should be replaced by an instance of type G, such as G subtype of T, without modifying the coherence of the program
A Square Which extends A Rectangle can not be tested like a Rectangle because of its height/weight properties
In this case Liskov substitution principle is broken
![liskov](/target/liskov.bmp)

#### Interface segregation principle 
Prefer multiple specific interfaces for each client rather than one general interface

#### Dependency Inversion Principle


#########
## LINKS
#########

* [POO introduction](http://www.codeproject.com/Articles/22769/Introduction-to-Object-Oriented-Programming-Concep)
* [SOLID principle](http://williamdurand.fr/2013/07/30/from-stupid-to-solid-code/)
* [Java documentation official](http://docs.oracle.com/javase/tutorial/java/concepts/index.html)
* [TDD general introduction](https://technologyconversations.com/2013/12/24/test-driven-development-tdd-best-practices-using-java-examples-2/)
* [TDD 3 rules](http://www.butunclebob.com/ArticleS.UncleBob.TheThreeRulesOfTdd)
* [FIRST principle](http://agileinaflash.blogspot.fr/2009/02/first.html)

