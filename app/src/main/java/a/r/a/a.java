package a.r.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f3083a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f3084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f3085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f3086d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<String, ArrayList<c>> f3087e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<b> f3088f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f3089g;

    /* JADX INFO: renamed from: a.r.a.a$a, reason: collision with other inner class name */
    public class HandlerC0067a extends Handler {
        public HandlerC0067a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f3091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<c> f3092b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f3091a = intent;
            this.f3092b = arrayList;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IntentFilter f3093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BroadcastReceiver f3094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f3096d;

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f3094b);
            sb.append(" filter=");
            sb.append(this.f3093a);
            if (this.f3096d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public a(Context context) {
        this.f3085c = context;
        this.f3089g = new HandlerC0067a(context.getMainLooper());
    }

    public static a b(Context context) {
        a aVar;
        synchronized (f3083a) {
            if (f3084b == null) {
                f3084b = new a(context.getApplicationContext());
            }
            aVar = f3084b;
        }
        return aVar;
    }

    public void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f3086d) {
                size = this.f3088f.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                this.f3088f.toArray(bVarArr);
                this.f3088f.clear();
            }
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = bVarArr[i2];
                int size2 = bVar.f3092b.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    c cVar = bVar.f3092b.get(i3);
                    if (!cVar.f3096d) {
                        cVar.f3094b.onReceive(this.f3085c, bVar.f3091a);
                    }
                }
            }
        }
    }

    public boolean c(Intent intent) {
        int i2;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        synchronized (this.f3086d) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f3085c.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<c> arrayList3 = this.f3087e.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i3 = 0;
                while (i3 < arrayList3.size()) {
                    c cVar = arrayList3.get(i3);
                    if (z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f3093a);
                    }
                    if (cVar.f3095c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i2 = i3;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = strResolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i2 = i3;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = strResolveTypeIfNeeded;
                        int iMatch = cVar.f3093a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (iMatch >= 0) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(cVar);
                            cVar.f3095c = true;
                            i3 = i2 + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            strResolveTypeIfNeeded = str2;
                        } else if (z) {
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + (iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                        }
                    }
                    arrayList4 = arrayList;
                    i3 = i2 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    strResolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i4 = 0; i4 < arrayList5.size(); i4++) {
                        ((c) arrayList5.get(i4)).f3095c = false;
                    }
                    this.f3088f.add(new b(intent, arrayList5));
                    if (!this.f3089g.hasMessages(1)) {
                        this.f3089g.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
