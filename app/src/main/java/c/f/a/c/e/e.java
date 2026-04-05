package c.f.a.c.e;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import c.f.a.c.e.c;

/* JADX INFO: loaded from: classes2.dex */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Messenger f12256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f12257c;

    public static final class a extends ClassLoader {
        @Override // java.lang.ClassLoader
        public final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (!(Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3)))) {
                return e.class;
            }
            Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            return e.class;
        }
    }

    public e(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f12256b = new Messenger(iBinder);
        } else {
            this.f12257c = new c.a(iBinder);
        }
    }

    public final IBinder b() {
        Messenger messenger = this.f12256b;
        return messenger != null ? messenger.getBinder() : this.f12257c.asBinder();
    }

    public final void c(Message message) throws RemoteException {
        Messenger messenger = this.f12256b;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f12257c.O(message);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return b().equals(((e) obj).b());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return b().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        Messenger messenger = this.f12256b;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.f12257c.asBinder());
    }
}
