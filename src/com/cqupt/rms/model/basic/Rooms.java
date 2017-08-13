package com.cqupt.rms.model.basic;

public class Rooms {
    private Integer restaurantid;

    private String roomid;

    private String deskid;

    private String status;

    private Integer size;

    public Integer getRestaurantid() {
        return restaurantid;
    }

    public void setRestaurantid(Integer restaurantid) {
        this.restaurantid = restaurantid;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid == null ? null : roomid.trim();
    }

    public String getDeskid() {
        return deskid;
    }

    public void setDeskid(String deskid) {
        this.deskid = deskid == null ? null : deskid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}