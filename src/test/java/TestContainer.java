import com.tangz.springcontainer.Header;
import com.tangz.springcontainer.ScrewDriver;
import com.tangz.springcontainer.StraightHeader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {

    private ApplicationContext context = null;
    private ScrewDriver screwDriver = null;
    private Header header = null;

    @Before
    public void before() throws Exception {
        context = new ClassPathXmlApplicationContext("application-context.xml");
        screwDriver = context.getBean("screwDriver", ScrewDriver.class);
        header = context.getBean("header", StraightHeader.class);
    }

    @After
    public void after() throws Exception {
        ((ConfigurableApplicationContext) context).close();
    }


    @Test
    public void testBean() {
        // System.out.println(header.getInfo());
        // header.doWork();
        screwDriver.use();
    }
}
