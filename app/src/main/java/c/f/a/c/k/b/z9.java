package c.f.a.c.k.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.f.a.c.f.q.w.b;
import com.amazonaws.services.s3.internal.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public final class z9 extends p9 {
    public z9(x9 x9Var) {
        super(x9Var);
    }

    public static boolean B(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean C(List<Long> list, int i2) {
        if (i2 < list.size() * 64) {
            return ((1 << (i2 % 64)) & list.get(i2 / 64).longValue()) != 0;
        }
        return false;
    }

    public static List<Long> D(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            long j2 = 0;
            for (int i3 = 0; i3 < 64; i3++) {
                int i4 = (i2 * 64) + i3;
                if (i4 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i4)) {
                    j2 |= 1 << i3;
                }
            }
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    public static <Builder extends c.f.a.c.j.h.p7> Builder I(Builder builder, byte[] bArr) {
        c.f.a.c.j.h.y5 y5VarB = c.f.a.c.j.h.y5.b();
        return y5VarB != null ? (Builder) builder.w0(bArr, y5VarB) : (Builder) builder.s0(bArr);
    }

    public static int J(c.f.a.c.j.h.x1 x1Var, String str) {
        for (int i2 = 0; i2 < x1Var.C0(); i2++) {
            if (str.equals(x1Var.D0(i2).y())) {
                return i2;
            }
        }
        return -1;
    }

    public static List<c.f.a.c.j.h.u1> K(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                c.f.a.c.j.h.t1 t1VarI = c.f.a.c.j.h.u1.I();
                for (String str : bundle.keySet()) {
                    c.f.a.c.j.h.t1 t1VarI2 = c.f.a.c.j.h.u1.I();
                    t1VarI2.u(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        t1VarI2.z(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        t1VarI2.w((String) obj);
                    } else if (obj instanceof Double) {
                        t1VarI2.B(((Double) obj).doubleValue());
                    }
                    t1VarI.E(t1VarI2);
                }
                if (t1VarI.D() > 0) {
                    arrayList.add(t1VarI.m());
                }
            }
        }
        return arrayList;
    }

    public static final void L(c.f.a.c.j.h.p1 p1Var, String str, Object obj) {
        List<c.f.a.c.j.h.u1> listU = p1Var.u();
        int i2 = 0;
        while (true) {
            if (i2 >= listU.size()) {
                i2 = -1;
                break;
            } else if (str.equals(listU.get(i2).x())) {
                break;
            } else {
                i2++;
            }
        }
        c.f.a.c.j.h.t1 t1VarI = c.f.a.c.j.h.u1.I();
        t1VarI.u(str);
        if (obj instanceof Long) {
            t1VarI.z(((Long) obj).longValue());
        } else if (obj instanceof String) {
            t1VarI.w((String) obj);
        } else if (obj instanceof Double) {
            t1VarI.B(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            t1VarI.F(K((Bundle[]) obj));
        }
        if (i2 >= 0) {
            p1Var.A(i2, t1VarI);
        } else {
            p1Var.C(t1VarI);
        }
    }

    public static final boolean M(t tVar, la laVar) {
        c.f.a.c.f.q.o.i(tVar);
        c.f.a.c.f.q.o.i(laVar);
        return (TextUtils.isEmpty(laVar.f14071c) && TextUtils.isEmpty(laVar.r)) ? false : true;
    }

    public static final c.f.a.c.j.h.u1 N(c.f.a.c.j.h.q1 q1Var, String str) {
        for (c.f.a.c.j.h.u1 u1Var : q1Var.w()) {
            if (u1Var.x().equals(str)) {
                return u1Var;
            }
        }
        return null;
    }

    public static final Object l(c.f.a.c.j.h.q1 q1Var, String str) {
        c.f.a.c.j.h.u1 u1VarN = N(q1Var, str);
        if (u1VarN == null) {
            return null;
        }
        if (u1VarN.y()) {
            return u1VarN.z();
        }
        if (u1VarN.A()) {
            return Long.valueOf(u1VarN.B());
        }
        if (u1VarN.E()) {
            return Double.valueOf(u1VarN.F());
        }
        if (u1VarN.H() <= 0) {
            return null;
        }
        List<c.f.a.c.j.h.u1> listG = u1VarN.G();
        ArrayList arrayList = new ArrayList();
        for (c.f.a.c.j.h.u1 u1Var : listG) {
            if (u1Var != null) {
                Bundle bundle = new Bundle();
                for (c.f.a.c.j.h.u1 u1Var2 : u1Var.G()) {
                    if (u1Var2.y()) {
                        bundle.putString(u1Var2.x(), u1Var2.z());
                    } else if (u1Var2.A()) {
                        bundle.putLong(u1Var2.x(), u1Var2.B());
                    } else if (u1Var2.E()) {
                        bundle.putDouble(u1Var2.x(), u1Var2.F());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void p(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
    }

    public static final String q(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static final void r(StringBuilder sb, int i2, String str, c.f.a.c.j.h.f2 f2Var, String str2) {
        if (f2Var == null) {
            return;
        }
        p(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (f2Var.z() != 0) {
            p(sb, 4);
            sb.append("results: ");
            int i3 = 0;
            for (Long l2 : f2Var.y()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (f2Var.x() != 0) {
            p(sb, 4);
            sb.append("status: ");
            int i5 = 0;
            for (Long l3 : f2Var.w()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(l3);
                i5 = i6;
            }
            sb.append('\n');
        }
        if (f2Var.B() != 0) {
            p(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i7 = 0;
            for (c.f.a.c.j.h.n1 n1Var : f2Var.A()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(n1Var.w() ? Integer.valueOf(n1Var.x()) : null);
                sb.append(":");
                sb.append(n1Var.y() ? Long.valueOf(n1Var.z()) : null);
                i7 = i8;
            }
            sb.append("}\n");
        }
        if (f2Var.E() != 0) {
            p(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i9 = 0;
            for (c.f.a.c.j.h.h2 h2Var : f2Var.D()) {
                int i10 = i9 + 1;
                if (i9 != 0) {
                    sb.append(", ");
                }
                sb.append(h2Var.w() ? Integer.valueOf(h2Var.x()) : null);
                sb.append(": [");
                Iterator<Long> it = h2Var.y().iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    int i12 = i11 + 1;
                    if (i11 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i11 = i12;
                }
                sb.append("]");
                i9 = i10;
            }
            sb.append("}\n");
        }
        p(sb, 3);
        sb.append("}\n");
    }

    public static final void s(StringBuilder sb, int i2, String str, Object obj) {
        if (obj == null) {
            return;
        }
        p(sb, i2 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void t(StringBuilder sb, int i2, String str, c.f.a.c.j.h.r0 r0Var) {
        if (r0Var == null) {
            return;
        }
        p(sb, i2);
        sb.append(str);
        sb.append(" {\n");
        if (r0Var.w()) {
            s(sb, i2, "comparison_type", r0Var.x().name());
        }
        if (r0Var.y()) {
            s(sb, i2, "match_as_float", Boolean.valueOf(r0Var.z()));
        }
        if (r0Var.A()) {
            s(sb, i2, "comparison_value", r0Var.B());
        }
        if (r0Var.C()) {
            s(sb, i2, "min_comparison_value", r0Var.D());
        }
        if (r0Var.E()) {
            s(sb, i2, "max_comparison_value", r0Var.F());
        }
        p(sb, i2);
        sb.append("}\n");
    }

    public final <T extends Parcelable> T A(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } catch (b.a unused) {
            this.f14413a.c().o().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final List<Long> E(List<Long> list, List<Integer> list2) {
        int i2;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                this.f14413a.c().r().b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.f14413a.c().r().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & ((1 << (num.intValue() % 64)) ^ (-1))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i3 = size2;
            i2 = size;
            size = i3;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i2);
    }

    public final boolean F(long j2, long j3) {
        return j2 == 0 || j3 <= 0 || Math.abs(this.f14413a.a().a() - j2) > j3;
    }

    public final long G(byte[] bArr) {
        c.f.a.c.f.q.o.i(bArr);
        this.f14413a.G().g();
        MessageDigest messageDigestB = ea.B();
        if (messageDigestB != null) {
            return ea.C(messageDigestB.digest(bArr));
        }
        this.f14413a.c().o().a("Failed to get MD5");
        return 0L;
    }

    public final byte[] H(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            this.f14413a.c().o().b("Failed to gzip content", e2);
            throw e2;
        }
    }

    @Override // c.f.a.c.k.b.p9
    public final boolean k() {
        return false;
    }

    public final void m(StringBuilder sb, int i2, List<c.f.a.c.j.h.u1> list) {
        if (list == null) {
            return;
        }
        int i3 = i2 + 1;
        for (c.f.a.c.j.h.u1 u1Var : list) {
            if (u1Var != null) {
                p(sb, i3);
                sb.append("param {\n");
                s(sb, i3, "name", u1Var.w() ? this.f14413a.H().q(u1Var.x()) : null);
                s(sb, i3, "string_value", u1Var.y() ? u1Var.z() : null);
                s(sb, i3, "int_value", u1Var.A() ? Long.valueOf(u1Var.B()) : null);
                s(sb, i3, "double_value", u1Var.E() ? Double.valueOf(u1Var.F()) : null);
                if (u1Var.H() > 0) {
                    m(sb, i3, u1Var.G());
                }
                p(sb, i3);
                sb.append("}\n");
            }
        }
    }

    public final void o(StringBuilder sb, int i2, c.f.a.c.j.h.l0 l0Var) {
        if (l0Var == null) {
            return;
        }
        p(sb, i2);
        sb.append("filter {\n");
        if (l0Var.A()) {
            s(sb, i2, "complement", Boolean.valueOf(l0Var.B()));
        }
        if (l0Var.C()) {
            s(sb, i2, "param_name", this.f14413a.H().q(l0Var.D()));
        }
        if (l0Var.w()) {
            int i3 = i2 + 1;
            c.f.a.c.j.h.y0 y0VarX = l0Var.x();
            if (y0VarX != null) {
                p(sb, i3);
                sb.append("string_filter");
                sb.append(" {\n");
                if (y0VarX.w()) {
                    s(sb, i3, "match_type", y0VarX.x().name());
                }
                if (y0VarX.y()) {
                    s(sb, i3, "expression", y0VarX.z());
                }
                if (y0VarX.A()) {
                    s(sb, i3, "case_sensitive", Boolean.valueOf(y0VarX.B()));
                }
                if (y0VarX.D() > 0) {
                    p(sb, i3 + 1);
                    sb.append("expression_list {\n");
                    for (String str : y0VarX.C()) {
                        p(sb, i3 + 2);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                p(sb, i3);
                sb.append("}\n");
            }
        }
        if (l0Var.y()) {
            t(sb, i2 + 1, "number_filter", l0Var.z());
        }
        p(sb, i2);
        sb.append("}\n");
    }

    public final void u(c.f.a.c.j.h.i2 i2Var, Object obj) {
        c.f.a.c.f.q.o.i(obj);
        i2Var.z();
        i2Var.B();
        i2Var.D();
        if (obj instanceof String) {
            i2Var.y((String) obj);
            return;
        }
        if (obj instanceof Long) {
            i2Var.A(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            i2Var.C(((Double) obj).doubleValue());
        } else {
            this.f14413a.c().o().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void v(c.f.a.c.j.h.t1 t1Var, Object obj) {
        c.f.a.c.f.q.o.i(obj);
        t1Var.y();
        t1Var.A();
        t1Var.C();
        t1Var.G();
        if (obj instanceof String) {
            t1Var.w((String) obj);
            return;
        }
        if (obj instanceof Long) {
            t1Var.z(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            t1Var.B(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            t1Var.F(K((Bundle[]) obj));
        } else {
            this.f14413a.c().o().b("Ignoring invalid (type) event param value", obj);
        }
    }

    public final c.f.a.c.j.h.q1 w(o oVar) {
        c.f.a.c.j.h.p1 p1VarG = c.f.a.c.j.h.q1.G();
        p1VarG.M(oVar.f14168e);
        q qVar = new q(oVar.f14169f);
        while (qVar.hasNext()) {
            String next = qVar.next();
            c.f.a.c.j.h.t1 t1VarI = c.f.a.c.j.h.u1.I();
            t1VarI.u(next);
            Object objB = oVar.f14169f.b(next);
            c.f.a.c.f.q.o.i(objB);
            v(t1VarI, objB);
            p1VarG.C(t1VarI);
        }
        return p1VarG.m();
    }

    public final String x(c.f.a.c.j.h.w1 w1Var) {
        if (w1Var == null) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (c.f.a.c.j.h.y1 y1Var : w1Var.w()) {
            if (y1Var != null) {
                p(sb, 1);
                sb.append("bundle {\n");
                if (y1Var.Y()) {
                    s(sb, 1, "protocol_version", Integer.valueOf(y1Var.b1()));
                }
                s(sb, 1, "platform", y1Var.I1());
                if (y1Var.y()) {
                    s(sb, 1, "gmp_version", Long.valueOf(y1Var.z()));
                }
                if (y1Var.A()) {
                    s(sb, 1, "uploading_gmp_version", Long.valueOf(y1Var.B()));
                }
                if (y1Var.F0()) {
                    s(sb, 1, "dynamite_version", Long.valueOf(y1Var.G0()));
                }
                if (y1Var.T()) {
                    s(sb, 1, "config_version", Long.valueOf(y1Var.V()));
                }
                s(sb, 1, "gmp_app_id", y1Var.L());
                s(sb, 1, "admob_app_id", y1Var.E0());
                s(sb, 1, "app_id", y1Var.w());
                s(sb, 1, "app_version", y1Var.x());
                if (y1Var.R()) {
                    s(sb, 1, "app_version_major", Integer.valueOf(y1Var.S()));
                }
                s(sb, 1, "firebase_instance_id", y1Var.P());
                if (y1Var.G()) {
                    s(sb, 1, "dev_cert_hash", Long.valueOf(y1Var.H()));
                }
                s(sb, 1, "app_store", y1Var.O1());
                if (y1Var.y1()) {
                    s(sb, 1, "upload_timestamp_millis", Long.valueOf(y1Var.z1()));
                }
                if (y1Var.A1()) {
                    s(sb, 1, "start_timestamp_millis", Long.valueOf(y1Var.B1()));
                }
                if (y1Var.C1()) {
                    s(sb, 1, "end_timestamp_millis", Long.valueOf(y1Var.D1()));
                }
                if (y1Var.E1()) {
                    s(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(y1Var.F1()));
                }
                if (y1Var.G1()) {
                    s(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(y1Var.H1()));
                }
                s(sb, 1, "app_instance_id", y1Var.F());
                s(sb, 1, "resettable_device_id", y1Var.C());
                s(sb, 1, "ds_id", y1Var.B0());
                if (y1Var.D()) {
                    s(sb, 1, "limited_ad_tracking", Boolean.valueOf(y1Var.E()));
                }
                s(sb, 1, "os_version", y1Var.J1());
                s(sb, 1, "device_model", y1Var.K1());
                s(sb, 1, "user_default_language", y1Var.L1());
                if (y1Var.M1()) {
                    s(sb, 1, "time_zone_offset_minutes", Integer.valueOf(y1Var.N1()));
                }
                if (y1Var.I()) {
                    s(sb, 1, "bundle_sequential_index", Integer.valueOf(y1Var.J()));
                }
                if (y1Var.M()) {
                    s(sb, 1, "service_upload", Boolean.valueOf(y1Var.N()));
                }
                s(sb, 1, "health_monitor", y1Var.K());
                if (!this.f14413a.z().w(null, m3.z0) && y1Var.W() && y1Var.X() != 0) {
                    s(sb, 1, "android_id", Long.valueOf(y1Var.X()));
                }
                if (y1Var.C0()) {
                    s(sb, 1, IjkMediaPlayer.OnNativeInvokeListener.ARG_RETRY_COUNTER, Integer.valueOf(y1Var.D0()));
                }
                if (y1Var.I0()) {
                    s(sb, 1, "consent_signals", y1Var.J0());
                }
                List<c.f.a.c.j.h.j2> listV1 = y1Var.v1();
                if (listV1 != null) {
                    for (c.f.a.c.j.h.j2 j2Var : listV1) {
                        if (j2Var != null) {
                            p(sb, 2);
                            sb.append("user_property {\n");
                            s(sb, 2, "set_timestamp_millis", j2Var.w() ? Long.valueOf(j2Var.x()) : null);
                            s(sb, 2, "name", this.f14413a.H().r(j2Var.y()));
                            s(sb, 2, "string_value", j2Var.A());
                            s(sb, 2, "int_value", j2Var.B() ? Long.valueOf(j2Var.C()) : null);
                            s(sb, 2, "double_value", j2Var.D() ? Double.valueOf(j2Var.E()) : null);
                            p(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<c.f.a.c.j.h.l1> listO = y1Var.O();
                String strW = y1Var.w();
                if (listO != null) {
                    for (c.f.a.c.j.h.l1 l1Var : listO) {
                        if (l1Var != null) {
                            p(sb, 2);
                            sb.append("audience_membership {\n");
                            if (l1Var.w()) {
                                s(sb, 2, "audience_id", Integer.valueOf(l1Var.x()));
                            }
                            if (l1Var.B()) {
                                s(sb, 2, "new_audience", Boolean.valueOf(l1Var.C()));
                            }
                            r(sb, 2, "current_data", l1Var.y(), strW);
                            if (l1Var.z()) {
                                r(sb, 2, "previous_data", l1Var.A(), strW);
                            }
                            p(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<c.f.a.c.j.h.q1> listS1 = y1Var.s1();
                if (listS1 != null) {
                    for (c.f.a.c.j.h.q1 q1Var : listS1) {
                        if (q1Var != null) {
                            p(sb, 2);
                            sb.append("event {\n");
                            s(sb, 2, "name", this.f14413a.H().p(q1Var.z()));
                            if (q1Var.A()) {
                                s(sb, 2, "timestamp_millis", Long.valueOf(q1Var.B()));
                            }
                            if (q1Var.C()) {
                                s(sb, 2, "previous_timestamp_millis", Long.valueOf(q1Var.D()));
                            }
                            if (q1Var.E()) {
                                s(sb, 2, "count", Integer.valueOf(q1Var.F()));
                            }
                            if (q1Var.x() != 0) {
                                m(sb, 2, q1Var.w());
                            }
                            p(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                p(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    public final String y(c.f.a.c.j.h.j0 j0Var) {
        if (j0Var == null) {
            return Constants.NULL_VERSION_ID;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (j0Var.w()) {
            s(sb, 0, "filter_id", Integer.valueOf(j0Var.x()));
        }
        s(sb, 0, "event_name", this.f14413a.H().p(j0Var.y()));
        String strQ = q(j0Var.E(), j0Var.F(), j0Var.H());
        if (!strQ.isEmpty()) {
            s(sb, 0, "filter_type", strQ);
        }
        if (j0Var.C()) {
            t(sb, 1, "event_count_filter", j0Var.D());
        }
        if (j0Var.A() > 0) {
            sb.append("  filters {\n");
            Iterator<c.f.a.c.j.h.l0> it = j0Var.z().iterator();
            while (it.hasNext()) {
                o(sb, 2, it.next());
            }
        }
        p(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    public final String z(c.f.a.c.j.h.t0 t0Var) {
        if (t0Var == null) {
            return Constants.NULL_VERSION_ID;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (t0Var.w()) {
            s(sb, 0, "filter_id", Integer.valueOf(t0Var.x()));
        }
        s(sb, 0, "property_name", this.f14413a.H().r(t0Var.y()));
        String strQ = q(t0Var.A(), t0Var.B(), t0Var.D());
        if (!strQ.isEmpty()) {
            s(sb, 0, "filter_type", strQ);
        }
        o(sb, 1, t0Var.z());
        sb.append("}\n");
        return sb.toString();
    }
}
