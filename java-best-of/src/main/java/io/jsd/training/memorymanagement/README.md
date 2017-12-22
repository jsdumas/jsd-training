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

#GENERATIONAL GARBAGE COLLECTION
Most objects don't live for long
If an object survives it is likely to live forever
The heap is devided in two parts : Young objects and old objects
new objects are created in young objects
GC sweet quickly young objects
surviving objects are copied into old objects
sweet is longer for old objects

#JDK
jdk/bin/jvisualvm.exe
File Dump

#MEMORY ANALYZER
http://www.eclipse.org/mat
File/Open Heap Dump

#PermGem (into the heap)
it is never carbage collected

#metaSpace
