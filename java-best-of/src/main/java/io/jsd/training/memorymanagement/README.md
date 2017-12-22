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


##Weak and soft references
#WeakReference<Book> myBook = book1;
Les weaks references n'existent pas au niveau du langage et nécessitent donc l'emploi d'une classe particulière intitulée java.lang.ref.WeakReference. Ces références se distinguent des hard references par le fait que l'objet auquel elles font référence est automatiquement libéré si toutes les références à ce dernier sont des weak references.
Une weak reference encapsule l'objet à référencer que nous pouvons récupérer en invoquant la méthode get(). Puisque les objets ainsi référencés peuvent être libérés à tout moment par le garbage collector, nous devons vérifier qu'ils n'ont pas disparus avant de nous en servir. Cela force également le programmeur à obtenir une hard reference vers l'objet pour empêcher le garbage collector de le supprimer alors que nous désirons nous en servir. En pratique, une liste de weak references peut aisément être maintenue en utilisant la collection java.util.WeakHashMap. Il ne s'agit pas d'une liste à proprement parler mais son usage peut être détourné à cet effet.

#SoftReference<Book> myBook = book2;
La troisième sorte de référence que nous allons étudier est intitulée soft reference. A l'instar des weak references, cette référence n'existe pas dans le langage Java. Nous devons donc utiliser la classe java.lang.ref.SoftReference. Les soft references sont très utilisées pour gérer des grands ensembles de données en mémoire sans provoquer d'utilisation abusive des ressources systèmes ni obliger l'utilisateur à augmenter la taille du heap de la JVM. Ces références sont donc utilisées pour créer des caches. Un objet référencé uniquement par des softs references est libéré si la JVM a besoin de mémoire (par exemple juste avant qu'une OutOfMemoryError ne survienne). De fait, vous devez utiliser des soft references pour référencer des données que vous pouvez aisément recharger.

Imaginez une application similaire à Google Maps qui affiche une carte du monde découpée en tiles (carrés de taille fixe). Pour accélérer le déplacement sur la carte, les tiles sont conservés en mémoire. Conserver tous les tiles serait irréaliste puisque l'ensemble complet des données occuperaient des Go en RAM et conduirait très rapidement à une occupation complète de la mémoire. Pour pallier ce problème il suffit d'utiliser des soft references


Comme vous le constatez, l'API de SoftReference est en tout point semblable à celle de WeakReference. Avec le code ci-dessus, l'application se débarrasse des encombrantes images représentant chaque morceau de la carte dès que la JVM a besoin de libérer de la mémoire. L'application continue cependant à fonctionner puisque les données remontent en mémoire lorsqu'un accès est réalisé. Les soft references sont généralement combinées aux hard references pour maintenir constamment en mémoire les données les plus susceptibles d'être requises. Dans le cas d'une carte du monde nous garderions des hard references vers tous les tiles situés dans la vue courante pour garantir un affichage rapide. Je montrerai très probablement un exemple concret d'utilisation des softs references après JavaOne. Nous avons récemment utilisé cette technique pour une démo gourmande en mémoire.

L'API Java contient une quatrième sorte de référence, les PhantomReference dont l'utilité est beaucoup plus limitée. 

#WeakHashMap<K,V>
Map<Book,BookImage> imageCache = WeakHashMap<Book,BookImage>();

#Apache Jmeter