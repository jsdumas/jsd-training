#IMMUTABLE WRAPPER

String and wrapper Object like Integer, Long, Double etc... are immutable.

#MEMORY LEAKS

Java avoids memory leaks by :
-Running on a virtual machine
-Adopts a Garbage Collection strategy

#SOFT LEAKS :
an object is referenced on the stack even though it will never be used again.

#GARBAGE COLLECTION
-The "Mark and Sweep" process
Works in 2 phases :
-mark all live nodes by traversal
-sweep the heap by a linear scan