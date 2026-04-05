package c.f.a.c.d.u.u;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class h extends c.f.a.c.f.q.w.a {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final m0 I;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f11974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f11975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11979i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f11980j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f11981k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f11982l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f11983m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f11984n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f11985o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f11972b = Arrays.asList(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f11973c = {0, 1};
    public static final Parcelable.Creator<h> CREATOR = new z0();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f11986a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g f11988c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<String> f11987b = h.f11972b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int[] f11989d = h.f11973c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f11990e = c("smallIconDrawableResId");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f11991f = c("stopLiveStreamDrawableResId");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f11992g = c("pauseDrawableResId");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f11993h = c("playDrawableResId");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f11994i = c("skipNextDrawableResId");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f11995j = c("skipPrevDrawableResId");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f11996k = c("forwardDrawableResId");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f11997l = c("forward10DrawableResId");

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f11998m = c("forward30DrawableResId");

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f11999n = c("rewindDrawableResId");

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f12000o = c("rewind10DrawableResId");
        public int p = c("rewind30DrawableResId");
        public int q = c("disconnectDrawableResId");
        public long r = 10000;

        public static int c(String str) {
            try {
                Integer num = (Integer) Class.forName("com.google.android.gms.cast.framework.media.internal.ResourceProvider").getMethod("findResourceByName", String.class).invoke(null, str);
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }

        public final h a() {
            g gVar = this.f11988c;
            return new h(this.f11987b, this.f11989d, this.r, this.f11986a, this.f11990e, this.f11991f, this.f11992g, this.f11993h, this.f11994i, this.f11995j, this.f11996k, this.f11997l, this.f11998m, this.f11999n, this.f12000o, this.p, this.q, c("notificationImageSizeDimenResId"), c("castingToDeviceStringResId"), c("stopLiveStreamStringResId"), c("pauseStringResId"), c("playStringResId"), c("skipNextStringResId"), c("skipPrevStringResId"), c("forwardStringResId"), c("forward10StringResId"), c("forward30StringResId"), c("rewindStringResId"), c("rewind10StringResId"), c("rewind30StringResId"), c("disconnectStringResId"), gVar == null ? null : gVar.a().asBinder());
        }

        public final a b(String str) {
            this.f11986a = str;
            return this;
        }
    }

    public h(List<String> list, int[] iArr, long j2, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, IBinder iBinder) {
        m0 o0Var = null;
        if (list != null) {
            this.f11974d = new ArrayList(list);
        } else {
            this.f11974d = null;
        }
        if (iArr != null) {
            this.f11975e = Arrays.copyOf(iArr, iArr.length);
        } else {
            this.f11975e = null;
        }
        this.f11976f = j2;
        this.f11977g = str;
        this.f11978h = i2;
        this.f11979i = i3;
        this.f11980j = i4;
        this.f11981k = i5;
        this.f11982l = i6;
        this.f11983m = i7;
        this.f11984n = i8;
        this.f11985o = i9;
        this.p = i10;
        this.q = i11;
        this.r = i12;
        this.s = i13;
        this.t = i14;
        this.u = i15;
        this.v = i16;
        this.w = i17;
        this.x = i18;
        this.y = i19;
        this.z = i20;
        this.A = i21;
        this.B = i22;
        this.C = i23;
        this.D = i24;
        this.E = i25;
        this.F = i26;
        this.G = i27;
        this.H = i28;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            o0Var = iInterfaceQueryLocalInterface instanceof m0 ? (m0) iInterfaceQueryLocalInterface : new o0(iBinder);
        }
        this.I = o0Var;
    }

    public List<String> I() {
        return this.f11974d;
    }

    public int J() {
        return this.v;
    }

    public int[] K() {
        int[] iArr = this.f11975e;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public int L() {
        return this.t;
    }

    public int M() {
        return this.f11985o;
    }

    public int N() {
        return this.p;
    }

    public int O() {
        return this.f11984n;
    }

    public int P() {
        return this.f11980j;
    }

    public int Q() {
        return this.f11981k;
    }

    public int R() {
        return this.r;
    }

    public int S() {
        return this.s;
    }

    public int T() {
        return this.q;
    }

    public int U() {
        return this.f11982l;
    }

    public int V() {
        return this.f11983m;
    }

    public long W() {
        return this.f11976f;
    }

    public int X() {
        return this.f11978h;
    }

    public int Y() {
        return this.f11979i;
    }

    public int Z() {
        return this.w;
    }

    public String a0() {
        return this.f11977g;
    }

    public final int b0() {
        return this.u;
    }

    public final int c0() {
        return this.x;
    }

    public final int d0() {
        return this.y;
    }

    public final int e0() {
        return this.z;
    }

    public final int f0() {
        return this.A;
    }

    public final int g0() {
        return this.B;
    }

    public final int h0() {
        return this.C;
    }

    public final int i0() {
        return this.D;
    }

    public final int j0() {
        return this.E;
    }

    public final int k0() {
        return this.F;
    }

    public final int l0() {
        return this.G;
    }

    public final int m0() {
        return this.H;
    }

    public final m0 n0() {
        return this.I;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.u(parcel, 2, I(), false);
        c.f.a.c.f.q.w.c.m(parcel, 3, K(), false);
        c.f.a.c.f.q.w.c.o(parcel, 4, W());
        c.f.a.c.f.q.w.c.s(parcel, 5, a0(), false);
        c.f.a.c.f.q.w.c.l(parcel, 6, X());
        c.f.a.c.f.q.w.c.l(parcel, 7, Y());
        c.f.a.c.f.q.w.c.l(parcel, 8, P());
        c.f.a.c.f.q.w.c.l(parcel, 9, Q());
        c.f.a.c.f.q.w.c.l(parcel, 10, U());
        c.f.a.c.f.q.w.c.l(parcel, 11, V());
        c.f.a.c.f.q.w.c.l(parcel, 12, O());
        c.f.a.c.f.q.w.c.l(parcel, 13, M());
        c.f.a.c.f.q.w.c.l(parcel, 14, N());
        c.f.a.c.f.q.w.c.l(parcel, 15, T());
        c.f.a.c.f.q.w.c.l(parcel, 16, R());
        c.f.a.c.f.q.w.c.l(parcel, 17, S());
        c.f.a.c.f.q.w.c.l(parcel, 18, L());
        c.f.a.c.f.q.w.c.l(parcel, 19, this.u);
        c.f.a.c.f.q.w.c.l(parcel, 20, J());
        c.f.a.c.f.q.w.c.l(parcel, 21, Z());
        c.f.a.c.f.q.w.c.l(parcel, 22, this.x);
        c.f.a.c.f.q.w.c.l(parcel, 23, this.y);
        c.f.a.c.f.q.w.c.l(parcel, 24, this.z);
        c.f.a.c.f.q.w.c.l(parcel, 25, this.A);
        c.f.a.c.f.q.w.c.l(parcel, 26, this.B);
        c.f.a.c.f.q.w.c.l(parcel, 27, this.C);
        c.f.a.c.f.q.w.c.l(parcel, 28, this.D);
        c.f.a.c.f.q.w.c.l(parcel, 29, this.E);
        c.f.a.c.f.q.w.c.l(parcel, 30, this.F);
        c.f.a.c.f.q.w.c.l(parcel, 31, this.G);
        c.f.a.c.f.q.w.c.l(parcel, 32, this.H);
        m0 m0Var = this.I;
        c.f.a.c.f.q.w.c.k(parcel, 33, m0Var == null ? null : m0Var.asBinder(), false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
