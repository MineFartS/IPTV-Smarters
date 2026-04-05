package c.h.a.l.a;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c.h.a.l.b.b.a f17939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public File f17940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InputStream f17941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f17942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17944f = BuildConfig.FLAVOR;

    public b(Context context, File file, c.h.a.l.b.b.a aVar) {
        this.f17943e = BuildConfig.FLAVOR;
        this.f17940b = file;
        String name = file.getName();
        this.f17943e = name;
        if (name != null && name.endsWith(".zip")) {
            this.f17943e = this.f17943e.replaceAll(".zip", BuildConfig.FLAVOR);
        }
        this.f17942d = context;
        a(BuildConfig.FLAVOR);
        f17939a = aVar;
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
        try {
            if (!new c.h.a.k.d.a.a(this.f17942d).A().equals(c.h.a.h.n.a.s0)) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23) {
                    file = new File(this.f17942d.getFilesDir() + "/VPNIPTVSmarters/" + this.f17943e);
                } else if (i2 >= 19) {
                    file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNIPTVSmarters/" + this.f17943e);
                } else {
                    file = new File(Environment.getExternalStorageDirectory() + "/Documents", "VPNIPTVSmarters/" + this.f17943e);
                }
            } else if (Build.VERSION.SDK_INT >= 19) {
                file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNIPTVSmarters/" + this.f17943e);
            } else {
                file = new File(Environment.getExternalStorageDirectory() + "/Documents", "VPNIPTVSmarters/" + this.f17943e);
            }
            a(String.valueOf(file));
            Log.i("UNZIPUTIL", "Starting to unzip");
            InputStream fileInputStream = this.f17941c;
            if (fileInputStream == null) {
                fileInputStream = new FileInputStream(this.f17940b);
            }
            ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    f17939a.P(String.valueOf(file));
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
            f17939a.Q("failed to Extract zip file ");
        }
    }
}
