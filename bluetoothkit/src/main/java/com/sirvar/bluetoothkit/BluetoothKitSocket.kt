package com.sirvar.bluetoothkit

import android.bluetooth.BluetoothSocket
import java.io.InputStream
import java.io.OutputStream

class BluetoothKitSocket(val bluetoothSocket: BluetoothSocket): BluetoothKitSocketInterface {

    override val inputStream: InputStream
        get() = socket.inputStream
    override val outputStream: OutputStream
        get() = socket.outputStream
    override val deviceName: String
        get() = socket.remoteDevice.name
    override val deviceAddress: String
        get() = socket.remoteDevice.address
    override val socket: BluetoothSocket
        get() = socket

    override fun connect() {
        socket.connect()
    }

    override fun close() {
        socket.close()
    }
}