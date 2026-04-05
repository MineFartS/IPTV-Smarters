package c.h.a.l.a;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import minefarts.iptvsmarters.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c.h.a.l.b.b.a f17934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public File f17935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InputStream f17936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f17937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17938e;

    public a(Context context, File file, c.h.a.l.b.b.a aVar) {
        this.f17935b = file;
        this.f17937d = context;
        String name = file.getName();
        this.f17938e = name;
        if (name != null && name.endsWith(".zip")) {
            this.f17938e = this.f17938e.replaceAll(".zip", BuildConfig.FLAVOR);
        }
        a(BuildConfig.FLAVOR);
        f17934a = aVar;
    }

    public final void a(String str) {
        File file = new File(str);
        Log.i("UNZIPUTIL", "creating dir " + str);
        if (str.length() < 0 || file.isDirectory()) {
            return;
        }
        file.mkdirs();
    }

    public void b() {
        File file;
        if (!new c.h.a.k.d.a.a(this.f17937d).A().equals(c.h.a.h.n.a.s0)) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                file = new File(this.f17937d.getFilesDir() + "/VPNIPTVSmarters/" + this.f17938e);
            } else if (i2 >= 19) {
                file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNIPTVSmarters/" + this.f17938e);
            } else {
                file = new File(Environment.getExternalStorageDirectory() + "/Documents", "VPNIPTVSmarters/" + this.f17938e);
            }
        } else if (Build.VERSION.SDK_INT >= 19) {
            file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNIPTVSmarters/" + this.f17938e);
        } else {
            file = new File(Environment.getExternalStorageDirectory() + "/Documents", "VPNIPTVSmarters/" + this.f17938e);
        }
        try {
            a(String.valueOf(file));
            Log.i("UNZIPUTIL", "Starting to unzip");
            InputStream fileInputStream = this.f17936c;
            if (fileInputStream == null) {
                fileInputStream = new FileInputStream(this.f17935b);
            }
            ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    f17934a.P(String.valueOf(file));
                    Log.i("UNZIPUTIL", "Finished unzip");
                    return;
                }
                Log.v("UNZIPUTIL", "Unzipping " + nextEntry.getName());
                if (!nextEntry.isDirectory()) {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(file, nextEntry.getName()));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i3 = zipInputStream.read(bArr);
                        if (i3 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i3);
                        fileOutputStream.write(byteArrayOutputStream.toByteArray());
                        byteArrayOutputStream.reset();
                    }
                    fileOutputStream.close();
                    zipInputStream.closeEntry();
                }
            }
        } catch (Exception e2) {
            Log.e("UNZIPUTIL", "Unzip Error", e2);
            f17934a.Q(this.f17937d.getResources().getString(R.string.something_wrong));
            f17934a.P(String.valueOf(file));
        }
    }
}
