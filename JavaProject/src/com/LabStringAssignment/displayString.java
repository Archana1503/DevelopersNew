package com.LabStringAssignment;//s="Rahul Kapil Sharma" //op..R.K.Sharma

class Initials {
    public static void printInitials(String str)//check output
    {
        int len = str.length();
 
        // to remove any leading or trailing spaces
        str = str.trim();
 
        // to store extracted words
        String t = "";
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
 
            if (ch != ' ') {
 
                // forming the word
                t = t + ch;
                System.out.println("i am t"+t);
                
            }
            
 
            // when space is encountered
            // it means the name is completed
            // and thereby extracted
            else {
                // printing the first letter
                // of the name in capital letters
                System.out.print(Character.toUpperCase(t.charAt(0))
                                 + ". ");
                t = "";
            }
        }
 
        String temp = "";
 
        // for the surname, we have to print the entire
        // surname and not just the initial
        // string "t" has the surname now
        for (int j = 0; j < t.length(); j++) {
 
            // first letter of surname in capital letter
            if (j == 0)
                temp = temp + Character.toUpperCase(t.charAt(0));
 
            // rest of the letters in small
            else
                temp = temp + Character.toLowerCase(t.charAt(j));
        }
 
        // printing surname
        System.out.println(temp);
    }
 
    public static void main(String[] args)
    {
        String str = "ishita bhuiya";
        Initials i=new Initials();
       i.printInitials(str);
    }
}