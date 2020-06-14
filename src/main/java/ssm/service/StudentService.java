package ssm.service;

import ssm.model.Student;

public interface StudentService {

    int updateByPrimaryKey(Student rs);

    Student selectByPrimaryKey(Integer id);
}
