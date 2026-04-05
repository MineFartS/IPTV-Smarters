package c.f.a.c.f;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c.f.a.c.f.q.n;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends c.f.a.c.f.q.w.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PendingIntent f12301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f12302f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RecentlyNonNull
    public static final b f12298b = new b(0);

    @RecentlyNonNull
    public static final Parcelable.Creator<b> CREATOR = new w();

    public b(int i2) {
        this(i2, null, null);
    }

    public b(int i2, int i3, PendingIntent pendingIntent, String str) {
        this.f12299c = i2;
        this.f12300d = i3;
        this.f12301e = pendingIntent;
        this.f12302f = str;
    }

    public b(int i2, PendingIntent pendingIntent) {
        this(i2, pendingIntent, null);
    }

    public b(int i2, PendingIntent pendingIntent, String str) {
        this(1, i2, pendingIntent, str);
    }

    public static String N(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i2);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public int I() {
        return this.f12300d;
    }

    @RecentlyNullable
    public String J() {
        return this.f12302f;
    }

    @RecentlyNullable
    public PendingIntent K() {
        return this.f12301e;
    }

    public boolean L() {
        return (this.f12300d == 0 || this.f12301e == null) ? false : true;
    }

    public boolean M() {
        return this.f12300d == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12300d == bVar.f12300d && c.f.a.c.f.q.n.a(this.f12301e, bVar.f12301e) && c.f.a.c.f.q.n.a(this.f12302f, bVar.f12302f);
    }

    public int hashCode() {
        return c.f.a.c.f.q.n.b(Integer.valueOf(this.f12300d), this.f12301e, this.f12302f);
    }

    @RecentlyNonNull
    public String toString() {
        n.a aVarC = c.f.a.c.f.q.n.c(this);
        aVarC.a("statusCode", N(this.f12300d));
        aVarC.a("resolution", this.f12301e);
        aVarC.a("message", this.f12302f);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.l(parcel, 1, this.f12299c);
        c.f.a.c.f.q.w.c.l(parcel, 2, I());
        c.f.a.c.f.q.w.c.r(parcel, 3, K(), i2, false);
        c.f.a.c.f.q.w.c.s(parcel, 4, J(), false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
