package c.f.a.b.d3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import c.f.a.b.j3.g;
import c.f.a.b.j3.x0;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6871b;

    public static class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i2) {
            return new d[i2];
        }
    }

    public d(int i2) {
        this.f6871b = (i2 & 2) != 0 ? i2 | 1 : i2;
    }

    public static boolean l(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        if (x0.f9296a < 24) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(16)) ? false : true;
    }

    public d b(int i2) {
        int i3 = this.f6871b;
        int i4 = i2 & i3;
        return i4 == i3 ? this : new d(i4);
    }

    public final int c(Context context) {
        if (!m()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) g.e(context.getSystemService("connectivity"));
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (activeNetworkInfo != null && activeNetworkInfo.isConnected() && l(connectivityManager)) ? (p() && connectivityManager.isActiveNetworkMetered()) ? 2 : 0 : this.f6871b & 3;
    }

    public int d(Context context) {
        int iC = c(context);
        if (f() && !h(context)) {
            iC |= 8;
        }
        if (k() && !j(context)) {
            iC |= 4;
        }
        return (!o() || n(context)) ? iC : iC | 16;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f6871b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && d.class == obj.getClass() && this.f6871b == ((d) obj).f6871b;
    }

    public boolean f() {
        return (this.f6871b & 8) != 0;
    }

    public final boolean h(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    public int hashCode() {
        return this.f6871b;
    }

    public final boolean j(Context context) {
        PowerManager powerManager = (PowerManager) g.e(context.getSystemService("power"));
        int i2 = x0.f9296a;
        if (i2 >= 23) {
            return powerManager.isDeviceIdleMode();
        }
        if (i2 >= 20) {
            if (!powerManager.isInteractive()) {
                return true;
            }
        } else if (!powerManager.isScreenOn()) {
            return true;
        }
        return false;
    }

    public boolean k() {
        return (this.f6871b & 4) != 0;
    }

    public boolean m() {
        return (this.f6871b & 1) != 0;
    }

    public final boolean n(Context context) {
        return context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null;
    }

    public boolean o() {
        return (this.f6871b & 16) != 0;
    }

    public boolean p() {
        return (this.f6871b & 2) != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f6871b);
    }
}
