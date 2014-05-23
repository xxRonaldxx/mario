import java.io.Console;

public class Mario {
  public static void main(String[] args)
  {
    int height;
    Console c = System.console();
    do
    {
      System.out.println("Height: ");
      String height = c.readLine("Height: ");
      
    
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
