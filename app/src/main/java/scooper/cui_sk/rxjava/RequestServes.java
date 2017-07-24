package scooper.cui_sk.rxjava;

import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2017/7/19.
 */

public interface RequestServes {
    @GET("index?type=top&key=440c61f7953609d078b7a8843184026e")
    Observable<ResponseBody> getTopMovie(@Query("start") int start, @Query("count") int count);
}
