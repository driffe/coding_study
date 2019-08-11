package July13;

public class study {
    public static void main(String[] args) {
        String name = "Sechang";


//        char data[] = {'a', 'b', 'c'};
//        String str2 = new String(data);

        /*

        STRING
            concat()
                input: String
                output: String
            equals()
                input: String
                output: boolean
            equalsIgnoreCase()
                input: String
                output: boolean
            charAt()
                input: int
                output: String
            toLowerCase()
                input: VOID
                output: String
            toUpperCase()
                input: VOID
                output: String
            contains()
                input: String
                output: boolean
            isEmpty()
                input: VOID
                output: boolean
            split()
                input: String
                output: Array<String>
            substring()
                input: int
                output: String
            substring()
                input: int, int
                output: String
         */

        System.out.println("Hello " + name);



        String greetings = "Hello " + name;
        String hello = "Hello ";
        String greetings2 = hello.concat(name);
        String greetings3 = "Hello ".concat(name);
        System.out.println(greetings3);


        System.out.println(greetings3.charAt(0));
        System.out.println(greetings3.charAt(greetings3.length()-1));

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println(name.charAt(i));
        }

        System.out.println(name.equalsIgnoreCase("sechang"));
        System.out.println(name.toLowerCase().equals("SECHANG".toLowerCase()));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String names = "Alex,Albert,Sechang";
        String namesArr[] = names.split(",");
        for(int i = 0; i < namesArr.length; i++) {
            System.out.println(namesArr[i]);
        }


        String example = "SECHANG";
        System.out.println(example.substring(3));

        System.out.println(example.substring(1, 3));


        String model = "IPHONE6";
        model.toLowerCase();

        System.out.println(model);
        System.out.println(model.charAt(6));

        System.out.println(model.substring(0, 6));

        String newModel = model.substring(0, 6).concat("7");

        System.out.println(model);
        System.out.println(newModel);


        /*

        1) reverse a given string.

        2) split the given string in half and return a string with the halves in reverse order.
            input: "12345678"
            output: "56781234"

            input: "12345"
            output: "34512" or "45123"

        3) given a string, print all characters in odd index in order.
            input: "abcdefg"
            output: "bdf"

        4) Given two strings, return true if two strings are equal. (ignore case)

        5) Given a list of names, return the third name.
            input "aaa,bbb,ccc,ddd,eee"
            output: "ccc"

        6) Given a string, return the string without the last character.
            input: "abcd"
            output: "abc"

        7) Given a noun, return the plural form of the noun. (by adding 's' or 'es')
            input: "apple"
            output: "apples"

            input: "potato"
            output: potatoes"

        8) Given a verb, return the past tense of the verb. (by adding 'ed')
            input: "cut"
            output: "cuted"


        9) Given a word, return the number of vowels
            input: "apple"
            output: 2

        10) Given a word with even length, split the word in half and insert " & " in-between.
            input: "abcd"
            output: "ab & cd"

        11) Given a sentence, return total number of words in the sentence.
            input: "I am a boy"
            output: 4

        12) Given a sentence, return a sentence with all the words in reverse order.
            input: "I am a boy"
            output: "boy a am I"

         */
    }
}
