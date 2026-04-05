package c.k.b;

import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f18663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f18664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f18665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f18666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f18667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f18668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f18670n;

    public b0(int i2, int i3, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i4, int i5, int i6, long j10) {
        this.f18657a = i2;
        this.f18658b = i3;
        this.f18659c = j2;
        this.f18660d = j3;
        this.f18661e = j4;
        this.f18662f = j5;
        this.f18663g = j6;
        this.f18664h = j7;
        this.f18665i = j8;
        this.f18666j = j9;
        this.f18667k = i4;
        this.f18668l = i5;
        this.f18669m = i6;
        this.f18670n = j10;
    }

    public void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f18657a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f18658b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f18658b / this.f18657a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f18659c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f18660d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f18667k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f18661e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f18664h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f18668l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f18662f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f18669m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f18663g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f18665i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f18666j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f18657a + ", size=" + this.f18658b + ", cacheHits=" + this.f18659c + ", cacheMisses=" + this.f18660d + ", downloadCount=" + this.f18667k + ", totalDownloadSize=" + this.f18661e + ", averageDownloadSize=" + this.f18664h + ", totalOriginalBitmapSize=" + this.f18662f + ", totalTransformedBitmapSize=" + this.f18663g + ", averageOriginalBitmapSize=" + this.f18665i + ", averageTransformedBitmapSize=" + this.f18666j + ", originalBitmapCount=" + this.f18668l + ", transformedBitmapCount=" + this.f18669m + ", timeStamp=" + this.f18670n + '}';
    }
}
