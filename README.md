# Bluetooth_system_app
system settings app
which used to connect your single node with other devices like watch, speaker, and other media players.<br/>
This app contains the basic codes of Bluetooth.

## code explanation
BluetoothAdapter BA - this line create an object of Bluetooth adapter which provides lot of methods to access the bluetooth.<br/>

isEnabled() - method return if the state of the bluetooth either ON/OFF.<br/>


BluetoothAdapter.ACTION_REQUEST_ENABLE - which redirect you to the basic system setting activity(Bluetooth setting acitivity).<br/>

getBondedDevices() - method return the list of already pairedDevices with your system.

### summary
alright friends, finally we are discussed major main part of the coding. otherwise remaining are merely basic terms like Intent.<br/> 
<br/><br/>
### Reference (android.bluetooth)

https://developer.android.com/reference/android/bluetooth/package-summary


