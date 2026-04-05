package com.amplifyframework.auth;

import a.i.q.d;

/* JADX INFO: loaded from: classes.dex */
public final class AuthDevice {
    private final String deviceId;
    private final String deviceName;

    private AuthDevice(String str, String str2) {
        this.deviceId = str;
        this.deviceName = str2;
    }

    public static AuthDevice fromId(String str) {
        return fromId(str, null);
    }

    public static AuthDevice fromId(String str, String str2) {
        str.getClass();
        return new AuthDevice(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthDevice.class != obj.getClass()) {
            return false;
        }
        AuthDevice authDevice = (AuthDevice) obj;
        return d.a(getDeviceId(), authDevice.getDeviceId()) && d.a(getDeviceName(), authDevice.getDeviceName());
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public int hashCode() {
        return d.b(getDeviceId(), getDeviceName());
    }

    public String toString() {
        return "AuthDevice{deviceId='" + this.deviceId + "', deviceName='" + this.deviceName + "'}";
    }
}
