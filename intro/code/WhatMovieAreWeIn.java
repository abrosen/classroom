public class WhatMovieAreWeIn {

    public static void main(String[] args) {

        boolean feelingDead = false;
        boolean hungryForBrains =true;

        if(feelingDead  &&  hungryForBrains  ) {
            System.out.println("Run, we're in a zombie movie");
            System.out.println("Although, we're never actually going to say \"zombie\"");
        } else if ( !feelingDead && hungryForBrains){
            System.out.println("Run faster, we're in one of those weird cannibal movies!");
            System.out.println("Don't eat me, I'm a clown, I'll taste funny!");
        }

    }
}
