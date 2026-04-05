package a.t.l;

import android.os.Messenger;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static boolean a(Messenger messenger) {
        if (messenger == null) {
            return false;
        }
        try {
            return messenger.getBinder() != null;
        } catch (NullPointerException unused) {
            return false;
        }
    }
}
