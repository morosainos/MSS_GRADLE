package com.maritime.services.impl;

import com.maritime.dao.StudentMapper;
import com.maritime.dao.TeacherMapper;
import com.maritime.models.Student;
import com.maritime.models.Teacher;
import com.maritime.services.StudentService;
import com.maritime.services.TeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;


@Transactional(rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED, timeout = 30)
@Service("student")
public class StudentServiceImpl extends BaseServiceImp implements StudentService {

	/**
	 * LOGGER
	 */
	private static final Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);

	@Autowired
	private StudentMapper studentMapper;


    @Override
    public Student selectByAccount(Long snumber) {
        return studentMapper.selectByAccount(snumber);
    }
}