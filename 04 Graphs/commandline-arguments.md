Command line arguments in Java are given to the main functcion.

```java
public class Woot {

    public static void main(String[] args) {
        System.out.println("There were " + args.length + " arguments.");

        System.out.println("They were:");
        for (String arg : args) {
            System.out.println("  - " + arg);
        }
    }

}
```
