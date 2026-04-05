package c.f.a.b.k3;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import com.google.android.exoplayer2.video.VideoDecoderOutputBuffer;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends GLSurfaceView implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f9531b;

    public static final class a implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final float[] f9532b = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final float[] f9533c = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final float[] f9534d = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String[] f9535e = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FloatBuffer f9536f = c.f.a.b.j3.u.f(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final GLSurfaceView f9537g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int[] f9538h = new int[3];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int[] f9539i = new int[3];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int[] f9540j = new int[3];

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int[] f9541k = new int[3];

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final AtomicReference<VideoDecoderOutputBuffer> f9542l = new AtomicReference<>();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final FloatBuffer[] f9543m = new FloatBuffer[3];

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f9544n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f9545o;
        public VideoDecoderOutputBuffer p;

        public a(GLSurfaceView gLSurfaceView) {
            this.f9537g = gLSurfaceView;
            for (int i2 = 0; i2 < 3; i2++) {
                int[] iArr = this.f9540j;
                this.f9541k[i2] = -1;
                iArr[i2] = -1;
            }
        }

        public void a(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
            VideoDecoderOutputBuffer andSet = this.f9542l.getAndSet(videoDecoderOutputBuffer);
            if (andSet != null) {
                andSet.release();
            }
            this.f9537g.requestRender();
        }

        public final void b() {
            GLES20.glGenTextures(3, this.f9538h, 0);
            for (int i2 = 0; i2 < 3; i2++) {
                GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f9544n, f9535e[i2]), i2);
                GLES20.glActiveTexture(33984 + i2);
                GLES20.glBindTexture(3553, this.f9538h[i2]);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
            }
            c.f.a.b.j3.u.b();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            VideoDecoderOutputBuffer andSet = this.f9542l.getAndSet(null);
            if (andSet == null && this.p == null) {
                return;
            }
            if (andSet != null) {
                VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.p;
                if (videoDecoderOutputBuffer != null) {
                    videoDecoderOutputBuffer.release();
                }
                this.p = andSet;
            }
            VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = (VideoDecoderOutputBuffer) c.f.a.b.j3.g.e(this.p);
            float[] fArr = f9533c;
            int i2 = videoDecoderOutputBuffer2.colorspace;
            if (i2 == 1) {
                fArr = f9532b;
            } else if (i2 == 3) {
                fArr = f9534d;
            }
            GLES20.glUniformMatrix3fv(this.f9545o, 1, false, fArr, 0);
            int[] iArr = (int[]) c.f.a.b.j3.g.e(videoDecoderOutputBuffer2.yuvStrides);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) c.f.a.b.j3.g.e(videoDecoderOutputBuffer2.yuvPlanes);
            int i3 = 0;
            while (i3 < 3) {
                int i4 = i3 == 0 ? videoDecoderOutputBuffer2.height : (videoDecoderOutputBuffer2.height + 1) / 2;
                GLES20.glActiveTexture(33984 + i3);
                GLES20.glBindTexture(3553, this.f9538h[i3]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i3], i4, 0, 6409, 5121, byteBufferArr[i3]);
                i3++;
            }
            int i5 = (iArr[0] + 1) / 2;
            int[] iArr2 = {videoDecoderOutputBuffer2.width, i5, i5};
            for (int i6 = 0; i6 < 3; i6++) {
                if (this.f9540j[i6] != iArr2[i6] || this.f9541k[i6] != iArr[i6]) {
                    c.f.a.b.j3.g.g(iArr[i6] != 0);
                    float f2 = iArr2[i6] / iArr[i6];
                    this.f9543m[i6] = c.f.a.b.j3.u.f(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f2, 0.0f, f2, 1.0f});
                    GLES20.glVertexAttribPointer(this.f9539i[i6], 2, 5126, false, 0, (Buffer) this.f9543m[i6]);
                    this.f9540j[i6] = iArr2[i6];
                    this.f9541k[i6] = iArr[i6];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            c.f.a.b.j3.u.b();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
            GLES20.glViewport(0, 0, i2, i3);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int iC = c.f.a.b.j3.u.c("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f9544n = iC;
            GLES20.glUseProgram(iC);
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f9544n, "in_pos");
            GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
            GLES20.glVertexAttribPointer(iGlGetAttribLocation, 2, 5126, false, 0, (Buffer) f9536f);
            this.f9539i[0] = GLES20.glGetAttribLocation(this.f9544n, "in_tc_y");
            GLES20.glEnableVertexAttribArray(this.f9539i[0]);
            this.f9539i[1] = GLES20.glGetAttribLocation(this.f9544n, "in_tc_u");
            GLES20.glEnableVertexAttribArray(this.f9539i[1]);
            this.f9539i[2] = GLES20.glGetAttribLocation(this.f9544n, "in_tc_v");
            GLES20.glEnableVertexAttribArray(this.f9539i[2]);
            c.f.a.b.j3.u.b();
            this.f9545o = GLES20.glGetUniformLocation(this.f9544n, "mColorConversion");
            c.f.a.b.j3.u.b();
            b();
            c.f.a.b.j3.u.b();
        }
    }

    public v(Context context) {
        this(context, null);
    }

    public v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f9531b = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public x getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    @Override // c.f.a.b.k3.x
    public void setOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        this.f9531b.a(videoDecoderOutputBuffer);
    }
}
