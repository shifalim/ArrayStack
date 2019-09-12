package StackTest;


//Behind the Scenes code
public class StackTest
{
    //creating a stack array, of size 5   
    int stack[] = new int[5];
    //making an indexer ( which will let us know where is the top )
    int top = 0;


    //Taking the push method, passing a certain value, and going through the array
    public void push(int data)
    {

        //Take the first index (0), setting to the current valued being passed
        stack[top] = data;
        //Indexing to the next variable
        top++;
    }

    //pop method, which DOES NOT have a void return, which means something is being returned
    public int pop()
    {
        //Grab the most up to data value in the stack ( we want the one before this )
        int data;
        //Minus the indexer of the array by 1
        top--;
        //Make data equal to the wanted indexer value
        data = stack[top];
        //Reset the indexer
        stack[top] = 0;
        //Return the value
        return data;
    }


    //peek method, has a return, lets us see the current index value in the stack
    public int peek()
    {
        //Grab the most up to date value in the stack ( we want the one before this though )
        int data;
        //Minus that by 1, so you can get the last known index value
        data = stack[top-1];

        //return the value
        return data;



    }
    //Show method, to output results to our screen
    public void show()
    {
        //for every int n of the stack array
        for(int n : stack)
        {
            //output
            System.out.print(n + " ");
        }

    }
}

