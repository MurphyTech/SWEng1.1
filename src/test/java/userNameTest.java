/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.mycompany.sweng1.student;
import org.joda.time.LocalDate;

/**
 *
 * @author David
 */
public class userNameTest {
    @Test
    public void testUserName(){
       student Student = new student();
       Student.setName("John", "Smith");
       Student.setAge(22);
       Student.genUserName();
       String UsrName = Student.getUserName();
       
       assertEquals("JohnSmith22", UsrName);
    }  
}
