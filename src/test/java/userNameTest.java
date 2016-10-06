/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.mycompany.sweng1.student;

/**
 *
 * @author David
 */
public class userNameTest {
    @Test
    public void testUserName(){
       student Student = new student("John Smith", 22, "01/01/1970");
       Student.genUserName();
       String UsrName = Student.getUserName();
       
       assertEquals("JohnSmith22", UsrName);
    }  
}
