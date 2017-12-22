#LAMBDA
Le problème

En Java, il n’existe que deux types de références : des références vers des valeurs primitives, et des références vers des instances d’objets.

Dans d’autres langages (Groovy, Scala, Haskell…), il est également possible d’établir des références vers des closures, c’est-à-dire des blocs de code anonymes.
Une référence de ce type peut alors, comme toutes les autres, être utilisée en tant que champ d’une classe ou en paramètre d’une méthode.

Ce dernier usage est très répandu dans les langages fonctionnels (ou « orientés fonctionnel »). 
En particulier,la possibilité de passer une fonction en argument d’une autre permet leur composition, favorise leur découpage atomique, simplifie leur test, et améliore leur réutilisabilité.

En Java, qui ne dispose pas de cette facilité, la technique qui s’en rapproche le plus consiste à définir une interface décrivant la fonctionnalité souhaitée, puis à instancier une classe (souvent anonyme) implémentant la fonctionnalité. 
L’instance obtenue peut alors être affectée à une référence et/ou être passée en paramètre d’une méthode.

Mais cette façon de faire est très verbeuse, comme nous allons nous en rendre compte à l’aide de l’exemple suivant.

Comparaison Groovy / Java

Nous souhaitons afficher tous les éléments d’une liste qui satisfont un certain critère arbitraire. La méthode d’affichage étant générique, il est nécessaire de lui passer en paramètre l’algorithme de filtrage.

Comparons les implémentations en Groovy, qui dispose des closures, et en Java, qui n’en dispose pas (encore).

Groovy :
```groovy
def names = ["un", "deux", "trois", "quatre"]
 
// names : la collection
// filter : l'algorithme de filtrage
def printNames(names, filter) {
    println names.findAll(filter)
}
 
// Critère de filtrage, sous forme de closure
// On ne conserve que les noms courts (5 caractères max)
def isShortName = {name -> name.size() <= 5}
 
printNames (names, isShortName)
```
	
La syntaxe est claire et lisible. 
Notez la façon dont un bloc de code anonyme (closure) est directement affecté à la référence isShortName, puis passé en paramètre de la méthode printNames().

Maintenant, en Java :
```java 
    // Encapsule la définition de la méthode implémentant le critère de sélection
    private interface Predicate<T> {
        public boolean keep(T element);
    }
 
    public static <T> void printNames(List<T> elements, Predicate<T> filter) {
        for (T elt : elements) {
            if (filter.keep(elt)) {
                System.out.println(elt);
            }
        }
    }
 
    public static void main(String[] args) {
 
        List<String> names = Arrays.asList("un", "deux", "trois", "quatre");
 
        // Critère de sélection, sous forme de classe anonyme
        Predicate<String> isShortName = new Predicate<String>() {
            @Override
            public boolean keep(String element) {
                // La seule ligne réellement utile !
                return element.length() <= 5;
            }
        };
 
        printNames(names, isShortName);
    }
}
```java

Les Lambda en Java 8
Domaine d’application

Sous la pression des langages « alternatifs » et de la communauté Java, Oracle s’est enfin décidé à intégrer les closures dans le langage.

Enfin… pas tout à fait.
Pour des raisons de rétrocompatibilité avec le type-system existant, Java 8 limitera sévèrement leur domaine d’application. 
Les closures ne serviront en réalité qu’à simplifier l’implémentation et l’utilisation des « Interfaces SAM » (« Single Abstract Method ») ou « Interfaces fonctionnelles », c’est-à-dire les interfaces ne définissant qu’une seule méthode[1].

Certes, ces interfaces sont nombreuses en Java : Runnable, Callable, Comparator, ActionListener… Et de nombreux frameworks orientés événements (en particulier les frameworks graphiques comme Swing ou GWT) les utilisent pour déclarer des callbacks.
Mais tout de même, on est loin de la souplesse et de la puissance des closures présentes dans les autres langages.

Sous le capot

A la compilation, les closures sont tout simplement compilées sous la forme de simples classes anonymes.

Syntaxe

Une closure peut se concevoir comme une méthode anonyme. A ce titre, elle peut accepter des paramètres et retourner un résultat.

Après moult tergiversations et guerres des tranchées sur la mailing-list dédiée, la syntaxe retenue est inspirée de celle de C#[2]. Elle peut prendre deux formes :

(paramètres) -> expression_simple

(paramètres) -> { bloc_d'instructions }

Exemples :
 ```java 
(int x) -> x * 2                           #1
(int x) -> { return x * 2; }               #2
(String s) -> { System.out.println(s); }   #3
() -> 42                                   #4
 ```
 

Explications :

La première expression prend un paramètre x de type int, et renvoie le double de sa valeur. Notez l’absence du mot-clé return : la valeur de l’expression est automatiquement renvoyée.

La seconde est une variante de la première, qui utilise un bloc d’instructions. Cette fois, le mot-clé return est nécessaire.

La troisième expression accepte un paramètre de type String mais ne renvoie rien.

Enfin, la quatrième expression ne prend aucun paramètre, et renvoie la constante 42.
Syntaxe simplifiée