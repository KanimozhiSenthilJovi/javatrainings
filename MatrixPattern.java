
public class MatrixPattern {
	
	    static void print(int [][] matrix) 
	    { 
	         
	        for (int i = 0; i < matrix.length; i++) 
	        { 
	  
	      	            if (i % 2 == 0) 
	            { 
	                for (int j = 0; j < matrix[0].length; j++) 
	                    System.out.print(matrix[i][j] +" "); 
	  
	  
	            } 
	            else
	            { 
	                for (int j = matrix[0].length - 1; j >= 0; j--) 
	                    System.out.print(matrix[i][j] +" "); 
	            } 
	        } 
	    } 
	  

	    public static void main(String[] args) 
	    { 
	       /*int matrix[][] = new int[][] 
	        { 
	            { 10, 20, 30, 40 }, 
	            { 15, 25, 35, 45 }, 
	            { 27, 29, 37, 48 }, 
	            { 32, 33, 39, 50 } 
	        };*/
	  
	       int matrix[][] = new int[][]
	    		   {
	    	   {1, 2, 3},
	           {4, 5, 6},
	           {7, 8, 9}
	           };
	        print(matrix); 
	    } 
	} 


