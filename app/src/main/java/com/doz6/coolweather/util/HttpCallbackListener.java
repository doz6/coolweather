package com.doz6.coolweather.util;

/**
 * Created by Administrator on 2016/2/14.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
