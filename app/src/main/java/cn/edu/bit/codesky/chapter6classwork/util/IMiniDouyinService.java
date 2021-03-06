package cn.edu.bit.codesky.chapter6classwork.util;

import cn.edu.bit.codesky.chapter6classwork.beans.FeedResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @author Xavier.S
 * @date 2019.01.17 20:38
 */
public interface IMiniDouyinService {

    // Implement your MiniDouyin Feed Request here, url: http://10.108.10.39:8080/minidouyin/feed
    @GET("minidouyin/feed")
    Call<FeedResponse> feed();
}
