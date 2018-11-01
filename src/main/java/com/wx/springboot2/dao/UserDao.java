package com.wx.springboot2.dao;

import com.wx.springboot2.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/*
  测试jpa的数据访问层
    //JpaRepository提供提供的简单数据操作接口
    //JpaSpecificationExecutor提供复杂查询接口
 */
public interface UserDao extends JpaRepository<User,Integer>,JpaSpecificationExecutor<User>,Serializable {
}
