/**
 * @project ms-a
 * @file SampleController.java
 * @package com.pet.sample.ms_a.controller
 * @date 2017年8月22日下午4:27:54
 * @copyright 民加科风信息技术有限公司 
 *
 */

package com.pet.sample.ms_a.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pet.sample.ms_a.model.Person;

@RestController
@RequestMapping("/v1/info")
public class SampleController {
  
  @GetMapping("/getName")
  public String getName(){
    return "libai";
  }

  @GetMapping("/getDetail")
  public String getDetail(){
    Person person = new Person();
    person.setAge(28);
    person.setName("libai");
    return "libai";
  }
  
}
