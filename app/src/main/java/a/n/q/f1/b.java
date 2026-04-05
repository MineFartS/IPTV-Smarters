package a.n.q.f1;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence[] f2804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2805e;

    public int a() {
        return (this.f2803c - this.f2802b) + 1;
    }

    public int b() {
        return this.f2801a;
    }

    public CharSequence c(int i2) {
        CharSequence[] charSequenceArr = this.f2804d;
        return charSequenceArr == null ? String.format(this.f2805e, Integer.valueOf(i2)) : charSequenceArr[i2];
    }

    public int d() {
        return this.f2803c;
    }

    public int e() {
        return this.f2802b;
    }

    public void f(int i2) {
        this.f2801a = i2;
    }

    public void g(String str) {
        this.f2805e = str;
    }

    public void h(int i2) {
        this.f2803c = i2;
    }

    public void i(int i2) {
        this.f2802b = i2;
    }

    public void j(CharSequence[] charSequenceArr) {
        this.f2804d = charSequenceArr;
    }
}
