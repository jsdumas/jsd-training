#MEMORY MANAGEMENT

##IMMUTABLE WRAPPER

String and wrapper Object like Integer, Long, Double etc... are immutable.

##MEMORY LEAKS

Java avoids memory leaks by :
*Running on a virtual machine
*Adopts a Garbage Collection strategy

##SOFT LEAKS :
an object is referenced on the stack even though it will never be used again.

##GARBAGE COLLECTION
*-The "Mark and Sweep" process

Works in 2 phases :
*mark all live nodes by traversal
*sweep the heap by a linear scan

##GENERATIONAL GARBAGE COLLECTION
Most objects don't live for long
If an object survives it is likely to live forever
The heap is devided in two parts : Young objects and old objects
new objects are created in young objects
GC sweet quickly young objects
surviving objects are copied into old objects
sweet is longer for old objects

##JDK MEMORY TOOL
jdk/bin/jvisualvm.exe
File Dump

##MEMORY ANALYZER
[Memory analyser soft](http://www.eclipse.org/mat)
File/Open Heap Dump

##PermGem (into the heap)
it is never carbage collected

##metaSpace


-----------------------------------------------------------------------------------


##TUNING THE VIRUAL MACHINE (VM arguments)

*-Xmx512m set the maximum heap size at 512M
*-Xms150m set the starting heap size at 150M

*-XX:MaxPermSize=256M set the size of the permgem

*-verbose:gc print to the console when a garbage collection takes place

*-Xmn256m set the size of the young generation

*-XX:HeapDumpOnOutOfMmemory - creates a heap dump file

###Types of collector :
*Serial (single thread) : -XX:+UseSerialGC
*Parallel (multiple thread running) : -XX:+UseParallelGC
*Mostly concurrent : -XX:+UseConcMarkSweepGC
					-XX:+UseG1GC
					
*Use -XX:+PrintCommandLineFlags to find out which is your default

##LINKS
[Garbage collector arguments](http://docs.oracle.com/javase/8/docs/technotes/tools/unix/java.html)
[Garbage collector tuning](http://docs.oracle.com/javase/8/docs/technotes/vm/gctuning/collectors.html)