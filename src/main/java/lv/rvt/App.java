package lv.rvt;

import java.util.*;
import java.io.*;

public class App {
    public static void main ( String[] args )
    {
       Box box = new  Box( 2.5, 5.0, 6.0 ) ;
       Box newBox = new  Box( box ) ;
       System.out.println( "length: " + newBox.length() + " height: " + newBox.width() +
                         "width:  " + newBox.height() )  ;
  
    }
}
