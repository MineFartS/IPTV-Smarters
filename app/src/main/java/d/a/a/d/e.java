package d.a.a.d;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class e implements Serializable, Cloneable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f30115l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30105b = "openvpn.example.com";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30106c = "1194";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30107d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f30108e = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30109f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f30110g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f30111h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f30112i = a.NONE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f30113j = "proxy.example.com";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f30114k = "8080";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f30116m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f30117n = null;

    public enum a {
        NONE,
        HTTP,
        SOCKS5,
        ORBOT
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return (e) super.clone();
    }

    public String b(boolean z) {
        StringBuilder sb;
        String str;
        String str2 = (((BuildConfig.FLAVOR + "remote ") + this.f30105b) + " ") + this.f30106c;
        if (this.f30107d) {
            sb = new StringBuilder();
            sb.append(str2);
            str = " udp\n";
        } else {
            sb = new StringBuilder();
            sb.append(str2);
            str = " tcp-client\n";
        }
        sb.append(str);
        String string = sb.toString();
        if (this.f30111h != 0) {
            string = string + String.format(Locale.US, " connect-timeout  %d\n", Integer.valueOf(this.f30111h));
        }
        if ((z || e()) && this.f30112i == a.HTTP) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            Locale locale = Locale.US;
            sb2.append(String.format(locale, "http-proxy %s %s\n", this.f30113j, this.f30114k));
            String string2 = sb2.toString();
            if (this.f30115l) {
                string = string2 + String.format(locale, "<http-proxy-user-pass>\n%s\n%s\n</http-proxy-user-pass>\n", this.f30116m, this.f30117n);
            } else {
                string = string2;
            }
        }
        if (e() && this.f30112i == a.SOCKS5) {
            string = string + String.format(Locale.US, "socks-proxy %s %s\n", this.f30113j, this.f30114k);
        }
        if (TextUtils.isEmpty(this.f30108e) || !this.f30109f) {
            return string;
        }
        return (string + this.f30108e) + "\n";
    }

    public boolean c() {
        return TextUtils.isEmpty(this.f30108e) || !this.f30109f;
    }

    public boolean e() {
        return this.f30109f && this.f30108e.contains("http-proxy-option ");
    }
}
