package c.f.a.c.k.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import c.f.a.c.j.h.sb;
import c.f.a.c.j.h.td;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.achartengine.chart.TimeChart;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ea extends x5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f13850c = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f13851d = {"_err"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f13852e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SecureRandom f13853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicLong f13854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f13856i;

    public ea(c5 c5Var) {
        super(c5Var);
        this.f13856i = null;
        this.f13854g = new AtomicLong(0L);
    }

    public static MessageDigest B() {
        MessageDigest messageDigest;
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static long C(byte[] bArr) {
        c.f.a.c.f.q.o.i(bArr);
        int length = bArr.length;
        int i2 = 0;
        c.f.a.c.f.q.o.l(length > 0);
        long j2 = 0;
        for (int i3 = length - 1; i3 >= 0 && i3 >= bArr.length - 8; i3--) {
            j2 += (((long) bArr[i3]) & 255) << i2;
            i2 += 8;
        }
        return j2;
    }

    public static boolean D(Context context, boolean z) {
        c.f.a.c.f.q.o.i(context);
        return e0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean F(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean G(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static boolean M(String str) {
        return !f13851d[0].equals(str);
    }

    public static ArrayList<Bundle> Y(List<b> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (b bVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", bVar.f13737b);
            bundle.putString("origin", bVar.f13738c);
            bundle.putLong("creation_timestamp", bVar.f13740e);
            bundle.putString("name", bVar.f13739d.f13731c);
            z5.a(bundle, bVar.f13739d.I());
            bundle.putBoolean("active", bVar.f13741f);
            String str = bVar.f13742g;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            t tVar = bVar.f13743h;
            if (tVar != null) {
                bundle.putString("timed_out_event_name", tVar.f14310b);
                r rVar = bVar.f13743h.f14311c;
                if (rVar != null) {
                    bundle.putBundle("timed_out_event_params", rVar.K());
                }
            }
            bundle.putLong("trigger_timeout", bVar.f13744i);
            t tVar2 = bVar.f13745j;
            if (tVar2 != null) {
                bundle.putString("triggered_event_name", tVar2.f14310b);
                r rVar2 = bVar.f13745j.f14311c;
                if (rVar2 != null) {
                    bundle.putBundle("triggered_event_params", rVar2.K());
                }
            }
            bundle.putLong("triggered_timestamp", bVar.f13739d.f13732d);
            bundle.putLong("time_to_live", bVar.f13746k);
            t tVar3 = bVar.f13747l;
            if (tVar3 != null) {
                bundle.putString("expired_event_name", tVar3.f14310b);
                r rVar3 = bVar.f13747l.f14311c;
                if (rVar3 != null) {
                    bundle.putBundle("expired_event_params", rVar3.K());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static final boolean a0(Bundle bundle, int i2) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i2);
        return true;
    }

    public static final boolean b0(String str) {
        c.f.a.c.f.q.o.i(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    public static boolean e0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean f0(String str, String[] strArr) {
        c.f.a.c.f.q.o.i(strArr);
        for (String str2 : strArr) {
            if (G(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean i0(String str) {
        c.f.a.c.f.q.o.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public final void A(da daVar, String str, int i2, String str2, String str3, int i3) {
        Bundle bundle = new Bundle();
        a0(bundle, i2);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", i3);
        }
        c.f.a.c.j.h.v9.a();
        if (this.f14413a.z().w(null, m3.N0)) {
            daVar.g(str, bundle);
        } else {
            this.f14413a.e();
            this.f14413a.F().X("auto", "_err", bundle);
        }
    }

    public final boolean E(String str) {
        g();
        if (c.f.a.c.f.u.c.a(this.f14413a.b()).a(str) == 0) {
            return true;
        }
        this.f14413a.c().v().b("Permission not granted", str);
        return false;
    }

    public final boolean H(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strD = this.f14413a.z().D();
        this.f14413a.e();
        return strD.equals(str);
    }

    public final Bundle I(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objS = s(str, bundle.get(str));
                if (objS == null) {
                    this.f14413a.c().t().b("Param value can't be null", this.f14413a.H().q(str));
                } else {
                    z(bundle2, str, objS);
                }
            }
        }
        return bundle2;
    }

    public final t J(String str, String str2, Bundle bundle, String str3, long j2, boolean z, boolean z2, boolean z3) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (o0(str2, z3) != 0) {
            this.f14413a.c().o().b("Invalid conditional property event name", this.f14413a.H().r(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleT = t(str, str2, bundle2, c.f.a.c.f.t.e.b("_o"), false);
        if (z) {
            bundleT = I(bundleT);
        }
        c.f.a.c.f.q.o.i(bundleT);
        return new t(str2, new r(bundleT), str3, j2);
    }

    public final boolean K(Context context, String str) {
        w3 w3VarO;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoE = c.f.a.c.f.u.c.a(context).e(str, 64);
            if (packageInfoE == null || (signatureArr = packageInfoE.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e2) {
            e = e2;
            w3VarO = this.f14413a.c().o();
            str2 = "Package name not found";
            w3VarO.b(str2, e);
            return true;
        } catch (CertificateException e3) {
            e = e3;
            w3VarO = this.f14413a.c().o();
            str2 = "Error obtaining certificate";
            w3VarO.b(str2, e);
            return true;
        }
    }

    public final byte[] L(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int N() {
        if (this.f13856i == null) {
            this.f13856i = Integer.valueOf(c.f.a.c.f.f.f().a(this.f14413a.b()) / 1000);
        }
        return this.f13856i.intValue();
    }

    public final int O(int i2) {
        return c.f.a.c.f.f.f().h(this.f14413a.b(), 12451000);
    }

    public final long P(long j2, long j3) {
        return (j2 + (j3 * 60000)) / TimeChart.DAY;
    }

    public final void Q(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            this.f14413a.c().r().b("Params already contained engagement", Long.valueOf(j3));
        }
        bundle.putLong("_et", j2 + j3);
    }

    public final void R(td tdVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            tdVar.w1(bundle);
        } catch (RemoteException e2) {
            this.f14413a.c().r().b("Error returning string value to wrapper", e2);
        }
    }

    public final void S(td tdVar, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            tdVar.w1(bundle);
        } catch (RemoteException e2) {
            this.f14413a.c().r().b("Error returning long value to wrapper", e2);
        }
    }

    public final void T(td tdVar, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            tdVar.w1(bundle);
        } catch (RemoteException e2) {
            this.f14413a.c().r().b("Error returning int value to wrapper", e2);
        }
    }

    public final void U(td tdVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            tdVar.w1(bundle);
        } catch (RemoteException e2) {
            this.f14413a.c().r().b("Error returning byte array to wrapper", e2);
        }
    }

    public final void V(td tdVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            tdVar.w1(bundle);
        } catch (RemoteException e2) {
            this.f14413a.c().r().b("Error returning boolean value to wrapper", e2);
        }
    }

    public final void W(td tdVar, Bundle bundle) {
        try {
            tdVar.w1(bundle);
        } catch (RemoteException e2) {
            this.f14413a.c().r().b("Error returning bundle value to wrapper", e2);
        }
    }

    public final void X(td tdVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            tdVar.w1(bundle);
        } catch (RemoteException e2) {
            this.f14413a.c().r().b("Error returning bundle list to wrapper", e2);
        }
    }

    public final URL Z(long j2, String str, String str2, long j3) {
        try {
            c.f.a.c.f.q.o.e(str2);
            c.f.a.c.f.q.o.e(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 37000L, Integer.valueOf(N())), str2, str, Long.valueOf(j3));
            if (str.equals(this.f14413a.z().E())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException | MalformedURLException e2) {
            this.f14413a.c().o().b("Failed to create BOW URL for Deferred Deep Link. exception", e2.getMessage());
            return null;
        }
    }

    public final Object c0(int i2, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return q(String.valueOf(obj), i2, z);
        }
        if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleI = I((Bundle) parcelable);
                if (!bundleI.isEmpty()) {
                    arrayList.add(bundleI);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int d0(String str) {
        if ("_ldl".equals(str)) {
            this.f14413a.z();
            return 2048;
        }
        if (TransferTable.COLUMN_ID.equals(str)) {
            this.f14413a.z();
            return 256;
        }
        if (this.f14413a.z().w(null, m3.h0) && "_lgclid".equals(str)) {
            this.f14413a.z();
            return 100;
        }
        this.f14413a.z();
        return 36;
    }

    public final long g0() {
        long j2 = this.f13854g.get();
        synchronized (this.f13854g) {
            if (j2 != 0) {
                this.f13854g.compareAndSet(-1L, 1L);
                return this.f13854g.getAndIncrement();
            }
            long jNextLong = new Random(System.nanoTime() ^ this.f14413a.a().a()).nextLong();
            int i2 = this.f13855h + 1;
            this.f13855h = i2;
            return jNextLong + ((long) i2);
        }
    }

    @Override // c.f.a.c.k.b.x5
    public final boolean h() {
        return true;
    }

    @EnsuresNonNull({"this.secureRandom"})
    public final SecureRandom h0() {
        g();
        if (this.f13853f == null) {
            this.f13853f = new SecureRandom();
        }
        return this.f13853f;
    }

    @Override // c.f.a.c.k.b.x5
    public final void i() {
        g();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                this.f14413a.c().r().a("Utils falling back to Random for random id");
            }
        }
        this.f13854g.set(jNextLong);
    }

    public final Bundle j0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                }
                if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("campaign", queryParameter);
                }
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("source", queryParameter2);
                }
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("medium", queryParameter3);
                }
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("gclid", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("term", queryParameter5);
                }
                String queryParameter6 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("content", queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("aclid", queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("cp1", queryParameter8);
                }
                String queryParameter9 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter9)) {
                    bundle.putString("anid", queryParameter9);
                }
                return bundle;
            } catch (UnsupportedOperationException e2) {
                this.f14413a.c().r().b("Install referrer url isn't a hierarchical URI", e2);
            }
        }
        return null;
    }

    public final boolean k0(String str, String str2) {
        if (str2 == null) {
            this.f14413a.c().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f14413a.c().q().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            this.f14413a.c().q().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f14413a.c().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean l0(String str, String str2) {
        if (str2 == null) {
            this.f14413a.c().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f14413a.c().q().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                this.f14413a.c().q().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f14413a.c().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean m0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f14413a.c().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        c.f.a.c.f.q.o.i(str2);
        String[] strArr3 = f13850c;
        for (int i2 = 0; i2 < 3; i2++) {
            if (str2.startsWith(strArr3[i2])) {
                this.f14413a.c().q().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !f0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && f0(str2, strArr2)) {
            return true;
        }
        this.f14413a.c().q().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean n0(String str, int i2, String str2) {
        if (str2 == null) {
            this.f14413a.c().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i2) {
            return true;
        }
        this.f14413a.c().q().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
        return false;
    }

    public final boolean o(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (b0(str)) {
                return true;
            }
            if (this.f14413a.K()) {
                this.f14413a.c().q().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", y3.x(str));
            }
            return false;
        }
        sb.a();
        if (this.f14413a.z().w(null, m3.j0) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.f14413a.K()) {
                this.f14413a.c().q().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (b0(str2)) {
            return true;
        }
        this.f14413a.c().q().b("Invalid admob_app_id. Analytics disabled.", y3.x(str2));
        return false;
    }

    public final int o0(String str, boolean z) {
        if (!l0("event", str)) {
            return 2;
        }
        if (z) {
            if (!m0("event", a6.f13717a, a6.f13718b, str)) {
                return 13;
            }
        } else if (!m0("event", a6.f13717a, null, str)) {
            return 13;
        }
        this.f14413a.z();
        return !n0("event", 40, str) ? 2 : 0;
    }

    public final boolean p(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            c.f.a.c.f.q.o.i(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public final int p0(String str) {
        if (!l0("user property", str)) {
            return 6;
        }
        if (!m0("user property", c6.f13795a, null, str)) {
            return 15;
        }
        this.f14413a.z();
        return !n0("user property", 24, str) ? 6 : 0;
    }

    public final String q(String str, int i2, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i2) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i2))).concat("...");
        }
        return null;
    }

    public final int q0(String str) {
        if (!k0("event param", str)) {
            return 3;
        }
        if (!m0("event param", null, null, str)) {
            return 14;
        }
        this.f14413a.z();
        return !n0("event param", 40, str) ? 3 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int r(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.ea.r(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final int r0(String str) {
        if (!l0("event param", str)) {
            return 3;
        }
        if (!m0("event param", null, null, str)) {
            return 14;
        }
        this.f14413a.z();
        return !n0("event param", 40, str) ? 3 : 0;
    }

    public final Object s(String str, Object obj) {
        int i2 = 256;
        if ("_ev".equals(str)) {
            this.f14413a.z();
            return c0(256, obj, true, true);
        }
        if (F(str)) {
            this.f14413a.z();
        } else {
            this.f14413a.z();
            i2 = 100;
        }
        return c0(i2, obj, false, true);
    }

    public final boolean s0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle t(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List<java.lang.String> r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.ea.t(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    public final boolean t0(String str, String str2, int i2, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i2) {
                this.f14413a.c().t().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    public final void u(z3 z3Var, int i2) {
        int i3 = 0;
        for (String str : new TreeSet(z3Var.f14496d.keySet())) {
            if (i0(str) && (i3 = i3 + 1) > i2) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i2);
                sb.append(" params");
                this.f14413a.c().q().c(sb.toString(), this.f14413a.H().p(z3Var.f14493a), this.f14413a.H().s(z3Var.f14496d));
                a0(z3Var.f14496d, 5);
                z3Var.f14496d.remove(str);
            }
        }
    }

    public final void u0(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int i2;
        String str4;
        int iR;
        if (bundle == null) {
            return;
        }
        this.f14413a.z();
        int i3 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                int iQ0 = z ? q0(str5) : 0;
                if (iQ0 == 0) {
                    iQ0 = r0(str5);
                }
                i2 = iQ0;
            } else {
                i2 = 0;
            }
            if (i2 != 0) {
                w(bundle, i2, str5, str5, i2 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (s0(bundle.get(str5))) {
                    this.f14413a.c().t().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    str4 = str5;
                    iR = 22;
                } else {
                    str4 = str5;
                    iR = r(str, str2, str5, bundle.get(str5), bundle, list, z, false);
                }
                if (iR != 0 && !"_ev".equals(str4)) {
                    w(bundle, iR, str4, str4, bundle.get(str4));
                } else if (i0(str4) && !f0(str4, b6.f13759d) && (i3 = i3 + 1) > 0) {
                    this.f14413a.c().q().c("Item cannot contain custom parameters", this.f14413a.H().p(str2), this.f14413a.H().s(bundle));
                    a0(bundle, 23);
                }
                bundle.remove(str4);
            }
        }
    }

    public final void v(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f14413a.G().z(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void w(Bundle bundle, int i2, String str, String str2, Object obj) {
        if (a0(bundle, i2)) {
            this.f14413a.z();
            bundle.putString("_ev", q(str, 40, true));
            if (obj != null) {
                c.f.a.c.f.q.o.i(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public final int x(String str, Object obj) {
        int iD0;
        String str2;
        if ("_ldl".equals(str)) {
            iD0 = d0(str);
            str2 = "user property referrer";
        } else {
            iD0 = d0(str);
            str2 = "user property";
        }
        return t0(str2, str, iD0, obj) ? 0 : 7;
    }

    public final Object y(String str, Object obj) {
        boolean zEquals = "_ldl".equals(str);
        int iD0 = d0(str);
        return zEquals ? c0(iD0, obj, true, false) : c0(iD0, obj, false, false);
    }

    public final void z(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.f14413a.c().t().c("Not putting event parameter. Invalid value type. name, type", this.f14413a.H().q(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }
}
