package com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.response;

import android.os.Parcel;
import android.os.Parcelable;

public class SignupResponse implements Parcelable {


    protected SignupResponse(Parcel in) {
        id = in.readInt();
        date_created = in.readString();
        date_created_gmt = in.readString();
        date_modified = in.readString();
        date_modified_gmt = in.readString();
        email = in.readString();
        first_name = in.readString();
        last_name = in.readString();
        role = in.readString();
        username = in.readString();
        billing = in.readParcelable(BillingResponse.class.getClassLoader());
        shipping = in.readParcelable(ShippingResponse.class.getClassLoader());
        is_paying_customer = in.readByte() != 0;
        avatar_url = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(date_created);
        dest.writeString(date_created_gmt);
        dest.writeString(date_modified);
        dest.writeString(date_modified_gmt);
        dest.writeString(email);
        dest.writeString(first_name);
        dest.writeString(last_name);
        dest.writeString(role);
        dest.writeString(username);
        dest.writeParcelable(billing, flags);
        dest.writeParcelable(shipping, flags);
        dest.writeByte((byte) (is_paying_customer ? 1 : 0));
        dest.writeString(avatar_url);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<SignupResponse> CREATOR = new Creator<SignupResponse>() {
        @Override
        public SignupResponse createFromParcel(Parcel in) {
            return new SignupResponse(in);
        }

        @Override
        public SignupResponse[] newArray(int size) {
            return new SignupResponse[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getDate_created_gmt() {
        return date_created_gmt;
    }

    public void setDate_created_gmt(String date_created_gmt) {
        this.date_created_gmt = date_created_gmt;
    }

    public String getDate_modified() {
        return date_modified;
    }

    public void setDate_modified(String date_modified) {
        this.date_modified = date_modified;
    }

    public String getDate_modified_gmt() {
        return date_modified_gmt;
    }

    public void setDate_modified_gmt(String date_modified_gmt) {
        this.date_modified_gmt = date_modified_gmt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BillingResponse getBilling() {
        return billing;
    }

    public void setBilling(BillingResponse billing) {
        this.billing = billing;
    }

    public ShippingResponse getShipping() {
        return shipping;
    }

    public void setShipping(ShippingResponse shipping) {
        this.shipping = shipping;
    }

    public boolean isIs_paying_customer() {
        return is_paying_customer;
    }

    public void setIs_paying_customer(boolean is_paying_customer) {
        this.is_paying_customer = is_paying_customer;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public SignupResponse(int id, String date_created, String date_created_gmt,
                          String date_modified, String date_modified_gmt,
                          String email, String first_name, String last_name,
                          String role, String username, BillingResponse billing,
                          ShippingResponse shipping, boolean is_paying_customer,
                          String avatar_url) {
        this.id = id;
        this.date_created = date_created;
        this.date_created_gmt = date_created_gmt;
        this.date_modified = date_modified;
        this.date_modified_gmt = date_modified_gmt;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
        this.username = username;
        this.billing = billing;
        this.shipping = shipping;
        this.is_paying_customer = is_paying_customer;
        this.avatar_url = avatar_url;
    }

    private int id;
    private String date_created;
    private String date_created_gmt;
    private String date_modified;
    private String date_modified_gmt;
    private String email;
    private String first_name;
    private String last_name;
    private String role;
    private String username;
    private BillingResponse billing;
    private ShippingResponse shipping;
    private boolean is_paying_customer;
    private String avatar_url;
    //private ArrayList<MetaDataResponse> meta_data;
   // private LinkResponse _links;


}
