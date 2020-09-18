package com.bjpowernode.util;

import java.util.Collection;

/**
 * Company : BJPowernode
 * Date : 2020/8/31
 * Description :
 */
public class Utils {

    public static boolean isListNull(Collection collection){
        if (collection ==null || collection.size()==0){
            return true;
        }
        return false;
    }
}
