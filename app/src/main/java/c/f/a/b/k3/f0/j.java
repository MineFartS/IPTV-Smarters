package c.f.a.b.k3.f0;

import android.opengl.GLES20;
import c.f.a.b.j3.u;
import c.f.a.b.k3.f0.h;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f9404a = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f9405b = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f9406c = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f9407d = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f9408e = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float[] f9409f = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float[] f9410g = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f9412i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f9413j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9414k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9415l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9417n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9418o;
    public int p;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FloatBuffer f9420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FloatBuffer f9421c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f9422d;

        public a(h.b bVar) {
            this.f9419a = bVar.a();
            this.f9420b = u.f(bVar.f9402c);
            this.f9421c = u.f(bVar.f9403d);
            int i2 = bVar.f9401b;
            this.f9422d = i2 != 1 ? i2 != 2 ? 4 : 6 : 5;
        }
    }

    public static boolean c(h hVar) {
        h.a aVar = hVar.f9395a;
        h.a aVar2 = hVar.f9396b;
        return aVar.b() == 1 && aVar.a(0).f9400a == 0 && aVar2.b() == 1 && aVar2.a(0).f9400a == 0;
    }

    public void a(int i2, float[] fArr, boolean z) {
        a aVar = z ? this.f9413j : this.f9412i;
        if (aVar == null) {
            return;
        }
        GLES20.glUseProgram(this.f9414k);
        u.b();
        GLES20.glEnableVertexAttribArray(this.f9417n);
        GLES20.glEnableVertexAttribArray(this.f9418o);
        u.b();
        int i3 = this.f9411h;
        GLES20.glUniformMatrix3fv(this.f9416m, 1, false, i3 == 1 ? z ? f9408e : f9407d : i3 == 2 ? z ? f9410g : f9409f : f9406c, 0);
        GLES20.glUniformMatrix4fv(this.f9415l, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i2);
        GLES20.glUniform1i(this.p, 0);
        u.b();
        GLES20.glVertexAttribPointer(this.f9417n, 3, 5126, false, 12, (Buffer) aVar.f9420b);
        u.b();
        GLES20.glVertexAttribPointer(this.f9418o, 2, 5126, false, 8, (Buffer) aVar.f9421c);
        u.b();
        GLES20.glDrawArrays(aVar.f9422d, 0, aVar.f9419a);
        u.b();
        GLES20.glDisableVertexAttribArray(this.f9417n);
        GLES20.glDisableVertexAttribArray(this.f9418o);
    }

    public void b() {
        int iD = u.d(f9404a, f9405b);
        this.f9414k = iD;
        this.f9415l = GLES20.glGetUniformLocation(iD, "uMvpMatrix");
        this.f9416m = GLES20.glGetUniformLocation(this.f9414k, "uTexMatrix");
        this.f9417n = GLES20.glGetAttribLocation(this.f9414k, "aPosition");
        this.f9418o = GLES20.glGetAttribLocation(this.f9414k, "aTexCoords");
        this.p = GLES20.glGetUniformLocation(this.f9414k, "uTexture");
    }

    public void d(h hVar) {
        if (c(hVar)) {
            this.f9411h = hVar.f9397c;
            a aVar = new a(hVar.f9395a.a(0));
            this.f9412i = aVar;
            if (!hVar.f9398d) {
                aVar = new a(hVar.f9396b.a(0));
            }
            this.f9413j = aVar;
        }
    }
}
