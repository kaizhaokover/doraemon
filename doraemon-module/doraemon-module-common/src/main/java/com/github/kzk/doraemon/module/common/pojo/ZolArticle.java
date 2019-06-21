package com.github.kzk.doraemon.module.common.pojo;

/**
 * @author: zhaokai
 * @create: 2019-06-05 17:13:29
 */
public class ZolArticle {


    private String title;
    private String writer;
    private String editor;
    private String type;
    private String content;
    private String updateTime;


    @Override
    public String toString() {
        return "ZolArticle{" +
                "title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", editor='" + editor + '\'' +
                ", type='" + type + '\'' +
                ", content='" + content + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
