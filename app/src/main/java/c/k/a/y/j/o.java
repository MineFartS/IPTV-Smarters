package c.k.a.y.j;

import c.k.a.r;
import java.net.ProtocolException;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f18468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18470c;

    public o(r rVar, int i2, String str) {
        this.f18468a = rVar;
        this.f18469b = i2;
        this.f18470c = str;
    }

    public static o a(String str) throws ProtocolException {
        r rVar;
        String strSubstring;
        int i2 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                rVar = r.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                rVar = r.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            rVar = r.HTTP_1_0;
            i2 = 4;
        }
        int i3 = i2 + 3;
        if (str.length() < i3) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int i4 = Integer.parseInt(str.substring(i2, i3));
            if (str.length() <= i3) {
                strSubstring = BuildConfig.FLAVOR;
            } else {
                if (str.charAt(i3) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                strSubstring = str.substring(i2 + 4);
            }
            return new o(rVar, i4, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18468a == r.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f18469b);
        if (this.f18470c != null) {
            sb.append(' ');
            sb.append(this.f18470c);
        }
        return sb.toString();
    }
}
