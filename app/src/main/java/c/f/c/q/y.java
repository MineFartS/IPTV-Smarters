package c.f.c.q;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f16230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f16231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Long> f16232c = new a.f.a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final long f16233a = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f16234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f16235c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f16236d;

        public a(String str, String str2, long j2) {
            this.f16234b = str;
            this.f16235c = str2;
            this.f16236d = j2;
        }

        public static String a(String str, String str2, long j2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j2);
                return jSONObject.toString();
            } catch (JSONException e2) {
                String strValueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(strValueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        public static String b(a aVar) {
            if (aVar == null) {
                return null;
            }
            return aVar.f16234b;
        }

        public static a d(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e2) {
                String strValueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
                sb.append("Failed to parse token: ");
                sb.append(strValueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        public boolean c(String str) {
            return System.currentTimeMillis() > this.f16236d + f16233a || !str.equals(this.f16235c);
        }
    }

    public y(Context context) {
        this.f16231b = context;
        this.f16230a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a("com.google.android.gms.appid-no-backup");
    }

    public static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
        sb.append(str);
        sb.append("|S|");
        sb.append("cre");
        return sb.toString();
    }

    public final void a(String str) {
        File file = new File(a.i.i.b.i(this.f16231b), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || g()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            d();
        } catch (IOException e2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(e2.getMessage());
                Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(strValueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    public final String c(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    public synchronized void d() {
        this.f16232c.clear();
        this.f16230a.edit().clear().commit();
    }

    public final long e(String str) {
        String string = this.f16230a.getString(b(str, "cre"), null);
        if (string == null) {
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public synchronized a f(String str, String str2, String str3) {
        return a.d(this.f16230a.getString(c(str, str2, str3), null));
    }

    public synchronized boolean g() {
        return this.f16230a.getAll().isEmpty();
    }

    public synchronized void h(String str, String str2, String str3, String str4, String str5) {
        String strA = a.a(str4, str5, System.currentTimeMillis());
        if (strA == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f16230a.edit();
        editorEdit.putString(c(str, str2, str3), strA);
        editorEdit.commit();
    }

    public synchronized long i(String str) {
        long j2;
        j2 = j(str);
        this.f16232c.put(str, Long.valueOf(j2));
        return j2;
    }

    public final long j(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f16230a.contains(b(str, "cre"))) {
            return e(str);
        }
        SharedPreferences.Editor editorEdit = this.f16230a.edit();
        editorEdit.putString(b(str, "cre"), String.valueOf(jCurrentTimeMillis));
        editorEdit.commit();
        return jCurrentTimeMillis;
    }
}
