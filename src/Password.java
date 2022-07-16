public class Password {



    public boolean checkpass(String s) {

        if(lengthof(s)>5 && sc(s)==true && upper(s) > 2 && lower(s) > 3 && digit(s) > 0){
            System.out.println("Valid password");
            return true;
        } else {
            System.out.println("Invalid password");

            return false;
        }


    }



    public int lengthof(String s){


        return s.length();

    }

    public boolean sc(String s){


        StringBuilder k = new StringBuilder("=!@#$%^&*()-+?_=,<>/");

        int x=0;

        char r[]=s.toCharArray();

        for(int s1=0;s1 < r.length;++s1){

            char ch = r[s1];



           if(r.toString().contains(String.valueOf(ch))){

               return true;
           }


        }

        return false;
    }

    public int upper(String s){
        int x=0;

        char r[]=s.toCharArray();

        for(int s1=0;s1 < r.length;++s1){

            char ch = r[s1];

            if(Character.isUpperCase(ch)){
                x++;

            }


        }

        return x;
    }



    public int lower(String s){
        int x=0;

        char r[]=s.toCharArray();

        for(int s1=0;s1 < r.length;++s1){

            char ch = r[s1];

            if(Character.isLowerCase(ch)){
                x++;

            }


        }

        return x;
    }



    public int digit(String s){
        int x=0;

        char r[]=s.toCharArray();

        for(int s1=0;s1 < r.length;++s1){

            char ch = r[s1];

            if(Character.isDigit(ch)){
                x++;

            }


        }

        return x;
    }

}
