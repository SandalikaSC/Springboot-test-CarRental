package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ctrl4")
public class SpringController4 {
//how narrow down a request using path variables
//    path variables - path patterns

//   ? Match one Character
//    @GetMapping(path = "/a??/b?")
//    public String getMethod1() {
//        return "GET METHOD ONE";
//    }

//    //    * Matcher 0 or more characters in a path segment
//    @GetMapping(path = "/b*/c*")
//    public String getMethod2() {
//        return "GET METHOD TWO";
//    }
//
//    fddd/d/ieieeje
//    @GetMapping(path = "/f*/d/*")
//    public String getMethod3() {
//        return "GET METHOD TWO";
//    }


//    ** Matches zero or more path segments until the end of path
//    c1/aaa/bbb/cccccc/c2
//    @GetMapping(path = "/c1/**/c2")
//    public String getMethod3() {
//        return "GET METHOD TWO";
//    }
//
//    @GetMapping(path = "/c2/**")
//    public String getMethod4() {
//        return "GET METHOD TWO";
//    }


    // we can use  reg-expressions to validate path variables
    @GetMapping(path = "/{id:[a-zA-Z]{4}}")
    public String getMethod4(@PathVariable String id) {
        return "GET METHOD TWO " + id;
    }


}
