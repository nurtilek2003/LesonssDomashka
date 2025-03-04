import java.time.LocalDate;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coustomer coustomer =new Coustomer(1L,"Junusbek","Junusbek.gmail.com", LocalDate.of(2025,4,2),"9969690690");
        Coustomer coustomer1 =new Coustomer(2L,"Adilet","Adilet.gmail.com", LocalDate.of(2025,3,10),"9969690690");
        Coustomer coustomer2 =new Coustomer(3L,"Baiel","Baiel.gmail.com", LocalDate.of(2025,7,1),"9969690690");

//        Coustomer coustemrs = new Coustomer(new Coustomer{coustemrs,coustomer1,coustomer2});
        Coustomer[] coustomers = {coustomer1,coustomer2,coustomer};

        for (Coustomer c : coustomers) {
            System.out.println(c);
        }
        coustomer1.updateCoustomerByid(1L,new Coustomer());
        coustomer1.deleteById(1L);




    }
}