package com.github.kzk.doraemon;

import com.github.kzk.doraemon.module.collector.processor.ZolProcessor;
import us.codecraft.webmagic.Spider;

/**
 * @author: zhaokai
 * @create: 2019-06-05 16:29:10
 */
public class CheckApi {
    public static void main(String[] args) {
        Spider.create(new ZolProcessor()).addUrl("http://www.zol.com.cn/").thread(5).run();
    }

}
