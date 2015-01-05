package main;

import dao.Search;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Service;

import java.util.Iterator;
import java.util.List;

/**
 * Created by baeonejune on 15. 1. 5..
 */
public class AppsTest {
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-config.xml");
        Service service = (Service) cxt.getBean("service");

        /////////////////////////////////////////////////////
        List<Search> searches = service.selectAllDatas();
        Iterator iterator = searches.iterator();
        while (iterator.hasNext()) {
            Search search = (Search)iterator.next();
            System.out.println(String.format("%d:%s",search.getId(), search.getProductName()));
        }
        System.out.println("-> "+searches+"\n");

        /////////////////////////////////////////////////////
        Search search = service.selectDataOne(1001);
        System.out.println(String.format("%d:%s", search.getId(), search.getProductName()));

        /*
        System.out.println("service.insertPerson(person)");
        person.setName("Inserted person");
        service.insertPerson(person);
        System.out.println("-> inserted..."+"\n");
        */

        System.out.println("List<Search> persons = service.selectAllPerson()");
        searches = service.selectAllDatas2();
        System.out.println("-> "+searches+"\n");

        System.out.println("end!!");
    }
}
