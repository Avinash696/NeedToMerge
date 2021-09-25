package com.tia.needtomerge.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllAssetsListModel {
    @SerializedName("tagName")
    @Expose
    public String tagName;
    @SerializedName("tagCode")
    @Expose
    public String tagCode;

    public AllAssetsListModel(String tagCode, String tagName) {
        this.tagName = tagName;
        this.tagCode = tagCode;
    }
}
