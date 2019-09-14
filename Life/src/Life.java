/***************************************************
// Life.java
//
//
/
/* Author: Jesse Eldell
* Submission Date: March 28th
*
* Purpose: This program is attached to my Grid.jar file. I am suppose to make a grid
* using what i know about classes and methods. I will create grid objects and I will be
* able to set and retrieve cell values in the grid
*
* 
*/
//*******************************************************

import java.util.Random;

public class Life
{

	public static void main(String[] args)
	{
		Random r=new Random();
		int gridSize=200;
		int cellSize=3;
		Grid grid=new Grid(gridSize,cellSize,"The Game of Life");
		 /*for (int i=25;i<75;i++)
	     {
		  grid.setPos(row,col++,v);
	     }
	  grid.update();
	  grid.clearGrid();
	*/
		grid.setDelay(10);

	  int aliveColor=3;
	  int deadColor=2;
	                                 // Set cell at (row,col) to value v, where v is a color id (0-11).
	    int row=0;      //void setPos(int row, int col, int v)
	     int col=0;
	     int v=aliveColor;

	  grid.setPos(row,col,v);

	  for(col=0;col<grid.getGridColSize();col++)
	  {
			 for (row=0;row<grid.getGridRowSize();row++)
			 {
		    if  (r.nextInt(200)<49)
			  {
				  grid.setPos(row, col, v);
			  }
			  else
			  {
				  grid.setPos(row, col, deadColor);
			  }
			 }
	  }
	  grid.update();
	  grid.initialize();

	  while (true)
	  {
		  for(int c=0;c<gridSize-1;c++)
		  {
				 for (int ro=0;ro<gridSize-1;ro++)
				 {
			       if (grid.getPos(ro, c)==aliveColor)            //Alive
			       {
			    	 int y=grid.matchingNeighbors(ro, c, v);     //Stores a number in y
			    	 if (!(y==2||y==3))
			    	 {
			    		 grid.setPos(ro, c, deadColor);
			    	 }
			       } // end of checking alive
			       else                                           //Dead
			       {
			    	 int y= grid.matchingNeighbors(ro, c, v);
			    	 if (y==3)
			    	 {
			    		grid.setPos(ro,c,v);
			    	 }
			       } // end of dead

                   } // end of for

		  }
		  grid.update();
	  }


















			 }



	}
