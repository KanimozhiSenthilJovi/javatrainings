public class ArrayLucky {
	static boolean ArLucky(int n) 
    { 
        
        boolean arr[]=new boolean[10]; 
        for (int i = 0; i < 10; i++) 
            arr[i] = false; 
        while (n > 0) 
        { 
            int digit = n % 10; 
            if (arr[digit]) 
            return false; 
               arr[digit] = true; 
               n = n / 10; 
        } 
        return true; 
    }          
    public static void main (String[] args) 
    { 
    int arr[] = {9698, 142, 388, 9941, 334, 59, 9}; 
        int n = arr.length; 
      
        for (int i = 0; i < n; i++) 
            if(ArLucky(arr[i])) 
                System.out.print(arr[i] + " is Lucky \n"); 
            else
            System.out.print(arr[i] + " is not Lucky \n"); 
    } 

}
