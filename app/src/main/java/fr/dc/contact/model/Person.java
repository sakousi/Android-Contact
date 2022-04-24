package fr.dc.contact.model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class Person implements Serializable {
    private String firstname;
    private String lastname;
    private String email;
    private String phonenumber;
    private String birthdate;
//    private Bitmap profile;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

//    public Bitmap getProfile() {
//        return profile;
//    }
//
//    public void setProfile(Bitmap profile) {
//        this.profile = profile;
//    }

//    // Converts the Bitmap into a byte array for serialization
//    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
//        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
//        profile.compress(Bitmap.CompressFormat.PNG, 0, byteStream);
//        byte bitmapBytes[] = byteStream.toByteArray();
//        out.write(bitmapBytes, 0, bitmapBytes.length);
//    }
//
//    // Deserializes a byte array representing the Bitmap and decodes it
//    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
//        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
//        int b;
//        while((b = in.read()) != -1)
//            byteStream.write(b);
//        byte bitmapBytes[] = byteStream.toByteArray();
//        profile = BitmapFactory.decodeByteArray(bitmapBytes, 0, bitmapBytes.length);
//    }
}
