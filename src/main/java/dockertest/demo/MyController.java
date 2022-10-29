package dockertest.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {

//    @Autowired
//    FruitRepi fruitRepi;
    @GetMapping("/test")
    public String test(){
        return  "hello world";
    }
//
//    @GetMapping("/create")
//    public String create(@RequestParam Optional<String> name, @RequestParam Optional<Integer> price){
//        if(name.isPresent() && price.isPresent()){
//            fruitRepi.save(new Fruit(name.get(), price.get()));
//            return "created";
//        }
//        return "not created";
//    }
//
//    @GetMapping("/load")
//    public List<Fruit> load(){
//        return fruitRepi.findAll();
//    }

}
