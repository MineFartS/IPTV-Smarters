package c.f.c.q;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import c.f.c.p.f;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.c.c f16206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f16207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.c.e.d f16208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.c.r.b<c.f.c.v.i> f16209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.c.r.b<c.f.c.p.f> f16210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.c.s.g f16211f;

    public p(c.f.c.c cVar, s sVar, c.f.a.c.e.d dVar, c.f.c.r.b<c.f.c.v.i> bVar, c.f.c.r.b<c.f.c.p.f> bVar2, c.f.c.s.g gVar) {
        this.f16206a = cVar;
        this.f16207b = sVar;
        this.f16208c = dVar;
        this.f16209d = bVar;
        this.f16210e = bVar2;
        this.f16211f = gVar;
    }

    public p(c.f.c.c cVar, s sVar, c.f.c.r.b<c.f.c.v.i> bVar, c.f.c.r.b<c.f.c.p.f> bVar2, c.f.c.s.g gVar) {
        this(cVar, sVar, new c.f.a.c.e.d(cVar.g()), bVar, bVar2, gVar);
    }

    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static boolean f(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    public final c.f.a.c.o.i<String> b(c.f.a.c.o.i<Bundle> iVar) {
        return iVar.h(h.a(), new c.f.a.c.o.a(this) { // from class: c.f.c.q.o

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final p f16205a;

            {
                this.f16205a = this;
            }

            @Override // c.f.a.c.o.a
            public Object a(c.f.a.c.o.i iVar2) {
                return this.f16205a.g(iVar2);
            }
        });
    }

    public final String c() {
        try {
            return a(MessageDigest.getInstance("SHA-1").digest(this.f16206a.i().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public c.f.a.c.o.i<String> d(String str, String str2, String str3) {
        return b(i(str, str2, str3, new Bundle()));
    }

    public final String e(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        String strValueOf = String.valueOf(bundle);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 21);
        sb.append("Unexpected response: ");
        sb.append(strValueOf);
        Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public final /* synthetic */ String g(c.f.a.c.o.i iVar) {
        return e((Bundle) iVar.l(IOException.class));
    }

    public final Bundle h(String str, String str2, String str3, Bundle bundle) {
        f.a aVarA;
        bundle.putString(ClientConstants.DOMAIN_QUERY_PARAM_SCOPES, str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f16206a.j().c());
        bundle.putString("gmsv", Integer.toString(this.f16207b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f16207b.a());
        bundle.putString("app_ver_name", this.f16207b.b());
        bundle.putString("firebase-app-name-hash", c());
        try {
            String strB = ((c.f.c.s.l) c.f.a.c.o.l.a(this.f16211f.a(false))).b();
            if (TextUtils.isEmpty(strB)) {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strB);
            }
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e2);
        }
        bundle.putString("cliv", "fiid-21.0.1");
        c.f.c.p.f fVar = this.f16210e.get();
        c.f.c.v.i iVar = this.f16209d.get();
        if (fVar != null && iVar != null && (aVarA = fVar.a("fire-iid")) != f.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(aVarA.getCode()));
            bundle.putString("Firebase-Client", iVar.a());
        }
        return bundle;
    }

    public final c.f.a.c.o.i<Bundle> i(String str, String str2, String str3, Bundle bundle) {
        h(str, str2, str3, bundle);
        return this.f16208c.a(bundle);
    }

    public c.f.a.c.o.i<?> j(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        String strValueOf2 = String.valueOf(str3);
        return b(i(str, str2, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/"), bundle));
    }

    public c.f.a.c.o.i<?> k(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String strValueOf2 = String.valueOf(str3);
        return b(i(str, str2, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/"), bundle));
    }
}
