package c.f.a.b.t2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import c.f.a.b.j3.x0;
import c.f.b.b.t;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f10165a = new q(new int[]{2}, 8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f10166b = new q(new int[]{2, 5, 6}, 8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f10167c = {5, 6, 18, 17, 14, 7, 8};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f10168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10169e;

    public static final class a {
        public static int[] a() {
            t.a aVarB = c.f.b.b.t.B();
            for (int i2 : q.f10167c) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i2).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    aVarB.d(Integer.valueOf(i2));
                }
            }
            aVarB.d(2);
            return c.f.b.f.c.j(aVarB.e());
        }
    }

    public q(int[] iArr, int i2) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f10168d = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f10168d = new int[0];
        }
        this.f10169e = i2;
    }

    public static boolean b() {
        if (x0.f9296a >= 17) {
            String str = x0.f9298c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static q c(Context context) {
        return d(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    public static q d(Context context, Intent intent) {
        return (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) ? f10166b : (x0.f9296a < 29 || !x0.v0(context)) ? (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f10165a : new q(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : new q(a.a(), 8);
    }

    public int e() {
        return this.f10169e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Arrays.equals(this.f10168d, qVar.f10168d) && this.f10169e == qVar.f10169e;
    }

    public boolean f(int i2) {
        return Arrays.binarySearch(this.f10168d, i2) >= 0;
    }

    public int hashCode() {
        return this.f10169e + (Arrays.hashCode(this.f10168d) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f10169e + ", supportedEncodings=" + Arrays.toString(this.f10168d) + "]";
    }
}
