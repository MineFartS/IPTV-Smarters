package d.a.a.c;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Binder;
import d.a.a.d.u;
import de.blinkt.openvpn.api.ConfirmDialog;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f30088a;

    public b(Context context) {
        this.f30088a = context;
    }

    public void a(String str) {
        Set<String> setE = e();
        setE.add(str);
        h(setE);
    }

    public String b(PackageManager packageManager) {
        for (String str : e()) {
            try {
            } catch (PackageManager.NameNotFoundException unused) {
                g(str);
            }
            if (Binder.getCallingUid() == packageManager.getApplicationInfo(str, 0).uid) {
                return str;
            }
        }
        throw new SecurityException("Unauthorized OpenVPN API Caller");
    }

    public boolean c(Context context, String str) {
        if (str == null) {
            str = "de.blinkt.openvpn.ANYPACKAGE";
        }
        if (f(str)) {
            return true;
        }
        Intent intent = new Intent(context, (Class<?>) ConfirmDialog.class);
        intent.addFlags(268435456);
        intent.putExtra("android.intent.extra.PACKAGE_NAME", str);
        context.startActivity(intent);
        return false;
    }

    public void d() {
        h(new HashSet());
    }

    public Set<String> e() {
        return u.a(this.f30088a).getStringSet("allowed_apps", new HashSet());
    }

    public boolean f(String str) {
        return e().contains(str);
    }

    public void g(String str) {
        Set<String> setE = e();
        setE.remove(str);
        h(setE);
    }

    public final void h(Set<String> set) {
        SharedPreferences sharedPreferencesA = u.a(this.f30088a);
        SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
        editorEdit.putStringSet("allowed_apps", set);
        editorEdit.putInt("counter", sharedPreferencesA.getInt("counter", 0) + 1);
        editorEdit.apply();
    }
}
