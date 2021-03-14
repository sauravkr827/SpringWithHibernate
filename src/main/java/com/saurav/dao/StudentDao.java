package com.saurav.dao;

import com.saurav.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

public class StudentDao {

    @Autowired
    HibernateTemplate hibernateTemplate;

    @Transactional
    public int save (Student student)
    {
        int noOfRowEffected=(Integer) hibernateTemplate.save(student);
      return noOfRowEffected;
    }


    public List<Student> getAll()
    {

        List<Student> students=  hibernateTemplate.loadAll(Student.class);

    return  students;
    }
}
