package c.f.a.e.a.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class i1 implements s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.e.a.e.a f15474a = new c.f.a.e.a.e.a("FakeAssetPackService");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicInteger f15475b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f15477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0 f15478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f15479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u1 f15480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c.f.a.e.a.e.z<Executor> f15481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f15482i = new Handler(Looper.getMainLooper());

    public i1(File file, s sVar, o0 o0Var, Context context, u1 u1Var, c.f.a.e.a.e.z<Executor> zVar) {
        this.f15476c = file.getAbsolutePath();
        this.f15477d = sVar;
        this.f15478e = o0Var;
        this.f15479f = context;
        this.f15480g = u1Var;
        this.f15481h = zVar;
    }

    public static long f(int i2, long j2) {
        if (i2 == 2) {
            return j2 / 2;
        }
        if (i2 == 3 || i2 == 4) {
            return j2;
        }
        return 0L;
    }

    public static String l(File file) throws c.f.a.e.a.c.a {
        try {
            return j1.a(Arrays.asList(file));
        } catch (IOException e2) {
            throw new c.f.a.e.a.c.a(String.format("Could not digest file: %s.", file), e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new c.f.a.e.a.c.a("SHA256 algorithm not supported.", e3);
        }
    }

    @Override // c.f.a.e.a.b.s2
    public final void a(int i2, String str, String str2, int i3) {
        f15474a.d("notifyChunkTransferred", new Object[0]);
    }

    @Override // c.f.a.e.a.b.s2
    public final void b(final int i2, final String str) {
        f15474a.d("notifyModuleCompleted", new Object[0]);
        this.f15481h.a().execute(new Runnable(this, i2, str) { // from class: c.f.a.e.a.b.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final i1 f15419b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f15420c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f15421d;

            {
                this.f15419b = this;
                this.f15420c = i2;
                this.f15421d = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f15419b.i(this.f15420c, this.f15421d);
            }
        });
    }

    @Override // c.f.a.e.a.b.s2
    public final c.f.a.e.a.i.d<ParcelFileDescriptor> c(int i2, String str, String str2, int i3) {
        int i4;
        f15474a.d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i2), str, str2, Integer.valueOf(i3));
        c.f.a.e.a.i.m mVar = new c.f.a.e.a.i.m();
        try {
        } catch (c.f.a.e.a.c.a e2) {
            f15474a.e("getChunkFileDescriptor failed", e2);
            mVar.b(e2);
        } catch (FileNotFoundException e3) {
            f15474a.e("getChunkFileDescriptor failed", e3);
            mVar.b(new c.f.a.e.a.c.a("Asset Slice file not found.", e3));
        }
        for (File file : k(str)) {
            if (c.f.a.e.a.e.m.a(file).equals(str2)) {
                mVar.a(ParcelFileDescriptor.open(file, 268435456));
                return mVar.c();
            }
        }
        throw new c.f.a.e.a.c.a(String.format("Local testing slice for '%s' not found.", str2));
    }

    @Override // c.f.a.e.a.b.s2
    public final c.f.a.e.a.i.d<List<String>> d(Map<String, Long> map) {
        f15474a.d("syncPacks()", new Object[0]);
        return c.f.a.e.a.i.f.a(new ArrayList());
    }

    @Override // c.f.a.e.a.b.s2
    public final void e(List<String> list) {
        f15474a.d("cancelDownload(%s)", list);
    }

    @Override // c.f.a.e.a.b.s2
    public final void g(int i2) {
        f15474a.d("notifySessionFailed", new Object[0]);
    }

    public final /* synthetic */ void h(Intent intent) {
        this.f15477d.a(this.f15479f, intent);
    }

    public final /* synthetic */ void i(int i2, String str) {
        try {
            m(i2, str, 4);
        } catch (c.f.a.e.a.c.a e2) {
            f15474a.e("notifyModuleCompleted failed", e2);
        }
    }

    @Override // c.f.a.e.a.b.s2
    public final void j() {
        f15474a.d("keepAlive", new Object[0]);
    }

    public final File[] k(final String str) throws c.f.a.e.a.c.a {
        File file = new File(this.f15476c);
        if (!file.isDirectory()) {
            throw new c.f.a.e.a.c.a(String.format("Local testing directory '%s' not found.", file));
        }
        File[] fileArrListFiles = file.listFiles(new FilenameFilter(str) { // from class: c.f.a.e.a.b.g1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f15427a;

            {
                this.f15427a = str;
            }

            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return str2.startsWith(String.valueOf(this.f15427a).concat("-")) && str2.endsWith(".apk");
            }
        });
        if (fileArrListFiles == null) {
            throw new c.f.a.e.a.c.a(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        if (fileArrListFiles.length == 0) {
            throw new c.f.a.e.a.c.a(String.format("No APKs available for pack '%s'.", str));
        }
        for (File file2 : fileArrListFiles) {
            if (c.f.a.e.a.e.m.a(file2).equals(str)) {
                return fileArrListFiles;
            }
        }
        throw new c.f.a.e.a.c.a(String.format("No master slice available for pack '%s'.", str));
    }

    public final void m(int i2, String str, int i3) throws c.f.a.e.a.c.a {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f15480g.a());
        bundle.putInt("session_id", i2);
        File[] fileArrK = k(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long length = 0;
        for (File file : fileArrK) {
            length += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i3 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String strA = c.f.a.e.a.e.m.a(file);
            bundle.putParcelableArrayList(c.f.a.e.a.e.d0.b("chunk_intents", str, strA), arrayList2);
            bundle.putString(c.f.a.e.a.e.d0.b("uncompressed_hash_sha256", str, strA), l(file));
            bundle.putLong(c.f.a.e.a.e.d0.b("uncompressed_size", str, strA), file.length());
            arrayList.add(strA);
        }
        bundle.putStringArrayList(c.f.a.e.a.e.d0.a("slice_ids", str), arrayList);
        bundle.putLong(c.f.a.e.a.e.d0.a("pack_version", str), this.f15480g.a());
        bundle.putInt(c.f.a.e.a.e.d0.a("status", str), i3);
        bundle.putInt(c.f.a.e.a.e.d0.a("error_code", str), 0);
        bundle.putLong(c.f.a.e.a.e.d0.a("bytes_downloaded", str), f(i3, length));
        bundle.putLong(c.f.a.e.a.e.d0.a("total_bytes_to_download", str), length);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", f(i3, length));
        bundle.putLong("total_bytes_to_download", length);
        final Intent intentPutExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.f15482i.post(new Runnable(this, intentPutExtra) { // from class: c.f.a.e.a.b.h1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final i1 f15450b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Intent f15451c;

            {
                this.f15450b = this;
                this.f15451c = intentPutExtra;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f15450b.h(this.f15451c);
            }
        });
    }
}
