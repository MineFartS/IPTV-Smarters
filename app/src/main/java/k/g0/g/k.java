package k.g0.g;

import java.net.ProtocolException;
import k.y;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f30654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30656c;

    public k(y yVar, int i2, String str) {
        this.f30654a = yVar;
        this.f30655b = i2;
        this.f30656c = str;
    }

    public static k a(String str) throws ProtocolException {
        y yVar;
        String strSubstring;
        int i2 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                yVar = y.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                yVar = y.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            yVar = y.HTTP_1_0;
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
            return new k(yVar, i4, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f30654a == y.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f30655b);
        if (this.f30656c != null) {
            sb.append(' ');
            sb.append(this.f30656c);
        }
        return sb.toString();
    }
}
