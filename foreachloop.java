// foreachloop 

// It Also Known As Enchanced For Loop

// It Simplifies Iterating Over Arrays And 
// Collection  By Automatically Handling The 
// Iteration Process Without Needing Explict 
// Index Control , Offering Cleaner Syntax And 
// Reducing Potential Errors
class demo {
    public static void main (String args[])
    {
        int num[] = {63,48,96,47};
        for(int i : num ){             // integer array
            System.out.println(i);
        } 
        System.out.println();
        String fruits[]={"Apple","Orange","Bannana","Straw"};
        for (String a: fruits){         // String array
            System.out.println(a);
        }
    }
    
}