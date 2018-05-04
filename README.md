# java-springmvc
Core Detail for SpringMVC


How to use Use Annotations
Controller, Configuration, RequestMapping, ComponentScan

@Controller
@RequestMapping("person")

@RequestMapping(value = "add", method = RequestMethod.POST)

@RequestMapping(value = "add/{id}", method = RequestMethod.POST)
public String addPerson(@RequestParam("name") String name, @PathVariable("id") String id) 


