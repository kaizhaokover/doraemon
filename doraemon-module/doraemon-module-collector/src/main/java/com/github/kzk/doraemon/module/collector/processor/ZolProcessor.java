package com.github.kzk.doraemon.module.collector.processor;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;
import us.codecraft.webmagic.selector.Selectable;

import java.util.List;

/**
 * @author: zhaokai
 * @create: 2019-06-05 16:27:21
 */
public class ZolProcessor implements PageProcessor {
    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(10000);
    @Override
    public void process(Page page) {
        Html html = page.getHtml();
        Selectable links = html.links().regex("^http.*://.*\\.zol\\.com\\.cn.*\\.html\\.*$");



        links.all().forEach(System.out::println);

        page.addTargetRequests(links.all());
    }

    @Override
    public Site getSite() {
        return site;
    }
}
