package ssm.service.impl;

import org.springframework.stereotype.Service;
import ssm.dao.StudentMapper;
import ssm.model.Student;
import ssm.service.StudentService;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public int updateByPrimaryKey(Student rs) {
        rs.setIsQuit(true);
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        rs.setUpdateTime(sqlDate);
        return studentMapper.updateByPrimaryKey(rs);
    }

    @Override
    public Student selectByPrimaryKey(Integer id) {
        Student st = studentMapper.selectByPrimaryKey(id);
        return st;
    }
}
