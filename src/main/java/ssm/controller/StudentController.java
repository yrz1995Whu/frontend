package ssm.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.model.Student;
import ssm.service.StudentService;

import javax.annotation.Resource;


@Controller
@RequestMapping("Admin")
public class StudentController {

    @Resource
    private StudentService studentService;

    @ResponseBody
    @RequestMapping(value = "/Test")
    public int upDateById(@RequestBody(required = false) JSONObject param) {
        int id = param.getIntValue("sid");
        System.out.println(id);
        Student student = studentService.selectByPrimaryKey(id);
        int result = studentService.updateByPrimaryKey(student);
        System.out.println(result);
        return result;
    }
}
