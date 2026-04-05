package c.f.c.s.q;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f16297a = {"*", "FCM", "GCM", BuildConfig.FLAVOR};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f16298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16299c;

    public b(c.f.c.c cVar) {
        this.f16298b = cVar.g().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f16299c = b(cVar);
    }

    public static String b(c.f.c.c cVar) {
        String strD = cVar.j().d();
        if (strD != null) {
            return strD;
        }
        String strC = cVar.j().c();
        if (!strC.startsWith("1:") && !strC.startsWith("2:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static String c(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & DateTimeFieldType.CLOCKHOUR_OF_HALFDAY) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    public final String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e2) {
            Log.w("ContentValues", "Invalid key stored " + e2);
            return null;
        }
    }

    public String f() {
        synchronized (this.f16298b) {
            String strG = g();
            if (strG != null) {
                return strG;
            }
            return h();
        }
    }

    public final String g() {
        String string;
        synchronized (this.f16298b) {
            string = this.f16298b.getString("|S|id", null);
        }
        return string;
    }

    public final String h() {
        synchronized (this.f16298b) {
            String string = this.f16298b.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey publicKeyE = e(string);
            if (publicKeyE == null) {
                return null;
            }
            return c(publicKeyE);
        }
    }

    public String i() {
        synchronized (this.f16298b) {
            for (String str : f16297a) {
                String string = this.f16298b.getString(a(this.f16299c, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
