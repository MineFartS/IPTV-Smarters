package c.f.a.c.e;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Messenger f12282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f12283b;

    public s(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f12282a = new Messenger(iBinder);
            this.f12283b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f12283b = new e(iBinder);
            this.f12282a = null;
        } else {
            String strValueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", strValueOf.length() != 0 ? "Invalid interface descriptor: ".concat(strValueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    public final void a(Message message) throws RemoteException {
        Messenger messenger = this.f12282a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        e eVar = this.f12283b;
        if (eVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        eVar.c(message);
    }
}
