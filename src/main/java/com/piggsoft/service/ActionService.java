package com.piggsoft.service;

/**
 * Created by zxshen2 on 2016/5/6.
 */
public interface ActionService {
    void addAction(Integer babyId, String actionType);

    String[] getActionType();
}
