import java.io.Console;

public class mario {

  public static void main(String[] args)
  {
    int height;
    
    do
    {
      System.out.println("Height: ");
      height = parseInt(System.console().readLine("Height: "));
      
    
    } while ((height<0) || (height>23));
    
    for( int y = 0; y < height; y++) 
    {
        for ( int x = height ; x > 0; x--)
        {   
            if ((x-1)>y)
            { 
                System.out.println(" ");
            }
            else
            {
                System.out.println("#");
            }
        }
        System.out.println("#\n");   
    } 
  }

}
