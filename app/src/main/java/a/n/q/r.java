package a.n.q;

import a.n.q.k;
import a.n.q.q;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Rect f2902a = new Rect();

    public static int a(View view, q.a aVar, int i2) {
        View viewFindViewById;
        int iR;
        k.e eVar = (k.e) view.getLayoutParams();
        int i3 = aVar.f2896a;
        if (i3 == 0 || (viewFindViewById = view.findViewById(i3)) == null) {
            viewFindViewById = view;
        }
        int iL = aVar.f2898c;
        if (i2 != 0) {
            if (aVar.f2900e) {
                float f2 = aVar.f2899d;
                if (f2 == 0.0f) {
                    iL += viewFindViewById.getPaddingTop();
                } else if (f2 == 100.0f) {
                    iL -= viewFindViewById.getPaddingBottom();
                }
            }
            if (aVar.f2899d != -1.0f) {
                iL += (int) (((viewFindViewById == view ? eVar.l(viewFindViewById) : viewFindViewById.getHeight()) * aVar.f2899d) / 100.0f);
            }
            if (view != viewFindViewById) {
                Rect rect = f2902a;
                rect.top = iL;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect);
                iR = f2902a.top - eVar.r();
            } else {
                iR = iL;
            }
            return aVar.e() ? iR + viewFindViewById.getBaseline() : iR;
        }
        if (view.getLayoutDirection() == 1) {
            int iS = (viewFindViewById == view ? eVar.s(viewFindViewById) : viewFindViewById.getWidth()) - iL;
            if (aVar.f2900e) {
                float f3 = aVar.f2899d;
                if (f3 == 0.0f) {
                    iS -= viewFindViewById.getPaddingRight();
                } else if (f3 == 100.0f) {
                    iS += viewFindViewById.getPaddingLeft();
                }
            }
            if (aVar.f2899d != -1.0f) {
                iS -= (int) (((viewFindViewById == view ? eVar.s(viewFindViewById) : viewFindViewById.getWidth()) * aVar.f2899d) / 100.0f);
            }
            if (view == viewFindViewById) {
                return iS;
            }
            Rect rect2 = f2902a;
            rect2.right = iS;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect2);
            return f2902a.right + eVar.p();
        }
        if (aVar.f2900e) {
            float f4 = aVar.f2899d;
            if (f4 == 0.0f) {
                iL += viewFindViewById.getPaddingLeft();
            } else if (f4 == 100.0f) {
                iL -= viewFindViewById.getPaddingRight();
            }
        }
        if (aVar.f2899d != -1.0f) {
            iL += (int) (((viewFindViewById == view ? eVar.s(viewFindViewById) : viewFindViewById.getWidth()) * aVar.f2899d) / 100.0f);
        }
        int i4 = iL;
        if (view == viewFindViewById) {
            return i4;
        }
        Rect rect3 = f2902a;
        rect3.left = i4;
        ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect3);
        return f2902a.left - eVar.n();
    }
}
