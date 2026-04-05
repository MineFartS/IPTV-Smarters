package a.y.e;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f3974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f3975b = new a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3976a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3978c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3979d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3980e;

        public void a(int i2) {
            this.f3976a = i2 | this.f3976a;
        }

        public boolean b() {
            int i2 = this.f3976a;
            if ((i2 & 7) != 0 && (i2 & (c(this.f3979d, this.f3977b) << 0)) == 0) {
                return false;
            }
            int i3 = this.f3976a;
            if ((i3 & 112) != 0 && (i3 & (c(this.f3979d, this.f3978c) << 4)) == 0) {
                return false;
            }
            int i4 = this.f3976a;
            if ((i4 & 1792) != 0 && (i4 & (c(this.f3980e, this.f3977b) << 8)) == 0) {
                return false;
            }
            int i5 = this.f3976a;
            return (i5 & 28672) == 0 || (i5 & (c(this.f3980e, this.f3978c) << 12)) != 0;
        }

        public int c(int i2, int i3) {
            if (i2 > i3) {
                return 1;
            }
            return i2 == i3 ? 2 : 4;
        }

        public void d() {
            this.f3976a = 0;
        }

        public void e(int i2, int i3, int i4, int i5) {
            this.f3977b = i2;
            this.f3978c = i3;
            this.f3979d = i4;
            this.f3980e = i5;
        }
    }

    public interface b {
        View a(int i2);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    public r(b bVar) {
        this.f3974a = bVar;
    }

    public View a(int i2, int i3, int i4, int i5) {
        int iC = this.f3974a.c();
        int iD = this.f3974a.d();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View viewA = this.f3974a.a(i2);
            this.f3975b.e(iC, iD, this.f3974a.b(viewA), this.f3974a.e(viewA));
            if (i4 != 0) {
                this.f3975b.d();
                this.f3975b.a(i4);
                if (this.f3975b.b()) {
                    return viewA;
                }
            }
            if (i5 != 0) {
                this.f3975b.d();
                this.f3975b.a(i5);
                if (this.f3975b.b()) {
                    view = viewA;
                }
            }
            i2 += i6;
        }
        return view;
    }

    public boolean b(View view, int i2) {
        this.f3975b.e(this.f3974a.c(), this.f3974a.d(), this.f3974a.b(view), this.f3974a.e(view));
        if (i2 == 0) {
            return false;
        }
        this.f3975b.d();
        this.f3975b.a(i2);
        return this.f3975b.b();
    }
}
