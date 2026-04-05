package c.f.a.c.j.h;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class d3 implements h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Uri, d3> f13255a = new a.f.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f13256b = {TransferTable.COLUMN_KEY, "value"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContentResolver f13257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f13258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ContentObserver f13259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f13260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Map<String, String> f13261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<e3> f13262h;

    public d3(ContentResolver contentResolver, Uri uri) {
        c3 c3Var = new c3(this, null);
        this.f13259e = c3Var;
        this.f13260f = new Object();
        this.f13262h = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f13257c = contentResolver;
        this.f13258d = uri;
        contentResolver.registerContentObserver(uri, false, c3Var);
    }

    public static d3 b(ContentResolver contentResolver, Uri uri) {
        d3 d3Var;
        synchronized (d3.class) {
            Map<Uri, d3> map = f13255a;
            d3Var = map.get(uri);
            if (d3Var == null) {
                try {
                    d3 d3Var2 = new d3(contentResolver, uri);
                    try {
                        map.put(uri, d3Var2);
                    } catch (SecurityException unused) {
                    }
                    d3Var = d3Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return d3Var;
    }

    public static synchronized void e() {
        for (d3 d3Var : f13255a.values()) {
            d3Var.f13257c.unregisterContentObserver(d3Var.f13259e);
        }
        f13255a.clear();
    }

    @Override // c.f.a.c.j.h.h3
    public final /* bridge */ /* synthetic */ Object a(String str) {
        return c().get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final Map<String, String> c() {
        ?? r0;
        Map<String, String> map;
        Map<String, String> map2 = this.f13261g;
        ?? r02 = map2;
        if (map2 == null) {
            synchronized (this.f13260f) {
                Map<String, String> map3 = this.f13261g;
                r0 = map3;
                if (map3 == null) {
                    ?? AllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) f3.a(new g3(this) { // from class: c.f.a.c.j.h.b3

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final d3 f13212a;

                                {
                                    this.f13212a = this;
                                }

                                @Override // c.f.a.c.j.h.g3
                                public final Object zza() {
                                    return this.f13212a.f();
                                }
                            });
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(AllowThreadDiskReads);
                            map = null;
                        }
                        this.f13261g = map;
                        AllowThreadDiskReads = map;
                        r0 = AllowThreadDiskReads;
                    } finally {
                        StrictMode.setThreadPolicy(AllowThreadDiskReads);
                    }
                }
            }
            r02 = r0;
        }
        return r02 != 0 ? r02 : Collections.emptyMap();
    }

    public final void d() {
        synchronized (this.f13260f) {
            this.f13261g = null;
            x3.c();
        }
        synchronized (this) {
            Iterator<e3> it = this.f13262h.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }

    public final /* synthetic */ Map f() {
        Cursor cursorQuery = this.f13257c.query(this.f13258d, f13256b, null, null, null);
        if (cursorQuery == null) {
            return Collections.emptyMap();
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map aVar = count <= 256 ? new a.f.a(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                aVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return aVar;
        } finally {
            cursorQuery.close();
        }
    }
}
