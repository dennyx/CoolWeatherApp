package com.coolweather.app.util;

/**
 * Created by dzhang4 on 10/22/2015.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);

}
