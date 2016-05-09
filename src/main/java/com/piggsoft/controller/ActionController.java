package com.piggsoft.controller;

import com.piggsoft.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br>Created by fire pigg on 2016/5/9.
 *
 * @author piggsoft@163.com
 */
@RestController
@RequestMapping("/action")
public class ActionController {

    @Autowired
    private ActionService actionService;

    @RequestMapping("/type/list")
    public Object actionTypeList() {
        return actionService.getActionType();
    }
    @RequestMapping("/add")
    public Object add(String actionType, Integer babyId) {
        actionService.addAction(babyId, actionType);
        return null;
    }

}
