/*
 * Copyright (C) 2015 Iasc CHEN
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.iasc.microduino.blueserial.ble;

import java.util.HashMap;
import java.util.UUID;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {

    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    public static String SOFT_SERIAL_SERVICE = "0000fff0-0000-1000-8000-00805f9b34fb";
    public static String MD_RX_TX = "0000fff6-0000-1000-8000-00805f9b34fb";
    public static String ETOH_RX_TX = "0000fff1-0000-1000-8000-00805f9b34fb";


    public static String BLE_DOWNLOAD_SERVICE = "0000f0c0-0000-1000-8000-00805f9b34fb";
//    public static String BLE_DOWNLOAD_IMAGE_NOTIFY = "0000f0c1-0000-1000-8000-00805f9b34fb";
//    public static String BLE_DOWNLOAD_IMAGE_BLOCK = "0000f0c2-0000-1000-8000-00805f9b34fb";
//    public static String BLE_DOWNLOAD_ERROR_RESET = "0000f0c3-0000-1000-8000-00805f9b34fb";
    public static String BLE_DOWNLOAD_TRANS = "0000f0c4-0000-1000-8000-00805f9b34fb";

//    public static UUID UUID_ELARA_SERIAL_UUID = UUID.fromString(BLE_DOWNLOAD_SERVICE);
//    public static UUID BLE_DOWNLOAD_IMAGE_NOTIFY_UUID = UUID.fromString(BLE_DOWNLOAD_IMAGE_NOTIFY);
//    public static UUID BLE_DOWNLOAD_IMAGE_BLOCK_UUID = UUID.fromString(BLE_DOWNLOAD_IMAGE_BLOCK);
//    public static UUID BLE_DOWNLOAD_ERROR_RESET_UUID = UUID.fromString(BLE_DOWNLOAD_ERROR_RESET);
//    public static UUID UUID_ELARA_RX_TX = UUID.fromString(BLE_DOWNLOAD_TRANS);

    private static HashMap<String, String> attributes = new HashMap<String, String>();

    static {
        // Sample Services.
        attributes.put(SOFT_SERIAL_SERVICE, "Microduino BLE Serial");
        attributes.put(BLE_DOWNLOAD_SERVICE, "Microduino Elara Serial");

        attributes.put("00001800-0000-1000-8000-00805f9b34fb", "Device Information Service");

        // Sample Characteristics.
        attributes.put(MD_RX_TX, "RX/TX data");
        attributes.put(ETOH_RX_TX, "RX/TX data");
        attributes.put(BLE_DOWNLOAD_TRANS, "RX/TX data");

        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
