package c.f.a.c.b.a.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c.f.a.c.f.q.o;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lock f11528a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("sLk")
    public static a f11529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f11530c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("mLk")
    public final SharedPreferences f11531d;

    public a(Context context) {
        this.f11531d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull Context context) {
        o.i(context);
        Lock lock = f11528a;
        lock.lock();
        try {
            if (f11529b == null) {
                f11529b = new a(context.getApplicationContext());
            }
            a aVar = f11529b;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            f11528a.unlock();
            throw th;
        }
    }

    public static final String d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @RecentlyNullable
    public GoogleSignInAccount b() {
        String strC;
        String strC2 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strC2) || (strC = c(d("googleSignInAccount", strC2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.S(strC);
        } catch (JSONException unused) {
            return null;
        }
    }

    @RecentlyNullable
    public final String c(@RecentlyNonNull String str) {
        this.f11530c.lock();
        try {
            return this.f11531d.getString(str, null);
        } finally {
            this.f11530c.unlock();
        }
    }
}
