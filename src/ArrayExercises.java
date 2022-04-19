public class ArrayExercises {
    public static void main(String[] args) {

        String[] persons = {"person1", "person2", "person3"};
        System.out.println("Original Array");
        printArr(persons); /*CALLING OLD ARR*/

        System.out.println("------------------------------");

        persons = addPerson(persons);
        System.out.println("New Array");
        printArr(persons);/*CALLING NEW ARR*/
    }


//    *****************EXERCISE 1.**********************

//    --------PRINTS OLD AND NEW ARRAY TO CONSOLE-------------
    public static void printArr(String[] persons){
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }

    //--------------ADD ONE ADDITIONAL PERSON TO THE ARRAY--------------
    public static String[] addPerson(String[] persons) {

        // ---------MAKE NEW ARR WITH WITH ADDITIONAL SLOT FOR NEW PERSON-----------
        String[] newPersonsArr = new String[persons.length + 1];

        //        ----------COPY CONTENTS OF OLD ARR-----------
        for (int i = 0; i < persons.length; i++) {
            newPersonsArr[i] = persons[i];
        }

        //        ----------CREATE NEW STRING PERSON------------
        String newPerson = "person4";

        //        -----------ASSIGN NEW STRING PERSON TO LAST ELEMENT IN ARR------------
        newPersonsArr[newPersonsArr.length-1] = newPerson;

        //        ---------RETURN NEW ARR-----------
        return newPersonsArr;
    }
}

//    *****************EXERCISE 2.**********************
//    Located on "ServerNameGenerator"


