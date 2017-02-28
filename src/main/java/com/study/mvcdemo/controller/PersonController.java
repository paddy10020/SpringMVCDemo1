package com.study.mvcdemo.controller;

import com.study.mvcdemo.model.Person;
import com.study.mvcdemo.service.PersonService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by paddy on 2017-2-27.
 */
@Controller
@RequestMapping("/test")
public class PersonController {

    private static org.slf4j.Logger logger = LoggerFactory.getLogger(PersonController.class);

    private PersonService personService;

    @Autowired

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }


    //访问方式/test/person1?num=xxx形式的URL
    @RequestMapping(value = "/person1", method = RequestMethod.GET)
    public String viewPerson1(@RequestParam("num") Integer num, Model model){

//        logger.debug("In viewPerson, num = {}", num);
        System.out.print(num + "\n");
        Person person = personService.getPerson();
          model.addAttribute(person);


        return "TestNum";
    }

    //访问方法/test/person2/xxx形式的URL
    @RequestMapping(value = "/person2/{num}")
    public String viewPerson2(@PathVariable("num") Integer num, Map<String, Object> model){
        System.out.print(num + "\n");
        Person person = personService.getPerson();
        model.put("person", person);

        return "TestNum";
    }

    //访问形式为/test/person3?num=123形式的URL
    //跟person1一样，实现的方法比较古老
    @RequestMapping(value = "/person3")
    public String viewPerson3(HttpServletRequest request){
        Integer num = Integer.valueOf(request.getParameter("num"));
        Person person = personService.getPerson();
        request.setAttribute("person", person);
        return "TestNum";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET, params = "add")
    public String createPerson(){

        return "person_admin/edit";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String doSave(HttpServletRequest request){

        //logger.debug("Info of Person: ");
       // logger.debug(ReflectionToStringBuilder.toString(person));

        System.out.println("Name: " + request.getParameter("name"));
        System.out.println("age: " + request.getParameter("age"));
        System.out.println("sex: " + request.getParameter("sex"));


        //重定向
        return "redirect:person2/123";
        
    }


    //返回json格式数据测试
    @RequestMapping(value = "/{num}", method = RequestMethod.GET)
    public @ResponseBody Person getPersonInJson1(@PathVariable Integer num){
        System.out.print("有url访问了\n");
        return personService.getPerson();
    }

    //返回json格式数据测试
    @RequestMapping(value = "/jsontype/{num}")
    public @ResponseBody ResponseEntity<Person> getPersonInJson2(@PathVariable Integer num){
        Person person = personService.getPerson();
        //返回json格式
        return new ResponseEntity<Person>(person, HttpStatus.OK);
    }

    //json测试页面
    @RequestMapping("/json")
    public String testJson(){
        return "person_json";
    }

}
