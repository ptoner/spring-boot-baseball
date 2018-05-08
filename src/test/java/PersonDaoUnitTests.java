import com.baseball.App;
import com.baseball.dao.interfaces.PersonDao;
import com.baseball.dto.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration("/applicationContext.xml")
public class PersonDaoUnitTests {


    @Autowired
    PersonDao personDao;


    @Test
    public void testCreate() {

        //Arrange
        Person person = new Person();

        person.setFirstName("Pat");
        person.setLastName("Toner");
        person.setHeight(75);
        person.setWeight(675);
        person.setMiddleName("Michael");



        //Act
        Person createdPerson = personDao.create(person);


        //Assert
        assert person.getId() != null;
        assert "Pat".equals(person.getFirstName());
        assert "Toner".equals(person.getLastName());
        assert "Michael".equals(person.getMiddleName());
        assert person.getWeight().equals(675);
        assert person.getHeight().equals(75);





    }




}
