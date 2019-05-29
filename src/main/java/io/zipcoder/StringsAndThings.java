package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {


    public Integer countYZ(String input){
        int count=0;
       int  space=input.indexOf(" ");
        for(int i=0;i<input.length();i++){
           if(i+1==space)
            if(input.charAt(i)=='y'||input.charAt(i)=='z')
                count++;
        }
        if(input.charAt(input.length()-1)=='y')
            count++;
        if(input.charAt(input.length()-1)=='z')
            count++;
        return count;
    }


    public String removeString(String base, String remove){
       String x= base.replace(remove, "");
        System.out.println(x);
        return x;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        String str []=input.split(" ");
        int x=0,y=0;
        for(int i=0;i<str.length;i++){
            if(str[i].equalsIgnoreCase("is"))
                x++;
            if(str[i].equalsIgnoreCase("not"))
                y++;
        }
        if(x==y)
        return true;
        else
            return false;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){

        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='g'&&input.charAt(i+1)=='g')
                return true;
        }
        return false;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int count=0;
        for(int i=0;i<input.length()-2;i++){
            if(input.charAt(i)==input.charAt(i+1)&&input.charAt(i+1)==input.charAt(i+2))
                count++;
        }
        return count;
    }
}
