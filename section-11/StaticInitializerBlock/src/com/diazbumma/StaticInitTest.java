package com.diazbumma;

public class StaticInitTest {

    public static final String TEST;

    static {
        TEST = "Year 2020";
        System.out.println("Static initializer block called");
    }

    public StaticInitTest() {
        System.out.println("Constructor called");
    }

    static {
        System.out.println("2nd static initializer block called");
    }

    public void sayHappyNewYear() {
        System.out.println("┏━━┓┏━━┓┏━━┓┏━━┓\n" +
                "┗━┓┃┃┏┓┃┗━┓┃┃┏┓┃\n" +
                "┏━┛┃┃┃┃┃┏━┛┃┃┃┃┃\n" +
                "Happy new year 2020!\n" +
                "Let's make another amazing code\n" +
                "┃┏━┛┃┃┃┃┃┏━┛┃┃┃┃\n" +
                "┃┗━┓┃┗┛┃┃┗━┓┃┗┛┃\n" +
                "┗━━┛┗━━┛┗━━┛┗━━┛");
    }
}
