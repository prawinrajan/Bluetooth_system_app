package com.mydreamworld.bluetooth;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
        BluetoothAdapter BA;

        public void turnoffbluetooth(View view){
        BA.disable();

        if (BA.isEnabled()){
            Toast.makeText(getApplicationContext(),"Bluetooth could not be disabled",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(),"Bluetooth turned off",Toast.LENGTH_SHORT).show();
        }
        }

        public void findDevices(View view){
            Intent i=new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
            startActivity(i);
        }

        public void pairedDevices(View view){

            Set<BluetoothDevice> pairedDevices=BA.getBondedDevices();

            ListView listview=(ListView) findViewById(R.id.listview);

            ArrayList paireduserlist=new ArrayList();

            for(BluetoothDevice bluetoothdevice:pairedDevices){

                paireduserlist.add(bluetoothdevice.getName());

            }

            ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,paireduserlist);

            listview.setAdapter(arrayAdapter);

        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(BA.isEnabled()){
            Toast.makeText(getApplicationContext(),"Bluetooth is on",Toast.LENGTH_SHORT).show();
        }else{
            Intent intent=new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivity(intent);

            if(BA.isEnabled()){
                Toast.makeText(getApplicationContext(),"Bluetooth is turned on",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
