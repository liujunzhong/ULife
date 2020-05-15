package com.ncu.base.dao;

import com.ncu.base.entity.Label;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface LabelDao {

    void createLabel(Label label);

    void deleteLabel(String id);

    void updateLabel(Label label);

    List<Label> selectAllLabel();
}
