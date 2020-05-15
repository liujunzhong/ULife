package com.ncu.base.service.impl;

import com.ncu.base.dao.LabelDao;
import com.ncu.base.entity.Label;
import com.ncu.base.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LabelServiceImpl implements LabelService {

    @Autowired
    LabelDao labelDao;

    @Override
    public void createLabel(Label label) {
        labelDao.createLabel(label);
    }

    @Override
    public void deleteLabel(String id) {
        labelDao.deleteLabel(id);
    }

    @Override
    public void updateLabel(Label label) {
        label.setGmtUpdated(new Date());
        labelDao.updateLabel(label);
    }

    @Override
    public List<Label> selectAllLabel() {
        return labelDao.selectAllLabel();
    }
}
