import java.io.Console;

public class mario {

  public static void main(String[] args) {
    int height;
    
    do{
      height = Integer.parseInt(System.console().readLine("Height: "));  
    } while ((height<0) || (height>23));
    
    StringBuilder sb = new StringBuilder();
    
    for( int y = 0; y < height; y++) {
      for ( int x = height ; x > 0; x--) {   
        if ((x-1)>y) { 
          sb.append(" ");
        }
        else {
          sb.append("#");
        }
      }
      sb.append("#\n");   
    }
    System.out.print(sb);
  }
}

