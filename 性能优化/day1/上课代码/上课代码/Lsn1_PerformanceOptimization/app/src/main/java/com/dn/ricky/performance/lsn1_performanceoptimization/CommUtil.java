package com.dn.ricky.performance.lsn1_performanceoptimization;

import android.content.Context;
import android.telecom.Connection;

/**
 * Created by ricky on 2016/11/2.
 */

public class CommUtil {
    private static CommUtil instance;
    private Context context;
    private CommUtil(Context context){
        this.context = context;
    }

    public static CommUtil getInstance(Context context){
        if(instance == null){
            instance = new CommUtil(context);
        }
        return instance;
    }

}
