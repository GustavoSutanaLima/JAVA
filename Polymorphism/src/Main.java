/*
    *** TIP ***
     It is possible to create more than one Class in a single Java file, but if they start to get bigger
     than you've anticipated it, it's probably best to move than to another file;
*/

 /*
    POLYMORPHISM is the ability of an object to take on different forms.
    In Java, polymorphism refers to the ability of a class to provide different implementations
    of a method, depending on the type of object that is passed to the method.

    To put it simply, polymorphism in Java allows us to perform the same action in many
    different ways.
         */

class Movie {
    //field;
    private String name;

    //constructor;
    public Movie (String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here.";
    }
}

class Jaws extends Movie {
        // Just a reminder, when you extend a class in java (the keyword for inheritance)
        // you have to call the main class (or parent class) constructor inside of the
        // child class by using super(), otherwise you're gonna get an error;
        public Jaws () {
            super("Jaws");
        }

    @Override
    public String plot() {
        // return super.plot(); super.plot() would call the plot() method from the parent class
        return "A shark that eats lots of lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Allies attempt to take over of earth";
    }
}

class MazeRunner extends Movie {
    //this class has no fields;

    //this is the class main constructor;
    public MazeRunner () {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars () {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable () {
        super("This movie has no name");
    }
    // no plot method;
}

public class Main {
    public static void main(String[] args) {
       for (int i = 1; i<11; i++) {
           /*
           In the next line I am creating a variable of the type Movie;

           As randomMovie() is method that return a Movie class you can actually
           assign the class Movie to the variable movie by using this method;
            */
           Movie movie = randomMovie();

           System.out.println(movie.plot());
       }
    }

    //what allows me to create a method of the type Movie here is that
    //there's actually a Class with that name;
    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random()*5 + 1);
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1: {
                return new Jaws();
                /* new Jaws() is instantiating a Jaw class here
                    without assigning an object to it; */
            }
            case 2: {
                return new IndependenceDay();
                /*
                   I'm returning instances of Classes which are actually extended
                   from the Movie class, therefore they are also considered
                   Movie classes, otherwise that wouldn't be possible;
                 */
            }
            case 3: {
                return new MazeRunner();
            }
            case 4: {
                return new StarWars();
            }
            case 5: {
                return new Forgetable();
            }
            default: //every other case which is not 1, 2, 3, 4 or 5;
                return null;
        }
    }
}




