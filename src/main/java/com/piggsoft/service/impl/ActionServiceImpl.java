package com.piggsoft.service.impl;

import com.piggsoft.constants.Constants;
import com.piggsoft.model.Action;
import com.piggsoft.service.ActionService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by zxshen2 on 2016/5/6.
 */
@Service
public class ActionServiceImpl extends BaseServiceImpl<Action> implements ActionService {

    @Override
    public void addAction(Integer babyId, String actionType) {
        Action action = new Action();
        action.setActionTm(new Date());
        action.setActionType(actionType);
        action.setBabyId(babyId);
        super.save(action);
    }

    public String[] getActionType() {
        return Constants.ACTION_TYPE;
    }

}
