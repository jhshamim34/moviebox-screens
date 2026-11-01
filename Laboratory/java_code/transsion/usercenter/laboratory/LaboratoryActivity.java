package com.transsion.usercenter.laboratory;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.AppCompatTextView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.cloud.tmc.launcherlib.LauncherMiniAppConfigHelper;
import com.meituan.android.walle.ChannelReader;
import com.transsion.ad.test.TestAdActivity;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.mbwidget.data.SportWidgetDataManager;
import com.transsion.mbwidget.data.WidgetRefreshWorker;
import com.transsion.push.PushTestActivity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: source.java */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/transsion/usercenter/laboratory/LaboratoryActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Lux/f;", "<init>", "()V", "", "z0", "()Z", "y0", "()Lux/f;", "isStatusDark", "isTranslucent", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "T0", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "UserCenter_psRelease"}, k = 1, mv = {2, 1, 0}, xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: classes8.dex */
public final class LaboratoryActivity extends BaseActivity<ux.f> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(LaboratoryActivity laboratoryActivity, View view) {
        laboratoryActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(LaboratoryActivity laboratoryActivity, View view) {
        new LabLaneDialog().o0(laboratoryActivity, "lane");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(LaboratoryActivity laboratoryActivity, View view) {
        new LabWebTestDialog().o0(laboratoryActivity, "webTest");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(LaboratoryActivity laboratoryActivity, View view) {
        laboratoryActivity.startActivity(new Intent(laboratoryActivity, (Class<?>) PushTestActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(View view) {
        com.tn.lib.widget.toast.core.h.f41044a.l("Refresh Widget + 体育Widget强制刷新");
        WidgetRefreshWorker.INSTANCE.a();
        SportWidgetDataManager.f47267a.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(LaboratoryActivity laboratoryActivity, View view) {
        new LabLocationDialog().o0(laboratoryActivity, RequestParameters.SUBRESOURCE_LOCATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(LaboratoryActivity laboratoryActivity, View view) {
        laboratoryActivity.startActivity(new Intent(laboratoryActivity, (Class<?>) LabMiniAppSDKTestActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H0(LaboratoryActivity laboratoryActivity, View view) {
        new LabFpsDialog().o0(laboratoryActivity, LauncherMiniAppConfigHelper.KEY_FPS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I0(LaboratoryActivity laboratoryActivity, View view) {
        TestAdActivity.INSTANCE.a(laboratoryActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(LaboratoryActivity laboratoryActivity, View view) {
        new LabContentModeDialog().o0(laboratoryActivity, "LabContentModeDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(LaboratoryActivity laboratoryActivity, View view) {
        new LabPipModeDialog().o0(laboratoryActivity, "pipMode");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(LaboratoryActivity laboratoryActivity, View view) {
        new LabPhoneBrandDialog().o0(laboratoryActivity, "brand");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(LaboratoryActivity laboratoryActivity, View view) {
        new LabInfoDialog().o0(laboratoryActivity, "info");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N0(LaboratoryActivity laboratoryActivity, View view) {
        laboratoryActivity.startActivity(new Intent(laboratoryActivity, (Class<?>) MccActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O0(LaboratoryActivity laboratoryActivity, View view) {
        new LabChannelDialog().o0(laboratoryActivity, ChannelReader.CHANNEL_KEY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P0(LaboratoryActivity laboratoryActivity, View view) {
        new LabStreamingDialog().o0(laboratoryActivity, "stream");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q0(LaboratoryActivity laboratoryActivity, View view) {
        new LabHttpHostDialog().o0(laboratoryActivity, "host");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R0(LaboratoryActivity laboratoryActivity, View view) {
        com.tn.lib.widget.toast.core.h.f41044a.l("Cold start coming");
        kotlinx.coroutines.k.d(androidx.view.v.a(laboratoryActivity), null, null, new LaboratoryActivity$onCreate$9$1(laboratoryActivity, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S0(View view) {
        com.tn.lib.widget.toast.core.h.f41044a.l("js调试ON 当次进程有效");
        WebView.setWebContentsDebuggingEnabled(true);
    }

    private final boolean z0() {
        if (Build.VERSION.SDK_INT >= 26 && getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T0(android.content.Context r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.transsion.usercenter.laboratory.LaboratoryActivity$restartApp$1
            if (r0 == 0) goto L13
            r0 = r6
            com.transsion.usercenter.laboratory.LaboratoryActivity$restartApp$1 r0 = (com.transsion.usercenter.laboratory.LaboratoryActivity$restartApp$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.transsion.usercenter.laboratory.LaboratoryActivity$restartApp$1 r0 = new com.transsion.usercenter.laboratory.LaboratoryActivity$restartApp$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            android.content.Context r5 = (android.content.Context) r5
            kotlin.ResultKt.b(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r6)
            r0.L$0 = r5
            r0.label = r3
            r2 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r6 = kotlinx.coroutines.u0.a(r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            com.transsion.baselib.report.l r6 = com.transsion.baselib.report.l.f42928a
            r6.l()
            android.content.pm.PackageManager r6 = r5.getPackageManager()
            java.lang.String r0 = r5.getPackageName()
            android.content.Intent r6 = r6.getLaunchIntentForPackage(r0)
            kotlin.jvm.internal.Intrinsics.e(r6)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r6.addFlags(r0)
            r5.startActivity(r6)
            int r5 = android.os.Process.myPid()
            android.os.Process.killProcess(r5)
            r5 = 0
            java.lang.System.exit(r5)
            kotlin.Unit r5 = kotlin.Unit.f69817a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.usercenter.laboratory.LaboratoryActivity.T0(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.transsion.baselib.report.launch.b.f42939a.b().putBoolean("k_lab_info_header", true);
        eh.b.f63812a.b("X-Lab-Info", "1");
        ((ux.f) getMViewBinding()).f80186b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.A0(LaboratoryActivity.this, view);
            }
        });
        ((ux.f) getMViewBinding()).f80195k.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.B0(LaboratoryActivity.this, view);
            }
        });
        ((ux.f) getMViewBinding()).f80200p.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.L0(LaboratoryActivity.this, view);
            }
        });
        ((ux.f) getMViewBinding()).f80187c.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.M0(LaboratoryActivity.this, view);
            }
        });
        ((ux.f) getMViewBinding()).f80193i.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.N0(LaboratoryActivity.this, view);
            }
        });
        ((ux.f) getMViewBinding()).f80188d.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.O0(LaboratoryActivity.this, view);
            }
        });
        ((ux.f) getMViewBinding()).f80201q.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.P0(LaboratoryActivity.this, view);
            }
        });
        ((ux.f) getMViewBinding()).f80192h.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.Q0(LaboratoryActivity.this, view);
            }
        });
        ((ux.f) getMViewBinding()).f80194j.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.R0(LaboratoryActivity.this, view);
            }
        });
        ((ux.f) getMViewBinding()).f80190f.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.S0(view);
            }
        });
        ((ux.f) getMViewBinding()).f80203s.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.C0(LaboratoryActivity.this, view);
            }
        });
        ((ux.f) getMViewBinding()).f80198n.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.D0(LaboratoryActivity.this, view);
            }
        });
        ((ux.f) getMViewBinding()).f80204t.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.E0(view);
            }
        });
        ((ux.f) getMViewBinding()).f80196l.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.F0(LaboratoryActivity.this, view);
            }
        });
        ((ux.f) getMViewBinding()).f80197m.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.G0(LaboratoryActivity.this, view);
            }
        });
        ((ux.f) getMViewBinding()).f80191g.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.H0(LaboratoryActivity.this, view);
            }
        });
        ((ux.f) getMViewBinding()).f80202r.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.I0(LaboratoryActivity.this, view);
            }
        });
        ((ux.f) getMViewBinding()).f80189e.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LaboratoryActivity.J0(LaboratoryActivity.this, view);
            }
        });
        if (z0()) {
            AppCompatTextView tvPipMode = ((ux.f) getMViewBinding()).f80199o;
            Intrinsics.g(tvPipMode, "tvPipMode");
            pg.c.k(tvPipMode);
            ((ux.f) getMViewBinding()).f80199o.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.f1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LaboratoryActivity.K0(LaboratoryActivity.this, view);
                }
            });
            return;
        }
        AppCompatTextView tvPipMode2 = ((ux.f) getMViewBinding()).f80199o;
        Intrinsics.g(tvPipMode2, "tvPipMode");
        pg.c.g(tvPipMode2);
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public ux.f getViewBinding() {
        ux.f c11 = ux.f.c(getLayoutInflater());
        Intrinsics.g(c11, "inflate(...)");
        return c11;
    }
}
