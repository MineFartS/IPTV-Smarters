package c.f.a.c.j.g;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ClassLoader f13188a = c.class.getClassLoader();

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
