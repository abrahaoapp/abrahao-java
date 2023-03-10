package br.com.abrahao.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EventTheCheck {
	@SerializedName("table")
    @Expose
    private String table = "";
	
    @SerializedName("card")
    @Expose
    private String card = "";
    
    @SerializedName("waiter")
    @Expose
    private String waiter = "";
    
    @SerializedName("document")
    @Expose
    private String document = "";
    
    @SerializedName("split_with")
    @Expose
    private String splitWith = "";

    public String getTable() {
        return table;
    }
    public void setTable(String table) {
        this.table = table;
    }

    public String getCard() {
        return card;
    }
    public void setCard(String card) {
        this.card = card;
    }

    public String getWaiter() {
        return waiter;
    }
    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }
    
    public String getDocument() {
        return document;
    }
    public void setDocument(String document) {
        this.document = document;
    }
    
    public String getSplitWith() {
        return splitWith;
    }
    public void setSplitWith(String splitWith) {
        this.splitWith = splitWith;
    }
	
}
