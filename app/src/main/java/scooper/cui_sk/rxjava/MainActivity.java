package scooper.cui_sk.rxjava;

import android.app.Activity;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.TextureView;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView tt;
    private Camera mCamera;
    private TextureView myTexture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         *           最基本RXjava使用   Observable   Subscriber的使用
         */
//        Observable<String> oo=Observable.create(new Observable.OnSubscribe<String>() {
//            @Override
//            public void call(Subscriber<? super String> o) {
//                 o.onNext("你好好好");
//            }
//        });
//        Subscriber<String> mySubscriber=new Subscriber<String>() {
//            @Override
//            public void onCompleted() {
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onNext(String s) {
//                     tt.setText(s.toString());
//            }
//        };
//        oo.subscribe(mySubscriber);
/**
 *           io线程加载，主线程显示数据
 */

//        Observable.just("111","ddd","你好")
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Action1<String>() {
//            @Override
//            public void call(String s) {
//                tt.setText(s);
//            }
//        });
/**
 *           map()相关 ，实现类型转换
 */
//        Observable.just(1)
//                .map(new Func1<Integer, String>() {
//                    @Override
//                    public String call(Integer integer) {
//                        return "hello";
//                    }
//                })
//                .subscribe(new Action1<String>() {
//                    @Override
//                    public void call(String s) {
//
//                        tt.setText(s.toString());
//                    }
//                });
    }

//    Retrofit retrofit = new Retrofit.Builder()
//            .baseUrl("http://v.juhe.cn/toutiao/")
//            //增加返回值为String的支持
//            .addConverterFactory(ScalarsConverterFactory.create())
//            //增加返回值为Gson的支持(以实体类返回)
//            .addConverterFactory(GsonConverterFactory.create())
//            //增加返回值为Oservable<T>的支持
//            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//            .build();
//    RequestServes serves = retrofit.create(RequestServes.class);
//
//
//    @Override
//    public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
//        mCamera = Camera.open();
//        Camera.Size previewSize = mCamera.getParameters().getPreviewSize();
//        myTexture.setLayoutParams(new FrameLayout.LayoutParams(
//                previewSize.width, previewSize.height, Gravity.CENTER));
//        try {
//            mCamera.setPreviewTexture(surface);
//        } catch (IOException t) {
//        }
//        mCamera.startPreview();
//        myTexture.setAlpha(1.0f);
//        myTexture.setRotation(90.0f);
//    }
//
//    @Override
//    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
//
//    }
//
//    @Override
//    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
//        mCamera.stopPreview();
//        mCamera.release();
//        return true;
//    }
//
//    @Override
//    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
//
//    }
}
