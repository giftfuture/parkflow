package cn.chinaflame.park.model;

import java.sql.Timestamp;

import com.mysql.jdbc.Blob;

public class Comment {
	public long id = 0;
    public long toid = 0;
    public long uid;
	public String content;
    public int dnd;
    public Timestamp time;
}
