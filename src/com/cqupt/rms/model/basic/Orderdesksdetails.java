package com.cqupt.rms.model.basic;

public class Orderdesksdetails {
    private String orderid;

    private String roomid;

    private String deskids;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid == null ? null : roomid.trim();
    }

    public String getDeskids() {
        return deskids;
    }

    public void setDeskids(String deskids) {
        this.deskids = deskids == null ? null : deskids.trim();
    }
}