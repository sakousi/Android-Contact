package fr.dc.contact;

import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import fr.dc.contact.databinding.ActivityContactBinding;
import fr.dc.contact.model.Person;

public class ContactActivity extends AppCompatActivity {
    private ActivityContactBinding ui;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityContactBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());

        Person contact = (Person) this.getIntent().getSerializableExtra(MainActivity.KEY_CONTACT);
        Bitmap photo = this.getIntent().getParcelableExtra(MainActivity.KEY_PHOTO);

        ui.firstName2.setText(contact.getFirstname());
        ui.lastName2.setText(contact.getLastname());
        ui.emailAddress2.setText(contact.getEmail());
        ui.phoneNumber2.setText(contact.getPhonenumber());
        ui.birthdate2.setText(contact.getBirthdate());
        if(photo != null){
            ui.imageView2.setImageBitmap(photo);
        }
    }
}
