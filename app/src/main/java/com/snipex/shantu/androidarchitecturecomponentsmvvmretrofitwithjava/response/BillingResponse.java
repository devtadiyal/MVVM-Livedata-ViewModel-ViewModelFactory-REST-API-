package com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.response;

import android.os.Parcel;
import android.os.Parcelable;

public class BillingResponse implements Parcelable {

    protected BillingResponse(Parcel in) {
        first_name = in.readString();
        last_name = in.readString();
        company = in.readString();
        address_1 = in.readString();
        address_2 = in.readString();
        city = in.readString();
        state = in.readString();
        postcode = in.readString();
        country = in.readString();
        email = in.readString();
        phone = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(first_name);
        dest.writeString(last_name);
        dest.writeString(company);
        dest.writeString(address_1);
        dest.writeString(address_2);
        dest.writeString(city);
        dest.writeString(state);
        dest.writeString(postcode);
        dest.writeString(country);
        dest.writeString(email);
        dest.writeString(phone);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<BillingResponse> CREATOR = new Creator<BillingResponse>() {
        @Override
        public BillingResponse createFromParcel(Parcel in) {
            return new BillingResponse(in);
        }

        @Override
        public BillingResponse[] newArray(int size) {
            return new BillingResponse[size];
        }
    };

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress_1() {
        return address_1;
    }

    public void setAddress_1(String address_1) {
        this.address_1 = address_1;
    }

    public String getAddress_2() {
        return address_2;
    }

    public void setAddress_2(String address_2) {
        this.address_2 = address_2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BillingResponse(String first_name, String last_name, String company,
                           String address_1, String address_2, String city,
                           String state, String postcode, String country,
                           String email, String phone) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.company = company;
        this.address_1 = address_1;
        this.address_2 = address_2;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.country = country;
        this.email = email;
        this.phone = phone;
    }

    private String first_name;
    private String last_name;
    private String company;
    private String address_1;
    private String address_2;
    private String city;
    private String state;
    private String postcode;
    private String country;
    private String email;
    private String phone;


}
