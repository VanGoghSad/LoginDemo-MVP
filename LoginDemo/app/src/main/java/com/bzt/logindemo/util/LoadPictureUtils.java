package com.bzt.logindemo.util;

/**
 * Created by LW on 2016/8/3.
 */

public class LoadPictureUtils {
    public static String loadPicture(String imageUrl){
        if(imageUrl == null)
            return "";

        if (imageUrl.contains("http://"))
            return imageUrl;
        else
            return "http://112.80.45.178:8011"+imageUrl;
    }
}
