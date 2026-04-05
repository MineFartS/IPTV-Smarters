package d.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.security.KeyChain;
import android.security.KeyChainException;
import android.text.TextUtils;
import android.util.Base64;
import minefarts.iptvsmarters.R;
import d.a.a.d.a0;
import d.a.a.d.e;
import d.a.a.d.h;
import d.a.a.d.s;
import d.a.a.d.t;
import d.a.a.d.u;
import d.a.a.d.y;
import d.a.a.d.z;
import de.blinkt.openvpn.core.NativeUtils;
import de.blinkt.openvpn.core.OpenVPNService;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.UUID;
import java.util.Vector;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.spongycastle.util.io.pem.PemObject;
import org.spongycastle.util.io.pem.PemWriter;

/* JADX INFO: loaded from: classes2.dex */
public class a implements Serializable, Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f30066b = "8.8.8.8";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f30067c = "8.8.4.4";
    public boolean X;
    public String Y;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f30070f;
    public e[] f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f30071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f30072h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f30074j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f30075k;
    public String k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f30076l;
    public String l0;
    public String m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f30078n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f30079o;
    public int o0;
    public String s;
    public String t;
    public transient PrivateKey w0;
    public String y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient boolean f30068d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30069e = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f30073i = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f30077m = false;
    public boolean p = false;
    public String q = f30066b;
    public String r = f30067c;
    public boolean u = false;
    public String v = "blinkt.de";
    public boolean w = true;
    public boolean x = true;
    public boolean z = true;
    public boolean A = false;
    public String B = BuildConfig.FLAVOR;
    public String C = BuildConfig.FLAVOR;
    public String D = BuildConfig.FLAVOR;
    public boolean E = false;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;
    public String I = BuildConfig.FLAVOR;
    public String J = "1";
    public String K = BuildConfig.FLAVOR;
    public boolean L = true;
    public boolean M = true;
    public String N = BuildConfig.FLAVOR;
    public String O = BuildConfig.FLAVOR;
    public boolean P = false;
    public String Q = "-1";
    public String R = "2";
    public String S = "300";
    public boolean T = true;
    public String U = BuildConfig.FLAVOR;
    public int V = 3;
    public String W = null;
    public int Z = 0;
    public boolean g0 = false;
    public HashSet<String> h0 = new HashSet<>();
    public boolean i0 = true;
    public boolean j0 = false;
    public int n0 = 0;
    public boolean p0 = false;
    public int q0 = 0;
    public String s0 = "openvpn.example.com";
    public String t0 = "1194";
    public boolean u0 = true;
    public boolean v0 = false;
    public String z0 = BuildConfig.FLAVOR;
    public boolean A0 = true;
    public boolean B0 = false;
    public String C0 = BuildConfig.FLAVOR;
    public UUID x0 = UUID.randomUUID();
    public int y0 = 9;
    public long r0 = System.currentTimeMillis();

    /* JADX INFO: renamed from: d.a.a.a$a, reason: collision with other inner class name */
    public class RunnableC0297a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f30080b;

        public RunnableC0297a(Context context) {
            this.f30080b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.p(this.f30080b);
        }
    }

    public static class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public enum c {
        NO_PADDING,
        PKCS1_PADDING
    }

    public a(String str) {
        this.f0 = new e[0];
        this.f30070f = str;
        this.f0 = new e[]{new e()};
    }

    public static String G(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            z.r(e2);
            str = "unknown";
        }
        return String.format(Locale.US, "%s %s", context.getPackageName(), str);
    }

    public static String H(String str, String str2) {
        if (str2 == null) {
            return String.format("%s %s\n", str, "file missing in config profile");
        }
        if (!I(str2)) {
            return String.format(Locale.ENGLISH, "%s %s\n", str, M(str2));
        }
        return String.format(Locale.ENGLISH, "<%s>\n%s\n</%s>\n", str, m(str2), str);
    }

    public static boolean I(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("[[INLINE]]") || str.startsWith("[[NAME]]");
    }

    public static String M(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n");
        if (strReplace.equals(str) && !strReplace.contains(" ") && !strReplace.contains("#") && !strReplace.contains(";") && !strReplace.equals(BuildConfig.FLAVOR)) {
            return str;
        }
        return '\"' + strReplace + '\"';
    }

    public static boolean h(Context context) {
        return u.a(context).getBoolean("ovpn3", false);
    }

    public static String m(String str) {
        return !str.contains("[[INLINE]]") ? str : str.substring(str.indexOf("[[INLINE]]") + 10);
    }

    public String A() {
        String strC = t.c(this.x0, true);
        if (strC != null) {
            return strC;
        }
        int i2 = this.f30069e;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 5) {
                    if (i2 != 6) {
                        return null;
                    }
                }
            }
            return this.f30079o;
        }
        return this.O;
    }

    public String B() {
        return String.format(Locale.US, "%d %s %s %s %s %s", Integer.valueOf(Build.VERSION.SDK_INT), Build.VERSION.RELEASE, NativeUtils.a(), Build.BRAND, Build.BOARD, Build.MODEL);
    }

    public String C(Context context, String str, boolean z) {
        byte[] bArrR;
        byte[] bArrDecode = Base64.decode(str, 0);
        if (this.f30069e == 8) {
            c cVar = z ? c.PKCS1_PADDING : c.NO_PADDING;
            Bundle bundle = new Bundle();
            bundle.putInt("de.blinkt.openvpn.api.RSA_PADDING_TYPE", cVar.ordinal());
            bArrR = o(context, bArrDecode, bundle);
        } else {
            bArrR = r(bArrDecode, z);
        }
        if (bArrR != null) {
            return Base64.encodeToString(bArrR, 2);
        }
        return null;
    }

    public Intent D(Context context) {
        String packageName = context.getPackageName();
        Intent intent = new Intent(context, (Class<?>) OpenVPNService.class);
        intent.putExtra(packageName + ".profileUUID", this.x0.toString());
        intent.putExtra(packageName + ".profileVersion", this.q0);
        return intent;
    }

    public UUID E() {
        return this.x0;
    }

    public String F() {
        return this.x0.toString().toLowerCase(Locale.ENGLISH);
    }

    public boolean J() {
        int i2 = this.f30069e;
        return i2 == 3 || i2 == 5 || i2 == 6 || i2 == 7;
    }

    public final void K() {
        this.f0 = new e[1];
        e eVar = new e();
        eVar.f30105b = this.s0;
        eVar.f30106c = this.t0;
        eVar.f30107d = this.u0;
        eVar.f30108e = BuildConfig.FLAVOR;
        this.f0[0] = eVar;
    }

    public int L(String str, String str2) {
        String str3;
        int i2 = this.f30069e;
        if ((i2 == 1 || i2 == 6) && (((str3 = this.f30079o) == null || str3.equals(BuildConfig.FLAVOR)) && str == null)) {
            return R.string.pkcs12_file_encryption_key;
        }
        int i3 = this.f30069e;
        if ((i3 == 0 || i3 == 5) && P() && TextUtils.isEmpty(this.O) && str == null) {
            return R.string.private_key_password;
        }
        if (!J()) {
            return 0;
        }
        if (TextUtils.isEmpty(this.D)) {
            return R.string.password;
        }
        if (TextUtils.isEmpty(this.C) && str2 == null) {
            return R.string.password;
        }
        return 0;
    }

    public Intent N(Context context) {
        return D(context);
    }

    public final byte[] O(PrivateKey privateKey, byte[] bArr, boolean z) {
        try {
            Method declaredMethod = privateKey.getClass().getSuperclass().getDeclaredMethod("getOpenSSLKey", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(privateKey, new Object[0]);
            declaredMethod.setAccessible(false);
            Method declaredMethod2 = objInvoke.getClass().getDeclaredMethod("getPkeyContext", new Class[0]);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod2.invoke(objInvoke, new Object[0])).intValue();
            declaredMethod2.setAccessible(false);
            return NativeUtils.rsasign(bArr, iIntValue, z);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException | InvalidKeyException e2) {
            z.o(R.string.error_rsa_sign, e2.getClass().toString(), e2.getLocalizedMessage());
            return null;
        }
    }

    public boolean P() {
        String str;
        if (TextUtils.isEmpty(this.f30075k)) {
            return false;
        }
        if (I(this.f30075k)) {
            str = this.f30075k;
        } else {
            char[] cArr = new char[2048];
            try {
                FileReader fileReader = new FileReader(this.f30075k);
                String str2 = BuildConfig.FLAVOR;
                for (int i2 = fileReader.read(cArr); i2 > 0; i2 = fileReader.read(cArr)) {
                    str2 = str2 + new String(cArr, 0, i2);
                }
                fileReader.close();
                str = str2;
            } catch (FileNotFoundException | IOException unused) {
            }
        }
        return str.contains("Proc-Type: 4,ENCRYPTED") || str.contains("-----BEGIN ENCRYPTED PRIVATE KEY-----");
    }

    public void R() {
        switch (this.y0) {
            case 0:
            case 1:
                this.X = Build.VERSION.SDK_INT < 19;
            case 2:
            case 3:
                K();
                this.i0 = true;
                if (this.h0 == null) {
                    this.h0 = new HashSet<>();
                }
                if (this.f0 == null) {
                    this.f0 = new e[0];
                    break;
                }
            case 4:
            case 5:
                if (TextUtils.isEmpty(this.l0)) {
                    this.T = true;
                    break;
                }
            case 6:
                for (e eVar : this.f0) {
                    if (eVar.f30112i == null) {
                        eVar.f30112i = e.a.NONE;
                    }
                }
            case 7:
                boolean z = this.j0;
                if (z) {
                    this.A0 = !z;
                    break;
                }
            case 8:
                if (!TextUtils.isEmpty(this.K) && !this.K.equals("AES-256-GCM") && !this.K.equals("AES-128-GCM")) {
                    this.z0 = "AES-256-GCM:AES-128-GCM:" + this.K;
                }
                break;
        }
        this.y0 = 9;
    }

    public final boolean S() {
        String str;
        if (this.H && (str = this.I) != null && str.contains("http-proxy-option ")) {
            return true;
        }
        for (e eVar : this.f0) {
            if (eVar.e()) {
                return true;
            }
        }
        return false;
    }

    public void T(Context context) {
        FileWriter fileWriter = new FileWriter(y.b(context));
        fileWriter.write(j(context, false));
        fileWriter.flush();
        fileWriter.close();
    }

    public void a(Context context) {
        int i2 = this.f30069e;
        if ((i2 == 2 || i2 == 7) && this.w0 == null) {
            new Thread(new RunnableC0297a(context)).start();
        }
    }

    public int b(Context context) {
        return c(context, h(context));
    }

    public int c(Context context, boolean z) {
        String str;
        int i2 = this.f30069e;
        if (i2 == 2 || i2 == 7 || i2 == 8) {
            if (this.f30071g == null) {
                return R.string.no_keystore_cert_selected;
            }
        } else if ((i2 == 0 || i2 == 5) && TextUtils.isEmpty(this.f30076l) && !this.B0) {
            return R.string.no_ca_cert_selected;
        }
        if (this.z && this.V == 0) {
            return R.string.deprecated_tls_remote;
        }
        if ((!this.x || this.f30069e == 4) && ((str = this.s) == null || e(str) == null)) {
            return R.string.ipv4_format_error;
        }
        if (!this.w) {
            if (!TextUtils.isEmpty(this.y) && k(this.y).size() == 0) {
                return R.string.custom_route_format_error;
            }
            if (!TextUtils.isEmpty(this.Y) && k(this.Y).size() == 0) {
                return R.string.custom_route_format_error;
            }
        }
        if (this.p && TextUtils.isEmpty(this.f30074j)) {
            return R.string.missing_tlsauth;
        }
        int i3 = this.f30069e;
        if ((i3 == 5 || i3 == 0) && (TextUtils.isEmpty(this.f30072h) || TextUtils.isEmpty(this.f30075k))) {
            return R.string.missing_certificates;
        }
        int i4 = this.f30069e;
        if ((i4 == 0 || i4 == 5) && TextUtils.isEmpty(this.f30076l)) {
            return R.string.missing_ca_certificate;
        }
        boolean z2 = true;
        for (e eVar : this.f0) {
            if (eVar.f30110g) {
                z2 = false;
            }
        }
        if (z2) {
            return R.string.remote_no_server_selected;
        }
        if (z) {
            int i5 = this.f30069e;
            if (i5 == 4) {
                return R.string.openvpn3_nostatickeys;
            }
            if (i5 == 1 || i5 == 6) {
                return R.string.openvpn3_pkcs12;
            }
            for (e eVar2 : this.f0) {
                e.a aVar = eVar2.f30112i;
                if (aVar == e.a.ORBOT || aVar == e.a.SOCKS5) {
                    return R.string.openvpn3_socksproxy;
                }
            }
        }
        for (e eVar3 : this.f0) {
            if (eVar3.f30112i == e.a.ORBOT) {
                if (S()) {
                    return R.string.error_orbot_and_proxy_options;
                }
                if (!s.c(context)) {
                    return R.string.no_orbotfound;
                }
            }
        }
        return R.string.no_error_found;
    }

    public final String e(String str) {
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length == 1) {
            strArrSplit = (str + "/32").split("/");
        }
        if (strArrSplit.length != 2) {
            return null;
        }
        try {
            int i2 = Integer.parseInt(strArrSplit[1]);
            if (i2 >= 0 && i2 <= 32) {
                long j2 = 4294967295L & (4294967295 << (32 - i2));
                return strArrSplit[0] + "  " + String.format(Locale.ENGLISH, "%d.%d.%d.%d", Long.valueOf(((-16777216) & j2) >> 24), Long.valueOf((16711680 & j2) >> 16), Long.valueOf((65280 & j2) >> 8), Long.valueOf(255 & j2));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.x0.equals(((a) obj).x0);
        }
        return false;
    }

    public void f() {
        this.s0 = "unknown";
        this.x = false;
        this.f30077m = false;
        this.w = false;
        this.M = false;
        this.A = false;
        this.z = false;
        this.P = false;
        this.X = true;
        this.p0 = false;
        this.Z = 0;
        this.L = false;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a clone() {
        a aVar = (a) super.clone();
        aVar.x0 = UUID.randomUUID();
        aVar.f0 = new e[this.f0.length];
        e[] eVarArr = this.f0;
        int length = eVarArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            aVar.f0[i3] = eVarArr[i2].clone();
            i2++;
            i3++;
        }
        aVar.h0 = (HashSet) this.h0.clone();
        return aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String j(android.content.Context r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 1496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.a.j(android.content.Context, boolean):java.lang.String");
    }

    public final Collection<String> k(String str) {
        Vector vector = new Vector();
        if (str == null) {
            return vector;
        }
        for (String str2 : str.split("[\n \t]")) {
            if (!str2.equals(BuildConfig.FLAVOR)) {
                String strE = e(str2);
                if (strE == null) {
                    return vector;
                }
                vector.add(strE);
            }
        }
        return vector;
    }

    public final Collection<String> l(String str) {
        Vector vector = new Vector();
        if (str == null) {
            return vector;
        }
        for (String str2 : str.split("[\n \t]")) {
            if (!str2.equals(BuildConfig.FLAVOR)) {
                vector.add(str2);
            }
        }
        return vector;
    }

    public final X509Certificate[] n(Context context) throws KeyChainException {
        String str;
        String str2 = this.m0;
        if (str2 == null || (str = this.f30071g) == null) {
            throw new KeyChainException("Alias or external auth provider name not set");
        }
        return h.c(context, str2, str);
    }

    public final byte[] o(Context context, byte[] bArr, Bundle bundle) {
        if (TextUtils.isEmpty(this.m0)) {
            return null;
        }
        try {
            return h.d(context, this.m0, this.f30071g, bArr, bundle);
        } catch (KeyChainException | InterruptedException e2) {
            z.o(R.string.error_extapp_sign, this.m0, e2.getClass().toString(), e2.getLocalizedMessage());
            return null;
        }
    }

    public String[] p(Context context) {
        return q(context, 5);
    }

    public synchronized String[] q(Context context, int i2) {
        String string;
        String string2;
        String str;
        Context applicationContext = context.getApplicationContext();
        try {
            try {
                X509Certificate[] x509CertificateArrN = this.f30069e == 8 ? n(applicationContext) : u(applicationContext);
                if (x509CertificateArrN == null) {
                    throw new b("No certificate returned from Keystore");
                }
                if (x509CertificateArrN.length > 1 || !TextUtils.isEmpty(this.f30076l)) {
                    StringWriter stringWriter = new StringWriter();
                    PemWriter pemWriter = new PemWriter(stringWriter);
                    for (int i3 = 1; i3 < x509CertificateArrN.length; i3++) {
                        pemWriter.writeObject(new PemObject("CERTIFICATE", x509CertificateArrN[i3].getEncoded()));
                    }
                    pemWriter.close();
                    string = stringWriter.toString();
                } else {
                    z.w(z.c.ERROR, BuildConfig.FLAVOR, applicationContext.getString(R.string.keychain_nocacert));
                    string = null;
                }
                if (TextUtils.isEmpty(this.f30076l)) {
                    string2 = null;
                } else {
                    try {
                        Certificate[] certificateArrA = a0.a(this.f30076l);
                        StringWriter stringWriter2 = new StringWriter();
                        PemWriter pemWriter2 = new PemWriter(stringWriter2);
                        for (Certificate certificate : certificateArrA) {
                            pemWriter2.writeObject(new PemObject("CERTIFICATE", certificate.getEncoded()));
                        }
                        pemWriter2.close();
                        string2 = stringWriter2.toString();
                    } catch (Exception e2) {
                        z.p("Could not read CA certificate" + e2.getLocalizedMessage());
                        string2 = null;
                    }
                }
                StringWriter stringWriter3 = new StringWriter();
                if (x509CertificateArrN.length >= 1) {
                    X509Certificate x509Certificate = x509CertificateArrN[0];
                    PemWriter pemWriter3 = new PemWriter(stringWriter3);
                    pemWriter3.writeObject(new PemObject("CERTIFICATE", x509Certificate.getEncoded()));
                    pemWriter3.close();
                }
                String string3 = stringWriter3.toString();
                if (string2 == null) {
                    str = null;
                } else {
                    String str2 = string;
                    string = string2;
                    str = str2;
                }
                return new String[]{string, str, string3};
            } catch (KeyChainException | b | IOException | IllegalArgumentException | InterruptedException | CertificateException e3) {
                e3.printStackTrace();
                z.o(R.string.keyChainAccessError, e3.getLocalizedMessage());
                z.n(R.string.keychain_access);
                if (Build.VERSION.SDK_INT == 16 && !this.f30071g.matches("^[a-zA-Z0-9]$")) {
                    z.n(R.string.jelly_keystore_alphanumeric_bug);
                }
                return null;
            }
        } catch (AssertionError e4) {
            if (i2 == 0) {
                return null;
            }
            z.p(String.format("Failure getting Keystore Keys (%s), retrying", e4.getLocalizedMessage()));
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e5) {
                z.r(e5);
            }
            return q(applicationContext, i2 - 1);
        }
    }

    public final byte[] r(byte[] bArr, boolean z) {
        PrivateKey privateKeyW = w();
        if (Build.VERSION.SDK_INT == 16) {
            return O(privateKeyW, bArr, z);
        }
        try {
            if (!privateKeyW.getAlgorithm().equals("EC")) {
                Cipher cipher = Cipher.getInstance(z ? "RSA/ECB/PKCS1PADDING" : "RSA/ECB/NoPadding");
                cipher.init(1, privateKeyW);
                return cipher.doFinal(bArr);
            }
            Signature signature = Signature.getInstance("NONEwithECDSA");
            signature.initSign(privateKeyW);
            signature.update(bArr);
            return signature.sign();
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            z.o(R.string.error_rsa_sign, e2.getClass().toString(), e2.getLocalizedMessage());
            return null;
        }
    }

    public String toString() {
        return this.f30070f;
    }

    public final X509Certificate[] u(Context context) {
        this.w0 = KeyChain.getPrivateKey(context, this.f30071g);
        return KeyChain.getCertificateChain(context, this.f30071g);
    }

    public PrivateKey w() {
        return this.w0;
    }

    public String y() {
        return TextUtils.isEmpty(this.f30070f) ? "No profile name" : this.f30070f;
    }

    public String z() {
        String strA = t.a(this.x0, true);
        return strA != null ? strA : this.C;
    }
}
