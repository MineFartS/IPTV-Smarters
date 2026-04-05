package d.a.a.d;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.nst.iptvsmarterstvbox.R;
import d.a.a.d.p;
import d.a.a.d.x;
import de.blinkt.openvpn.core.NativeUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Vector;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes2.dex */
public class z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f30212e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f30213f = "NOPROCESS";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f30214g = 2132018577;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Intent f30215h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f30216i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f30217j = false;
    public static l r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f30218k = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final byte[] f30220m = {-58, -42, -44, -106, 90, -88, -87, -88, -52, -124, 84, 117, 66, 79, -112, -111, -46, 86, -37, 109};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f30221n = {-99, -69, 45, 71, 114, -116, 82, 66, -99, -122, 50, -70, -56, -111, 98, -35, -65, 105, 82, 43};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f30222o = {-116, -115, -118, -89, -116, -112, 120, 55, 79, -8, -119, -23, 106, -114, -85, -56, -4, 105, 26, -57};
    public static final byte[] p = {-92, 111, -42, -46, 123, -96, -60, 79, -27, -31, 49, 103, 11, -54, -68, -27, DateTimeFieldType.HOUR_OF_DAY, 2, 121, 104};
    public static f q = f.LEVEL_NOTCONNECTED;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedList<m> f30208a = new LinkedList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Vector<d> f30209b = new Vector<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Vector<e> f30210c = new Vector<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Vector<b> f30211d = new Vector<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static x f30219l = new x();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f30224b;

        static {
            int[] iArr = new int[p.b.values().length];
            f30224b = iArr;
            try {
                iArr[p.b.noNetwork.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30224b[p.b.screenOff.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30224b[p.b.userPause.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[f.values().length];
            f30223a = iArr2;
            try {
                iArr2[f.LEVEL_CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface b {
        void c1(long j2, long j3, long j4, long j5);
    }

    public enum c {
        INFO(2),
        ERROR(-2),
        WARNING(1),
        VERBOSE(3),
        DEBUG(4);

        public int mValue;

        c(int i2) {
            this.mValue = i2;
        }

        public static c getEnumByValue(int i2) {
            if (i2 == -2) {
                return ERROR;
            }
            if (i2 == 1) {
                return WARNING;
            }
            if (i2 == 2) {
                return INFO;
            }
            if (i2 == 3) {
                return VERBOSE;
            }
            if (i2 != 4) {
                return null;
            }
            return DEBUG;
        }

        public int getInt() {
            return this.mValue;
        }
    }

    public interface d {
        void a(m mVar);
    }

    public interface e {
        void I2(String str);

        void J(String str, String str2, int i2, f fVar, Intent intent);
    }

    static {
        v();
    }

    public static void A(m mVar) {
        B(mVar, false);
    }

    public static synchronized void B(m mVar, boolean z) {
        if (z) {
            f30208a.addFirst(mVar);
        } else {
            f30208a.addLast(mVar);
            if (r != null) {
                throw null;
            }
        }
        if (f30208a.size() > 1500) {
            while (true) {
                LinkedList<m> linkedList = f30208a;
                if (linkedList.size() <= 1000) {
                    break;
                } else {
                    linkedList.removeFirst();
                }
            }
            if (r != null) {
                throw null;
            }
        }
        Iterator<d> it = f30209b.iterator();
        while (it.hasNext()) {
            it.next().a(mVar);
        }
    }

    public static synchronized void C(b bVar) {
        f30211d.remove(bVar);
    }

    public static synchronized void D(d dVar) {
        f30209b.remove(dVar);
    }

    public static synchronized void E(e eVar) {
        f30210c.remove(eVar);
    }

    public static void F(String str) {
        f30216i = str;
        Iterator<e> it = f30210c.iterator();
        while (it.hasNext()) {
            it.next().I2(str);
        }
    }

    public static synchronized void G(long j2, long j3) {
        x.b bVarB = f30219l.b(j2, j3);
        Iterator<b> it = f30211d.iterator();
        while (it.hasNext()) {
            it.next().c1(j2, j3, bVarB.a(), bVarB.b());
        }
    }

    public static void H(p.b bVar) {
        int i2;
        f fVar;
        String str;
        int i3 = a.f30224b[bVar.ordinal()];
        if (i3 == 1) {
            i2 = R.string.state_nonetwork;
            fVar = f.LEVEL_NONETWORK;
            str = "NONETWORK";
        } else if (i3 == 2) {
            i2 = R.string.state_screenoff;
            fVar = f.LEVEL_VPNPAUSED;
            str = "SCREENOFF";
        } else {
            if (i3 != 3) {
                return;
            }
            i2 = R.string.state_userpause;
            fVar = f.LEVEL_VPNPAUSED;
            str = "USERPAUSE";
        }
        J(str, BuildConfig.FLAVOR, i2, fVar);
    }

    public static void I(String str, String str2) {
        if (q == f.LEVEL_WAITING_FOR_USER_INPUT && str.equals("GET_CONFIG")) {
            return;
        }
        J(str, str2, i(str), h(str));
    }

    public static synchronized void J(String str, String str2, int i2, f fVar) {
        K(str, str2, i2, fVar, null);
    }

    public static synchronized void K(String str, String str2, int i2, f fVar, Intent intent) {
        if (q == f.LEVEL_CONNECTED && (str.equals("WAIT") || str.equals("AUTH"))) {
            A(new m(c.DEBUG, String.format("Ignoring OpenVPN Status in CONNECTED state (%s->%s): %s", str, fVar.toString(), str2)));
            return;
        }
        if (str.equals("AUTH_FAILED") && str2.equals("Private Key")) {
            str = "AUTH_FAILED_PRIVATE_KEY";
        }
        f30213f = str;
        f30212e = str2;
        f30214g = i2;
        q = fVar;
        f30215h = intent;
        Iterator<e> it = f30210c.iterator();
        while (it.hasNext()) {
            it.next().J(str, str2, i2, fVar, intent);
        }
    }

    public static synchronized void a(b bVar) {
        x.b bVarD = f30219l.d(null);
        bVar.c1(bVarD.c(), bVarD.d(), bVarD.a(), bVarD.b());
        f30211d.add(bVar);
    }

    public static synchronized void b(d dVar) {
        f30209b.add(dVar);
    }

    public static synchronized void c(e eVar) {
        if (!f30210c.contains(eVar)) {
            f30210c.add(eVar);
            String str = f30213f;
            if (str != null) {
                eVar.J(str, f30212e, f30214g, q, f30215h);
            }
        }
    }

    public static synchronized void d() {
        f30208a.clear();
        v();
        if (r != null) {
            throw null;
        }
    }

    public static void e() {
        if (r != null) {
            throw null;
        }
    }

    public static String f(Context context) {
        String strSubstring = f30212e;
        if (a.f30223a[q.ordinal()] == 1) {
            String[] strArrSplit = f30212e.split(",");
            if (strArrSplit.length >= 7) {
                strSubstring = String.format(Locale.US, "%s %s", strArrSplit[1], strArrSplit[6]);
            }
        }
        while (strSubstring.endsWith(",")) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
        String str = f30213f;
        if (str.equals("NOPROCESS")) {
            return strSubstring;
        }
        int i2 = f30214g;
        if (i2 == R.string.state_waitconnectretry) {
            return context.getString(R.string.state_waitconnectretry, f30212e);
        }
        String string = context.getString(i2);
        if (f30214g == R.string.unknown_state) {
            strSubstring = str + strSubstring;
        }
        if (strSubstring.length() > 0) {
            string = string + ": ";
        }
        return string + strSubstring;
    }

    public static String g() {
        return f30216i;
    }

    public static f h(String str) {
        String[] strArr = {"CONNECTING", "WAIT", "RECONNECTING", "RESOLVE", "TCP_CONNECT"};
        String[] strArr2 = {"AUTH", "GET_CONFIG", "ASSIGN_IP", "ADD_ROUTES", "AUTH_PENDING"};
        String[] strArr3 = {"CONNECTED"};
        String[] strArr4 = {"DISCONNECTED", "EXITING"};
        for (int i2 = 0; i2 < 5; i2++) {
            if (str.equals(strArr[i2])) {
                return f.LEVEL_CONNECTING_NO_SERVER_REPLY_YET;
            }
        }
        for (int i3 = 0; i3 < 5; i3++) {
            if (str.equals(strArr2[i3])) {
                return f.LEVEL_CONNECTING_SERVER_REPLIED;
            }
        }
        for (int i4 = 0; i4 < 1; i4++) {
            if (str.equals(strArr3[i4])) {
                return f.LEVEL_CONNECTED;
            }
        }
        for (int i5 = 0; i5 < 2; i5++) {
            if (str.equals(strArr4[i5])) {
                return f.LEVEL_NOTCONNECTED;
            }
        }
        return f.UNKNOWN_LEVEL;
    }

    public static int i(String str) {
        str.hashCode();
        switch (str) {
            case "CONNECTED":
                return R.string.state_connected;
            case "RECONNECTING":
                return R.string.state_reconnecting;
            case "AUTH_PENDING":
                return R.string.state_auth_pending;
            case "EXITING":
                return R.string.state_exiting;
            case "GET_CONFIG":
                return R.string.state_get_config;
            case "CONNECTING":
                return R.string.state_connecting;
            case "ASSIGN_IP":
                return R.string.state_assign_ip;
            case "AUTH":
                return R.string.state_auth;
            case "WAIT":
                return R.string.state_wait;
            case "TCP_CONNECT":
                return R.string.state_tcp_connect;
            case "ADD_ROUTES":
                return R.string.state_add_routes;
            case "DISCONNECTED":
                return R.string.state_disconnected;
            case "RESOLVE":
                return R.string.state_resolve;
            default:
                return R.string.unknown_state;
        }
    }

    public static synchronized m[] j() {
        LinkedList<m> linkedList;
        linkedList = f30208a;
        return (m[]) linkedList.toArray(new m[linkedList.size()]);
    }

    public static boolean k() {
        return (q == f.LEVEL_AUTH_FAILED || q == f.LEVEL_NOTCONNECTED) ? false : true;
    }

    public static void l(int i2, Object... objArr) {
        A(new m(c.DEBUG, i2, objArr));
    }

    public static void m(String str) {
        A(new m(c.DEBUG, str));
    }

    public static void n(int i2) {
        A(new m(c.ERROR, i2));
    }

    public static void o(int i2, Object... objArr) {
        A(new m(c.ERROR, i2, objArr));
    }

    public static void p(String str) {
        A(new m(c.ERROR, str));
    }

    public static void q(c cVar, String str, Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        A(str != null ? new m(cVar, R.string.unhandled_exception_context, exc.getMessage(), stringWriter.toString(), str) : new m(cVar, R.string.unhandled_exception, exc.getMessage(), stringWriter.toString()));
    }

    public static void r(Exception exc) {
        q(c.ERROR, null, exc);
    }

    public static void s(String str, Exception exc) {
        q(c.ERROR, str, exc);
    }

    public static void t(int i2, Object... objArr) {
        A(new m(c.INFO, i2, objArr));
    }

    public static void u(String str) {
        A(new m(c.INFO, str));
    }

    public static void v() {
        String strA;
        try {
            strA = NativeUtils.a();
        } catch (UnsatisfiedLinkError unused) {
            strA = "error";
        }
        t(R.string.mobile_info, Build.MODEL, Build.BOARD, Build.BRAND, Integer.valueOf(Build.VERSION.SDK_INT), strA, Build.VERSION.RELEASE, Build.ID, Build.FINGERPRINT, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
    }

    public static synchronized void w(c cVar, String str, String str2) {
        A(new m(cVar, str + str2));
    }

    public static void x(c cVar, int i2, String str) {
        A(new m(cVar, i2, str));
    }

    public static void y(int i2, Object... objArr) {
        A(new m(c.WARNING, i2, objArr));
    }

    public static void z(String str) {
        A(new m(c.WARNING, str));
    }
}
