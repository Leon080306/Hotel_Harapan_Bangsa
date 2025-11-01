package models;

public class Guest extends Users{
    private MembershipLevel membershipLevel;
    private int points;
    private String creditCardNumberPin;

    public Guest (String nik, String password, String nama, int umur, String email, String phone, String address, MembershipLevel membershipLevel) {
        super(nik, password, nama, umur, email, phone, address, UserType.GUEST);
        this.membershipLevel = membershipLevel;
        this.points = 0;
    }
    public Guest (String nik, String password, String nama, int umur, String email, String phone, String address, MembershipLevel membershipLevel, String creditCardNumberPin) {
        super(nik, password, nama, umur, email, phone, address, UserType.GUEST);
        this.membershipLevel = membershipLevel;
        this.points = 0;
        this.creditCardNumberPin = creditCardNumberPin;
    }
}
