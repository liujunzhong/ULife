package com.ncu.base.service;

import com.ncu.base.entity.Label;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LabelService {
    void createLabel(Label label);

    void deleteLabel(String id);

    void updateLabel(Label label);

    List<Label> selectAllLabel();

}
