package d.a.a.d;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.model.InstructionFileId;
import minefarts.iptvsmarters.R;
import de.blinkt.openvpn.core.NativeUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class y {
    public static String[] a(Context context) {
        Vector vector = new Vector();
        vector.add(g(context));
        vector.add("--config");
        vector.add(b(context));
        return (String[]) vector.toArray(new String[0]);
    }

    public static String b(Context context) {
        return context.getCacheDir().getAbsolutePath() + "/android.conf";
    }

    public static String c() {
        return Build.VERSION.SDK_INT >= 16 ? "pie_openvpn" : "nopie_openvpn";
    }

    @TargetApi(21)
    public static String[] d() {
        return Build.SUPPORTED_ABIS;
    }

    public static String[] e(String[] strArr) {
        strArr[0] = strArr[0].replace("pie_openvpn", "nopie_openvpn");
        return strArr;
    }

    public static void f(d.a.a.a aVar, Context context) {
        Intent intentN = aVar.N(context);
        if (intentN != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intentN);
            } else {
                context.startService(intentN);
            }
        }
    }

    public static String g(Context context) {
        String strA = NativeUtils.a();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new File(context.getApplicationInfo().nativeLibraryDir, "libovpnexec.so").getPath();
        }
        String[] strArrD = i2 >= 21 ? d() : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
        if (!strA.equals(strArrD[0])) {
            z.y(R.string.abi_mismatch, Arrays.toString(strArrD), strA);
            strArrD = new String[]{strA};
        }
        for (String str : strArrD) {
            File file = new File(context.getCacheDir(), "c_" + c() + InstructionFileId.DOT + str);
            if ((file.exists() && file.canExecute()) || h(context, str, file)) {
                return file.getPath();
            }
        }
        throw new RuntimeException("Cannot find any executable for this device's ABIs " + Arrays.toString(strArrD));
    }

    public static boolean h(Context context, String str, File file) {
        try {
            try {
                InputStream inputStreamOpen = context.getAssets().open(c() + InstructionFileId.DOT + str);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[ProgressEvent.PART_FAILED_EVENT_CODE];
                while (true) {
                    int i2 = inputStreamOpen.read(bArr);
                    if (i2 <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i2);
                }
                fileOutputStream.close();
                if (file.setExecutable(true)) {
                    return true;
                }
                z.p("Failed to make OpenVPN executable");
                return false;
            } catch (IOException unused) {
                z.u("Failed getting assets for archicture " + str);
                return false;
            }
        } catch (IOException e2) {
            z.r(e2);
            return false;
        }
    }
}
