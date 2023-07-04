package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter = 0;
        // while `counter` is less than length of array
            // begin loop
        while(counter < personArray.length) {
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            String stringRepresentation = String.valueOf(personArray[counter]);
            // append `stringRepresentation` to `result` variable
            result += stringRepresentation;
            counter++;
        }
            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        int start = 0;
        // identify terminal condition
        int end = personArray.length;
        // identify increment
        int step = 1;

        // use the above clauses to declare for-loop signature
            // begin loop
        for(int i=start; i<end; i+=step) {
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            String stringRepresentation = String.valueOf(personArray[i]);
            // append `stringRepresentation` to `result` variable
            result += stringRepresentation;
        }

            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type  // Person
        // identify array's variable-name // personArray

        // use the above discoveries to declare for-each-loop signature
            // begin loop
        for(Person personName : personArray) {
            // get `string Representation` of `currentPerson`
            String stringRepresentation = String.valueOf(personName);
            // append `stringRepresentation` to `result` variable
            result += stringRepresentation;
        }
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
