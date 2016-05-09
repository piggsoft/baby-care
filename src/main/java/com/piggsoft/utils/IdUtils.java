package com.piggsoft.utils;

import java.util.UUID;

/**
 * <br>Created by fire pigg on 2016/5/9.
 *
 * @author piggsoft@163.com
 */
public class IdUtils {

    public static String generateId() {
        return UUID.randomUUID().toString();
    }

}
