package a.d.b;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICustomTabsService f1145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentName f1146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f1147c;

    public class a extends ICustomTabsCallback.Stub {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Handler f1148b = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.d.b.b f1149c;

        /* JADX INFO: renamed from: a.d.b.c$a$a, reason: collision with other inner class name */
        public class RunnableC0019a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f1151b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f1152c;

            public RunnableC0019a(int i2, Bundle bundle) {
                this.f1151b = i2;
                this.f1152c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1149c.onNavigationEvent(this.f1151b, this.f1152c);
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f1154b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f1155c;

            public b(String str, Bundle bundle) {
                this.f1154b = str;
                this.f1155c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1149c.extraCallback(this.f1154b, this.f1155c);
            }
        }

        /* JADX INFO: renamed from: a.d.b.c$a$c, reason: collision with other inner class name */
        public class RunnableC0020c implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Bundle f1157b;

            public RunnableC0020c(Bundle bundle) {
                this.f1157b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1149c.onMessageChannelReady(this.f1157b);
            }
        }

        public class d implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f1159b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f1160c;

            public d(String str, Bundle bundle) {
                this.f1159b = str;
                this.f1160c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1149c.onPostMessage(this.f1159b, this.f1160c);
            }
        }

        public class e implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f1162b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Uri f1163c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ boolean f1164d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Bundle f1165e;

            public e(int i2, Uri uri, boolean z, Bundle bundle) {
                this.f1162b = i2;
                this.f1163c = uri;
                this.f1164d = z;
                this.f1165e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1149c.onRelationshipValidationResult(this.f1162b, this.f1163c, this.f1164d, this.f1165e);
            }
        }

        public a(a.d.b.b bVar) {
            this.f1149c = bVar;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(String str, Bundle bundle) {
            if (this.f1149c == null) {
                return;
            }
            this.f1148b.post(new b(str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public Bundle extraCallbackWithResult(String str, Bundle bundle) {
            a.d.b.b bVar = this.f1149c;
            if (bVar == null) {
                return null;
            }
            return bVar.extraCallbackWithResult(str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(Bundle bundle) {
            if (this.f1149c == null) {
                return;
            }
            this.f1148b.post(new RunnableC0020c(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int i2, Bundle bundle) {
            if (this.f1149c == null) {
                return;
            }
            this.f1148b.post(new RunnableC0019a(i2, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(String str, Bundle bundle) {
            if (this.f1149c == null) {
                return;
            }
            this.f1148b.post(new d(str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int i2, Uri uri, boolean z, Bundle bundle) {
            if (this.f1149c == null) {
                return;
            }
            this.f1148b.post(new e(i2, uri, z, bundle));
        }
    }

    public c(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
        this.f1145a = iCustomTabsService;
        this.f1146b = componentName;
        this.f1147c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    public final ICustomTabsCallback.Stub b(b bVar) {
        return new a(bVar);
    }

    public f c(b bVar) {
        return d(bVar, null);
    }

    public final f d(b bVar, PendingIntent pendingIntent) {
        boolean zNewSession;
        ICustomTabsCallback.Stub stubB = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zNewSession = this.f1145a.newSessionWithExtras(stubB, bundle);
            } else {
                zNewSession = this.f1145a.newSession(stubB);
            }
            if (zNewSession) {
                return new f(this.f1145a, stubB, this.f1146b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean e(long j2) {
        try {
            return this.f1145a.warmup(j2);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
