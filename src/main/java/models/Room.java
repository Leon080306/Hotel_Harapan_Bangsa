package models;

import java.time.LocalDateTime;

public class Room {
    private String roomNumber;
    private RoomType roomType;
    private String roomDescription;
    private double roomPrice;
    private boolean isAvailable;

    public Room(String roomNumber, RoomType roomType, String roomDescription, double roomPrice, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomDescription = roomDescription;
        this.roomPrice = roomPrice;
        this.isAvailable = isAvailable;
    }

    public String getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    public RoomType getRoomType() {
        return roomType;
    }
    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }
    public String getRoomDescription() {
        return roomDescription;
    }
    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }
    public double getRoomPrice() {
        return roomPrice;
    }
    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}