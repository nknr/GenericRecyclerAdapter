package com.nk.genericadapter.constant;

import com.nk.genericadapter.model.GoogleProduct;
import com.nk.genericadapter.model.AndroidVersion;

import java.util.ArrayList;
import java.util.List;

public class ConstantValues {

    public static List<AndroidVersion> getAndroidVersion(){
        List<AndroidVersion> list = new ArrayList<>();
        list.add(new AndroidVersion("Alpha"));
        list.add(new AndroidVersion("Beta"));
        list.add(new AndroidVersion("Cupcake"));
        list.add(new AndroidVersion("Donut"));
        list.add(new AndroidVersion("Eclair"));
        list.add(new AndroidVersion("Froyo"));
        list.add(new AndroidVersion("Gingerbread"));
        list.add(new AndroidVersion("Honeycomb"));
        list.add(new AndroidVersion("Ice Cream Sandwich"));
        list.add(new AndroidVersion("Jellybean"));
        list.add(new AndroidVersion("Kitkat"));
        list.add(new AndroidVersion("Lollipop"));
        list.add(new AndroidVersion("Marshmallow"));
        list.add(new AndroidVersion("Nougat"));
        list.add(new AndroidVersion("Oreo"));
        list.add(new AndroidVersion("Pie"));
        list.add(new AndroidVersion("Android Q"));
        list.add(new AndroidVersion("Android R"));
        return list;
    }

    public static List<GoogleProduct> getGoogleProducts(){
        List<GoogleProduct> list = new ArrayList<>();
        list.add(new GoogleProduct("Android"));
        list.add(new GoogleProduct("Map Platform"));
        list.add(new GoogleProduct("Cloud"));
        list.add(new GoogleProduct("TensorFlow"));
        list.add(new GoogleProduct("Firebase"));
        list.add(new GoogleProduct("Web"));
        list.add(new GoogleProduct("Flutter"));
        list.add(new GoogleProduct("Youtube"));
        list.add(new GoogleProduct("G-mail"));
        list.add(new GoogleProduct("Keep"));
        return list;
    }
}
