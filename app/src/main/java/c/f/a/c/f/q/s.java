package c.f.a.c.f.q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class s extends c.f.a.c.f.q.w.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<s> CREATOR = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public List<m> f12664c;

    public s(int i2, @Nullable List<m> list) {
        this.f12663b = i2;
        this.f12664c = list;
    }

    public final int I() {
        return this.f12663b;
    }

    @RecentlyNullable
    public final List<m> J() {
        return this.f12664c;
    }

    public final void K(@RecentlyNonNull m mVar) {
        if (this.f12664c == null) {
            this.f12664c = new ArrayList();
        }
        this.f12664c.add(mVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.l(parcel, 1, this.f12663b);
        c.f.a.c.f.q.w.c.w(parcel, 2, this.f12664c, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
