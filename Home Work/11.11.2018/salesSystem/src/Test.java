
import com.jubayir.connection.domain.Category;
import com.jubayir.connection.domain.service.CategoryService;


public class Test {
    public static void main(String[] args) {
        //CategoryService.createTable();
   Category c = new Category();
       c.setName("Laptop");
       CategoryService.insert(c);
    }
    
}
