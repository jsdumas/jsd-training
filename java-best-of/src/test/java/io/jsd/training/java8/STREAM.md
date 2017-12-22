#STREAM

Jusqu’à présent, effectuer des traitements sur des Collections ou des tableaux (de type MapReduce) en Java passait essentiellement par l’utilisation du pattern Iterator. Java 8 nous propose l’API Stream pour simplifier ces traitements en introduisant un nouvel objet, Stream.

Un stream se construit à partir d’une source de données (une collection, un tableau ou des sources I/O par exemple), et possède un certain nombre de propriétés spécifiques :

Un stream ne stocke pas de données, contrairement à une collection. 
Il se contente de les transférer d’une source vers une suite d’opérations.
Un stream ne modifie pas les données de la source sur laquelle il est construit. 
S’il doit modifier des données pour les réutiliser, il va construire un nouveau stream à partir du stream initial. 
Ce point est très important pour garder une cohérence lors de la parallélisation du traitement.
Le chargement des données pour des opérations sur un stream s’effectue de façon lazy. 
Cela permet d’optimiser les performances de nos applications. 
Par exemple, si l’on recherche dans un stream de chaînes de caractères une chaîne correspondant à un certain pattern, cela nous permettra de ne charger que les éléments nécessaires pour trouver une chaîne qui conviendrait, et le reste des données n’aura alors pas à être chargé.
Un stream peut ne pas être borné, contrairement aux collections. 
Il faudra cependant veiller à ce que nos opérations se terminent en un temps fini – par exemple avec des méthodes comme limit(n) ou findFirst( ).
Enfin, un stream n’est pas réutilisable. 
Une fois qu’il a été parcouru, si l’on veut réutiliser les données de la source sur laquelle il avait été construit, nous serons obligés de reconstruire un nouveau stream sur cette même source.

Il existe deux types d’opérations que l’on peut effectuer sur un stream : les opérations intermédiaires et les opérations terminales.

Les opérations intermédiaires (Stream.map ou Stream.filter par exemple) sont effectuées de façon lazy et renvoient un nouveau stream, ce qui crée une succession de streams que l’on appelle stream pipelines. 
Tant qu’aucune opération terminale n’aura été appelée sur un stream pipelines, les opérations intermédiaires ne seront pas réellement effectuées.

Quand une opération terminale sera appelée (Stream.reduce ou Stream.collect par exemple), on va alors traverser tous les streams créés par les opérations intermédiaires, appliquer les différentes opérations aux données puis ajouter l’opération terminale. 
Dès lors, tous les streams seront dit consommés, ils seront détruits et ne pourront plus être utilisés.

##Création d’un stream

On peut créer un stream de plusieurs façons. La plus simple consiste à appeler la méthode stream() ou parallelStream() sur une collection, mais un certain nombre de méthodes ont été ajoutées aux classes déjà existantes.

Notons ainsi la méthode chars() de la classe String, qui renvoie un IntStream construit sur les différents caractères de la chaîne de caractères, ou encore la méthode lines() de la classe BufferedReader qui crée un stream de chaînes de caractères à partir des lignes du fichier ouvert. 
À la classe Random s’ajoute aussi une méthode intéressante, ints(), qui renvoie un stream d’entiers pseudo aléatoires.

L’API propose également des méthodes statiques au sein de la classe Stream. Par exemple, le code suivant : “Stream.iterate(1, x -> x*2)” renverra un stream infini d’entiers contenant la suite des puissances de 2. Le premier argument contient la valeur initiale du stream, et le deuxième la fonction permettant de passer de l’élément n à l’élément n+1 dans le stream.

#Parallélisation

L’un des points forts de cette nouvelle API est de nous permettre de paralléliser nos traitements de façon particulièrement aisée. En effet, n’importe quel stream peut être parallélisé en appelant sa méthode parallel() héritée de l’interface BaseStream – de la même façon, un stream peut être rendu séquentiel en invoquant la méthode sequential(). On peut également construire un stream parallèle sur une collection directement en appelant la méthode parallelStream() sur cette collection.

Ces méthodes nous permettent de masquer la répartition du travail, mais ne doivent pas être prises à la légère : en essayant de gagner en performance en parallélisant n’importe quel traitement, on prend le risque de produire l’effet inverse (nous y reviendrons plus tard).